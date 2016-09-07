package algorithms.RemoveElement;

/**
 * Created by fisbii on 16-9-7.
 */
public class Solution {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        int length = nums.length;
        while(i < j){
            if(nums[i] == val){
                while(nums[j] == val && i < j){
                    j--;
                }
                swap(i,j,nums);
            }
            i++;
        }
        int count = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == val){
                count++;
            }
        }
        return length-count;
    }

    public static void swap(int i,int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String args[]){
        int[] nums = {3,2,2,3};
        for(int i = 0; i < removeElement(nums,3); i++){
            System.out.println(nums[i]);
        }
    }
}

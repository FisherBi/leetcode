package algorithms.RotateArray;

/**
 * Created by fisbii on 16-8-4.
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] nums,int strat,int end){
        while(end > strat){
            int t = nums[strat];
            nums[strat] = nums[end];
            nums[end] = t;
            strat++;
            end--;
        }
    }

    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

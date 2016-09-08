package algorithms.RemoveDuplicatesFromSortedArray;

/**
 * Created by fisbii on 16-9-8.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        int len = nums.length;
        int count = 0;
        while(i < len && j < len){
            if(i == 0){
                nums[j] = nums[i];
                i++;
                j++;
            }else{
                if(nums[i] == nums[j-1]){
                    i++;
                    count++;
                }else{
                    nums[j++] = nums[i++];
                }
            }
        }
        return len-count;
    }
}

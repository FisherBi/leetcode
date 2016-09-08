package algorithms.TwoSum;

/**
 * Created by fisbii on 16-9-8.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(i == j) continue;
                if(nums[i] + nums[j] == target){
                    int[] res = {i,j};
                    return res;
                }
            }
        }
        return null;
    }
}

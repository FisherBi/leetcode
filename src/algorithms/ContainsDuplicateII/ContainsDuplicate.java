package algorithms.ContainsDuplicateII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by fisbii on 16-7-26.
 */
public class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> numSet = new HashSet<>();
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            if(!numSet.contains(nums[i])){
                numSet.add(nums[i]);
                end++;
            }else return true;

            if(end - start > k){
                numSet.remove(nums[start]);
                start++;
            }
        }
        return false;
    }
}

package algorithms.MajorityElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fisbii on 16-8-6.
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int max = 0;
        int maxValue = 0;
        for(Map.Entry<Integer, Integer> count : map.entrySet()){
            if(max < count.getValue()){
                max = count.getValue();
                maxValue = count.getKey();
            }
        }
        return maxValue;
    }

    public static void main(String args[]){
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}

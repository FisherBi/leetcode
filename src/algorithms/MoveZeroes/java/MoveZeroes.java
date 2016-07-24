package algorithms.MoveZeroes.java;

/**
 * Created by FisherBi on 2016/7/22.
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j++] = nums[i];
                    nums[j] = 0;
                }else {
                    i++;
                }
            }
            i++;
        }
    }
}

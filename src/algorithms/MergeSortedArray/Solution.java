package algorithms.MergeSortedArray;

import java.util.stream.Stream;

/**
 * Created by fisbii on 16-9-2.
 */
public class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int num[] = new int[m+n];
        int k = 0;
        int i = 0, j = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                num[k++] = nums1[i];
                i++;
            }else{
                num[k++] = nums2[j];
                j++;
            }
        }
        while(i < m) num[k++] = nums1[i++];
        while(j < n) num[k++] = nums2[j++];
        for(i = 0; i < k; i++){
            nums1[i] = num[i];
        }
    }

    public static void main(String args[]){
        int nums1[] = {1,3,5,7,9,0,0,0,0,0,0};
        int nums2[] = {4,8,10,11};
        merge(nums1,5,nums2,4);
        for(int i = 0; i < 9; i++){
            System.out.println(nums1[i]);
        }
    }
}

package PascalTriangle2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fisbii on 16-8-10.
 */
public class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> resList = new ArrayList<>();
        Integer res[] = new Integer[rowIndex+1];
        res[0] = 1;
        for(int i = 1; i <= rowIndex; i++){
            for(int j = i; j >= 0; j--){
                if(i == j){
                    res[j] = res[j-1];
                }else if(j == 0){
                    res[j] = res[j];
                }else{
                    res[j] = res[j-1] + res[j];
                }
            }
        }
        resList = Arrays.asList(res);
        return resList;
    }

    public static void main(String args[]){
        List<Integer> list = getRow(3);
        for(Integer i : list){
            System.out.println(i);
        }
    }
}

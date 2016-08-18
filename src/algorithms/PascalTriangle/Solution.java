package algorithms.PascalTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by fisbii on 16-8-17.
 */
public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0){
            return result;
        }
        if(numRows == 1){
            List<Integer> eachRow = new ArrayList<>();
            eachRow.add(1);
            result.add(eachRow);
            return result;
        }
        int a[][] = new int[numRows][numRows];
        a[0][0] = a[1][0] = a[1][1] = 1;
        for(int i = 2; i < numRows; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || i == j){
                    a[i][j] = 1;
                }else{
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }
        for(int i = 0; i < numRows; i++){
            List<Integer> eachRow = new ArrayList<>();
            for(int j = 0; j < a[i].length && a[i][j] != 0; j++){
                eachRow.add(a[i][j]);
            }
            result.add(eachRow);
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(generate(17));
        List<List<Integer>> lists = generate(16);
        lists.forEach(System.out::println);
    }
}

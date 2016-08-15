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
        if(rowIndex == 0){
            resList.add(1);
            return resList;
        }
        Integer res[] = new Integer[rowIndex+1];
        for(int i = 0; i <= (rowIndex+1)/2; i++){
            res[i] = res[rowIndex-i] = combination(rowIndex,i);
        }
        resList = Arrays.asList(res);
        return resList;
    }

    public static int combination(int n,int m){
        BigInteger ans = BigInteger.ONE;
        for(int i = n; i >= (n-m+1); --i){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        BigInteger div = BigInteger.ONE;
        for(int i = 1; i <= m; i++){
            div = div.multiply(BigInteger.valueOf(i));
        }
        BigInteger res = ans.divide(div);
        return res.intValue();
    }

    public static void main(String args[]){
        System.out.println(combination(17, 10));
    }
}

package algorithms.CompareVersionNumbers.java;

import java.util.Scanner;

/**
 * Created by fisbii on 16-7-18.
 */
public class Main {
    public static void main(String args[]){
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            String str1 = cin.next();
            String str2 = cin.next();
            System.out.println(compareVersionNumbers.compareVersion(str1,str2));
        }
    }
}

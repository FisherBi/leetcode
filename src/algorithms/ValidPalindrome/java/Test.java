package algorithms.ValidPalindrome.java;

import java.util.Scanner;

/**
 * Created by FisherBi on 2016/7/19.
 */
public class Test {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        while(cin.hasNextLine()){
            String s = cin.nextLine();
            System.out.println(ValidPalindrome.isPalindrome(s));
        }
    }
}

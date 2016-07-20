package algorithms.AddBinary.java;

import java.util.Scanner;

/**
 * Created by FisherBi on 2016/7/20.
 */
public class Test {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        while(cin.hasNextLine()){
            String a = cin.nextLine();
            String b = cin.nextLine();
            System.out.println(Binary.addBinary(a,b));
        }
    }
}

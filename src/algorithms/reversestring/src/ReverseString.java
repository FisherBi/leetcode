package algorithms.reversestring.src;

import java.util.Scanner;

/**
 * Created by fisbii on 16-7-13.
 */
public class ReverseString {
    public static String reverseString(String s) {
        StringBuffer reverseStr = new StringBuffer(s);
        return reverseStr.reverse().toString();
    }
}

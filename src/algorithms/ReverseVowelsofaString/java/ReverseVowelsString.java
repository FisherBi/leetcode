package algorithms.ReverseVowelsofaString.java;

import java.util.*;

/**
 * Created by fisbii on 16-7-14.
 */
public class ReverseVowelsString {
    public String reverseVowels(String s) {
        List<String> vowels = Arrays.asList("a","A","e","E","i","I","o","O","u","U");
        StringBuffer reverseVowels = new StringBuffer();
        char[] result = s.toCharArray();
        List<Integer> indexList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i)+"")){
                reverseVowels.append(s.charAt(i));
                indexList.add(i);
            }
        }
        reverseVowels.reverse();
        for(int i = 0; i < reverseVowels.length(); i++){
            result[indexList.get(i)] = reverseVowels.charAt(i);
        }
        return String.valueOf(result);
    }
}

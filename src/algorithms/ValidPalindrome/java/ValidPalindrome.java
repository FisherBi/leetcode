package algorithms.ValidPalindrome.java;

/**
 * Created by FisherBi on 2016/7/19.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s.equals("")) return true;
        char[] palindromeChar = new char[s.length()];
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                if(Character.isUpperCase(c)){
                    palindromeChar[index++] = Character.toLowerCase(c);
                }else{
                    palindromeChar[index++] = c;
                }
            }
        }
        if(index == 0){
            return true;
        }else{
            for(int i = 0; i < index / 2; i++){
                if(palindromeChar[i] != palindromeChar[index-i-1]){
                    return false;
                }
            }
        }
        return true;
    }
}

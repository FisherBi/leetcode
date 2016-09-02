package algorithms.PlusOne;

/**
 * Created by fisbii on 16-9-2.
 */
public class Solution {
    public static int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length-1; i >= 0; i--){
            if(i == digits.length-1){
                digits[digits.length-1] += 1;
                if(digits[digits.length-1] >= 10){
                    digits[digits.length-1] = 0;
                    carry = 1;
                }
            }else{
                if(carry == 1){
                    digits[i] += 1;
                    if(digits[i] >= 10){
                        digits[i] = 0;
                        carry = 1;
                    }else{
                        carry = 0;
                    }
                }else{
                    break;
                }
            }
        }
        if(carry == 1){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            newDigits[1] = 0;
            for(int i = 1; i < digits.length; i++){
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }else{
            return digits;
        }
    }

    public static void main(String args[]){
        int digits[] = {8,9,9,9};
        int d[] = plusOne(digits);
        for(int i = 0; i < d.length; i++){
            System.out.print(d[i]);
        }
    }
}

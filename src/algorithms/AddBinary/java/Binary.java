package algorithms.AddBinary.java;

/**
 * Created by FisherBi on 2016/7/20.
 */
public class Binary {
    public static String addBinary(String a, String b) {
        int aLength = a.length()-1;
        int bLength = b.length()-1;
        int carry = 0;
        if(bLength > aLength)
            return addBinary(b,a);
        int[] result = new int[aLength+2];
        int index = 0;
        while(aLength >= 0 && bLength >= 0){
            int res = Integer.parseInt(a.charAt(aLength)+"") + Integer.parseInt(b.charAt(bLength)+"") + carry;
            if(res == 3){
                result[index] = 1;
                carry = 1;
            }else if(res == 2){
                result[index] = 0;
                carry = 1;
            }else if(res == 1){
                result[index] = 1;
                carry = 0;
            }else{
                result[index] = 0;
                carry = 0;
            }
            index++;
            aLength--;
            bLength--;
        }
        while(aLength >= 0){
            int res = Integer.parseInt(a.charAt(aLength)+"") + carry;
            if(res == 2){
                result[index] = 0;
                carry = 1;
            }else if(res == 1){
                result[index] = 1;
                carry = 0;
            }else{
                result[index] = 0;
                carry = 0;
            }
            index++;
            aLength--;
        }

        if(carry == 1){
            result[index++] = 1;
        }
        StringBuffer resultString = new StringBuffer();
        for(int i = index-1; i >= 0; i--){
            resultString.append(result[i]);
        }
        return resultString.toString();
    }
}

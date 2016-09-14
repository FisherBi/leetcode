package CountAndSay;

/**
 * Created by fisbii on 16-9-9.
 */
public class Solution {
    public static String countAndSay(int n) {
        String seq = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder res = new StringBuilder();
            boolean flag = false;
            int count = 1;
            char tmp = seq.charAt(0);
            for(int j = 1; j < seq.length(); j++){
                if(tmp == seq.charAt(j)){
                    count++;
                }else{
                    res.append(count).append(tmp);
                    tmp = seq.charAt(j);
                    count=1;
                }
            }
            res.append(count).append(tmp);
            seq = res.toString();
        }
        return seq;
    }

    public static void main(String args[]){
        for(int i = 1; i <= 6; i++){
            System.out.println(countAndSay(i));
        }

    }
}

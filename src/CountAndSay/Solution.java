package CountAndSay;

/**
 * Created by fisbii on 16-9-9.
 */
public class Solution {
    public static String countAndSay(int n) {
        String seq = "1";
        for (int i = 0; i < n; i++) {
            StringBuilder res = new StringBuilder();
            boolean flag = false;
            int count = 1;
            char tmp;
            for(int j = 0; j < seq.length(); j++){
                tmp = seq.charAt(j);
                if(!flag){
                    res.append(count).append(tmp);
                    count = 1;
                }else{
                    flag = true;
                    count++;
                }
            }
            seq = res.toString();
        }
        return seq;
    }

    public static void main(String args[]){
        for(int i = 2; i <= 6; i++){
            System.out.println(countAndSay(i));
        }

    }
}

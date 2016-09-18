package algorithms.ImplementstrStr;

/**
 * Created by fisbii on 16-9-18.
 */
public class Solution {
    /**
     * KMP算法
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr1(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int next[] = new int[needle.length()];
        getNext(needle,next);
        for(int i = 0, k = 0; i < haystack.length(); i++){
            while(k > 0 && haystack.charAt(i) != needle.charAt(k))
                k = next[k-1];
            if(haystack.charAt(i) == needle.charAt(k)){
                k++;
            }
            if(k == needle.length())
                return i-k+1;
        }
        return -1;
    }

    public static void getNext(String T,int[] next){
        int i;  //数组T下标
        int k;  //最大前后缀长度
        next[0] = 0;
        for(i = 1,k=0; i < T.length(); i++){  //循环从第二个字符开始，依次计算每个字符对应的next值
            while(k > 0 && T.charAt(i) != T.charAt(k))
                k = next[k-1];
            if(T.charAt(i) == T.charAt(k)){
                k++;
            }
            next[i] = k;
        }
    }
}

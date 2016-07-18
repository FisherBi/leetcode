package algorithms.CompareVersionNumbers.java;

/**
 * Created by fisbii on 16-7-18.
 */
public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int length = Math.max(v1.length,v2.length);
        for(int i = 0; i < length; i++){
            if(i >= v1.length){
                for(int j = i; j < length; j++){
                    if(Integer.parseInt(v2[j]) != 0){
                        return -1;
                    }
                }
                return 0;
            }else if(i >= v2.length){
                for(int j = i; j < length; j++){
                    if(Integer.parseInt(v1[j]) != 0){
                        return 1;
                    }
                }
                return 0;
            }else {
                if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])){
                    return 1;
                }else if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])){
                    return -1;
                }
            }
        }
        return 0;
    }
}

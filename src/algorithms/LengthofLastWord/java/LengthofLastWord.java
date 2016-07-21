package algorithms.LengthofLastWord.java;

/**
 * Created by FisherBi on 2016/7/21.
 */
public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        String world[] = s.split(" ");
        if(world.length == 0){
            return 0;
        }else{
            return world[world.length-1].length();
        }
    }
}

package algorithms.RansomNote;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fisbii on 16-9-9.
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals("")){
            return true;
        }
        Map<Character,Integer> ransomNoteMap = new HashMap<>();
        Map<Character,Integer> magazineMap = new HashMap<>();
        putCharacterToMap(ransomNote,ransomNoteMap);
        putCharacterToMap(magazine,magazineMap);
        for(Character c : ransomNoteMap.keySet()){
            if(magazineMap.get(c) == null || ransomNoteMap.get(c) > magazineMap.get(c))
                return false;
        }
        return true;
    }

    private void putCharacterToMap(String str, Map<Character, Integer> map) {
        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }
        }
    }
}

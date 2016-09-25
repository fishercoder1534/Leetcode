package easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap();
        Map<Character, Integer> indexMap = new HashMap();
        
        for(int i = 0; i < s.length(); i++){
            if(countMap.containsKey(s.charAt(i))){
                countMap.put(s.charAt(i), countMap.get(s.charAt(i))+1);
            } else {
                indexMap.put(s.charAt(i), i);
                countMap.put(s.charAt(i), 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(countMap.get(s.charAt(i)) == 1) return indexMap.get(s.charAt(i));
        }
        return -1;
    }
    
    public static void main(String...strings){
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

}

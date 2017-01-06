package com.stevesun.solutions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap();
        for (int i = 0, j = i; j < s.length(); ){
            if (!map.containsKey(s.charAt(j)) || (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) == 0)){
                map.put(s.charAt(j), 1);
                result = Math.max(j-i+1, result);
                j++;
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
        }
        return result;
    }

    public static void main(String...args){
//        String s = "abcabcbb";
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
public class _3 {

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

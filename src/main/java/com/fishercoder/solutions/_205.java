package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
/**
 * 205. Isomorphic Strings
 *
 * Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.*/
public class _205 {
    /**space should be O(1) since it only has alphabetic letters which are capped at 52.*/

    public static class Solution1 {
        public boolean isIsomorphic(String s, String t) {
            if (s == null || s.length() == 0) {
                return (t == null || t.length() == 0);
            }
            if (t == null || t.length() == 0) {
                return (s == null || s.length() == 0);
            }
            char[] schar = s.toCharArray();
            char[] tchar = t.toCharArray();
            Map<Character, Character> map = new HashMap();
            if (s.length() != t.length()) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(schar[i])) {
                    if (map.get(schar[i]) != tchar[i]) {
                        return false;
                    }
                } else {
                    if (map.containsValue(tchar[i])) {
                        return false;//this line is necessary for this case: ("ab", "aa")
                    }
                    map.put(schar[i], tchar[i]);
                }
            }
            return true;
        }
    }
}

package com.fishercoder.solutions.first_thousand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _242 {

    public static class Solution1 {
        public boolean isAnagram(String s, String t) {
            char[] schar = s.toCharArray();
            char[] tchar = t.toCharArray();
            Arrays.sort(schar);
            Arrays.sort(tchar);
            return new String(schar).equals(new String(tchar));
        }
    }

    public static class Solution2 {
        public boolean isAnagram(String s, String t) {
            if (s == null || t == null || s.length() != t.length()) {
                return false;
            }
            int[] counts = new int[26];
            for (int i = 0; i < s.length(); i++) {
                counts[s.charAt(i) - 'a']++;
                counts[t.charAt(i) - 'a']--;
            }
            for (int i : counts) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Solution3 {
        //to deal with unicode characters
        public boolean isAnagram(String s, String t) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            }
            for (char c : map.keySet()) {
                if (map.get(c) != 0) {
                    return true;
                }
            }
            return true;
        }
    }
}

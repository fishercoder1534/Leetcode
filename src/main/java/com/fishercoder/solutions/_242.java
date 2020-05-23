package com.fishercoder.solutions;

import java.util.Arrays;

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
}

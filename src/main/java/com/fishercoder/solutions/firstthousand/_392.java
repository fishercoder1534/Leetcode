package com.fishercoder.solutions.firstthousand;

public class _392 {

    public static class Solution1 {
        public boolean isSubsequence(String s, String t) {
            int i = 0;
            for (int j = 0; i < s.length() && j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                }
            }
            return i == s.length();
        }
    }
}

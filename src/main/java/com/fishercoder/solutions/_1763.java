package com.fishercoder.solutions;

public class _1763 {
    public static class Solution1 {
        public String longestNiceSubstring(String s) {
            String longest = "";
            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = i; j <= s.length(); j++) {
                    if (isNiceString(s.substring(i, j))) {
                        if (longest.length() < j - i) {
                            longest = s.substring(i, j);
                        }
                    }
                }
            }
            return longest;
        }

        private boolean isNiceString(String str) {
            int[] uppercount = new int[26];
            int[] lowercount = new int[26];
            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    uppercount[Character.toLowerCase(c) - 'a']++;
                } else {
                    lowercount[c - 'a']++;
                }
            }
            for (int i = 0; i < uppercount.length; i++) {
                if (uppercount[i] > 0 && lowercount[i] > 0 || (uppercount[i] == 0 && lowercount[i] == 0)) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}

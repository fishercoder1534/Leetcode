package com.fishercoder.solutions;

public class _1750 {
    public static class Solution1 {
        public int minimumLength(String s) {
            int i = 0;
            int j = s.length() - 1;
            if (s.charAt(i) == s.charAt(j)) {
                while (i < j && s.charAt(i) == s.charAt(j)) {
                    char c = s.charAt(i);
                    i++;
                    while (c == s.charAt(i) && i < j) {
                        i++;
                    }
                    j--;
                    while (c == s.charAt(j) && i < j) {
                        j--;
                    }
                }
            }
            return i <= j ? s.substring(i, j).length() + 1 : 0;
        }
    }
}

package com.fishercoder.solutions;

public class _2315 {
    public static class Solution1 {
        public int countAsterisks(String s) {
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '|') {
                    i++;
                    while (i < s.length() && s.charAt(i) != '|') {
                        i++;
                    }
                } else if (s.charAt(i) == '*') {
                    ans++;
                }
            }
            return ans;
        }
    }
}

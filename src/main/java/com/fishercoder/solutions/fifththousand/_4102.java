package com.fishercoder.solutions.fifththousand;

public class _4102 {
    public static class Solution1 {
        public long countValidSubstrings(String s) {
            long ans = 0;
            int lastAbcIndex = -1;
            int n = s.length();
            for (int i = 0; i < n; i++) {
                if (i >= 2 && s.charAt(i - 2) == 'a' && s.charAt(i - 1) == 'b' && s.charAt(i) == 'c') {
                    lastAbcIndex = i;
                }

                int validStart = Math.max(0, lastAbcIndex - 1);
                ans += i - validStart + 1;
            }
            return ans;
        }
    }
}

package com.fishercoder.solutions.fourththousand;

public class _3258 {
    public static class Solution1 {
        public int countKConstraintSubstrings(String s, int k) {
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String candidate = s.substring(i, j);
                    if (meetConstraints(candidate, k)) {
                        ans++;
                    }
                }
            }
            return ans;
        }

        private boolean meetConstraints(String candidate, int k) {
            int ones = 0;
            int zeroes = 0;
            for (char c : candidate.toCharArray()) {
                if (c == '0') {
                    zeroes++;
                } else {
                    ones++;
                }
            }
            return ones <= k || zeroes <= k;
        }
    }
}

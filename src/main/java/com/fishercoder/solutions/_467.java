package com.fishercoder.solutions;

public class _467 {
    public static class Solution1 {
        /**
         * A naive solution would definitely result in TLE.
         * Since the pattern keeps repeating, DP is the way to go.
         * Because the input consists merely of lowercase English letters, we could maintain an array of size 26,
         * keep updating this array, counting the substrings that end with this letter, keep updating it with the largest one possible.
         * <p>
         * Inspired by this: https://discuss.leetcode.com/topic/70658/concise-java-solution-using-dp
         */
        public int findSubstringInWraproundString(String p) {
            if (p == null || p.isEmpty()) {
                return 0;
            }
            if (p.length() < 2) {
                return p.length();
            }
            int count = 0;
            int[] dp = new int[26];
            dp[p.charAt(0) - 'a'] = 1;
            int len = 1;
            for (int i = 1; i < p.length(); i++) {
                if (p.charAt(i) - 1 == p.charAt(i - 1) || (p.charAt(i) == 'a' && p.charAt(i - 1) == 'z')) {
                    len++;
                } else {
                    len = 1;
                }
                dp[p.charAt(i) - 'a'] = Math.max(len, dp[p.charAt(i) - 'a']);
            }

            for (int i : dp) {
                count += i;
            }
            return count;
        }
    }

}

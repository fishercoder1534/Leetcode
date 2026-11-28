package com.fishercoder.solutions.secondthousand;

public class _1392 {
    public static class Solution1 {
        /*credit: https://leetcode.com/problems/longest-happy-prefix/discuss/547446/C%2B%2BJava-Incremental-Hash-and-DP*/
        public String longestPrefix(String s) {
            int times = 2;
            long prefixHash = 0;
            long suffixHash = 0;
            long multiplier = 1;
            long len = 0;
            long mod =
                    1000000007; // use some large prime as a modulo to avoid overflow errors, e.g.
            // 10 ^ 9 + 7.
            for (int i = 0; i < s.length() - 1; i++) {
                prefixHash = (prefixHash * times + s.charAt(i)) % mod;
                suffixHash = (multiplier * s.charAt(s.length() - i - 1) + suffixHash) % mod;
                if (prefixHash == suffixHash) {
                    len = i + 1;
                }
                multiplier = multiplier * times % mod;
            }
            return s.substring(0, (int) len);
        }
    }
}

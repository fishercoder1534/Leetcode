package com.fishercoder.solutions;

/**
 * 1392. Longest Happy Prefix
 *
 * A string is called a happy prefix if is a non-empty prefix which is also a suffix (excluding itself).
 * Given a string s. Return the longest happy prefix of s .
 * Return an empty string if no such prefix exists.
 *
 * Example 1:
 * Input: s = "level"
 * Output: "l"
 * Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".
 *
 * Example 2:
 * Input: s = "ababab"
 * Output: "abab"
 * Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.
 *
 * Example 3:
 * Input: s = "leetcodeleet"
 * Output: "leet"
 *
 * Example 4:
 * Input: s = "a"
 * Output: ""
 *
 * Constraints:
 * 1 <= s.length <= 10^5
 * s contains only lowercase English letters.
 * */
public class _1392 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/longest-happy-prefix/discuss/547446/C%2B%2BJava-Incremental-Hash-and-DP*/
        public String longestPrefix(String s) {
            int times = 2;
            long prefixHash = 0;
            long suffixHash = 0;
            long multiplier = 1;
            long len = 0;
            long mod = 1000000007;//use some large prime as a modulo to avoid overflow errors, e.g. 10 ^ 9 + 7.
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

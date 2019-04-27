package com.fishercoder.solutions;

/**
 * 467. Unique Substrings in Wraparound String
 *
 * Consider the string s to be the infinite wraparound string of "abcdefghijklmnopqrstuvwxyz",
 * so s will look like this: "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....".
 * Now we have another string p.
 * Your job is to find out how many unique non-empty substrings of p are present in s.
 * In particular, your input is the string p and you need to output the number of different non-empty substrings of p in the string s.
 * Note: p consists of only lowercase English letters and the size of p might be over 10000.

 Example 1:
 Input: "a"
 Output: 1
 Explanation: Only the substring "a" of string "a" is in the string s.

 Example 2:
 Input: "cac"
 Output: 2
 Explanation: There are two substrings "a", "c" of string "cac" in the string s.

 Example 3:
 Input: "zab"
 Output: 6
 Explanation: There are six substrings "z", "a", "b", "za", "ab", "zab" of string "zab" in the string s.
 */
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

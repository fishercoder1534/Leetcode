package com.fishercoder.solutions;

/**
 * 1358. Number of Substrings Containing All Three Characters
 *
 * Given a string s consisting only of characters a, b and c.
 * Return the number of substrings containing at least one occurrence of all these characters a, b and c.
 *
 * Example 1:
 * Input: s = "abcabc"
 * Output: 10
 * Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
 *
 * Example 2:
 * Input: s = "aaacb"
 * Output: 3
 * Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".
 *
 * Example 3:
 * Input: s = "abc"
 * Output: 1
 *
 * Constraints:
 * 3 <= s.length <= 5 x 10^4
 * s only consists of a, b or c characters.
 * */
public class _1358 {
    public static class Solution1 {
        /**A classic sliding window problem, no dp or backtracking, just sliding window: use two pointers.
         * my new favorite queustion!
         * */
        public int numberOfSubstrings(String s) {
            int[] counts = new int[3];
            int i = 0;
            int n = s.length();
            int result = 0;
            for (int j = 0; j < n; j++) {
                counts[s.charAt(j) - 'a']++;
                while (counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {
                    counts[s.charAt(i++) - 'a']--;
                }
                result += i;
            }
            return result;
        }

    }
}

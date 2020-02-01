package com.fishercoder.solutions;

/**
 * 1180. Count Substrings with Only One Distinct Letter
 *
 * Given a string S, return the number of substrings that have only one distinct letter.
 *
 * Example 1:
 * Input: S = "aaaba"
 * Output: 8
 * Explanation: The substrings with one distinct letter are "aaa", "aa", "a", "b".
 * "aaa" occurs 1 time.
 * "aa" occurs 2 times.
 * "a" occurs 4 times.
 * "b" occurs 1 time.
 * So the answer is 1 + 2 + 4 + 1 = 8.
 *
 * Example 2:
 * Input: S = "aaaaaaaaaa"
 * Output: 55
 *
 * Constraints:
 * 1 <= S.length <= 1000
 * S[i] consists of only lowercase English letters.
 * */
public class _1180 {
    public static class Solution1 {
        public int countLetters(String S) {
            int count = 0;
            for (int i = 0, j = 1; j < S.length() && i <= j; ) {
                while (j < S.length() && S.charAt(i) == S.charAt(j)) {
                    j++;
                }
                count += countTimes(S.substring(i, j));
                i += S.substring(i, j).length();
            }
            return count;
        }

        private int countTimes(String str) {
            int len = str.length();
            int times = 0;
            while (len > 0) {
                times += len--;
            }
            return times;
        }
    }
}

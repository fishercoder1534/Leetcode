package com.fishercoder.solutions;

/**
 * 1221. Split a String in Balanced Strings
 *
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * Return the maximum amount of splitted balanced strings.
 *
 * Example 1:
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 *
 * Example 2:
 * Input: s = "RLLLLRRRLR"
 * Output: 3
 * Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
 *
 * Example 3:
 * Input: s = "LLLLRRRR"
 * Output: 1
 * Explanation: s can be split into "LLLLRRRR".
 *
 * Example 4:
 * Input: s = "RLRRRLLRLL"
 * Output: 2
 * Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s[i] = 'L' or 'R'
 * */
public class _1221 {
    public static class Solution1 {
        public int balancedStringSplit(String s) {
            int i = 0;
            int balancedCount = 0;
            int lCount = 0;
            int rCount = 0;
            while (i < s.length()) {
                if (s.charAt(i) == 'L') {
                    lCount++;
                } else {
                    rCount++;
                }
                i++;
                if (lCount != 0 && lCount == rCount) {
                    lCount = 0;
                    rCount = 0;
                    balancedCount++;
                }
            }
            return balancedCount;
        }
    }

    public static class Solution2 {
        public int balancedStringSplit(String s) {
            int count = 0;
            int result = 0;
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == 'L') {
                    count++;
                } else {
                    count--;
                }
                if (count == 0) {
                    result++;
                }
                i++;
            }
            return result;
        }
    }
}

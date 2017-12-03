package com.fishercoder.solutions;

/**
 * 738. Monotone Increasing Digits
 *
 * Given a non-negative integer N, find the largest number that is less than or equal to N with monotone increasing digits.
 * (Recall that an integer has monotone increasing digits if and only if each pair of adjacent digits x and y satisfy x <= y.)

 Example 1:
 Input: N = 10
 Output: 9

 Example 2:
 Input: N = 1234
 Output: 1234

 Example 3:
 Input: N = 332
 Output: 299

 Note: N is an integer in the range [0, 10^9].
 */
public class _738 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/112808/simple-python-solution-w-explanation/2
         */
        public int monotoneIncreasingDigits(int N) {
            String s = Integer.toString(N);
            int index = -1;
            for (int i = s.length() - 2; i >= 0; i--) {
                if (s.charAt(i) > s.charAt(i + 1) || (index != -1 && s.charAt(index) == s.charAt(i))) {
                    index = i;
                }
            }
            return index == -1 ? N : N - Integer.parseInt(s.substring(index + 1, s.length())) - 1;
        }
    }
}

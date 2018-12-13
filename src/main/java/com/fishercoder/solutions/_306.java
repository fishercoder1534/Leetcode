package com.fishercoder.solutions;

/**
 * 306. Additive Number
 *
 * Additive number is a string whose digits can form additive sequence.

 A valid additive sequence should contain at least three numbers.
 Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

 For example:
 "112358" is an additive number because the digits can form an additive sequence: 1, 1, 2, 3, 5, 8.

 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 "199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
 1 + 99 = 100, 99 + 100 = 199
 Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.

 Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.

 Follow up:
 How would you handle overflow for very large input integers?
 */
public class _306 {
    public static class Solution1 {
        /** Credit: https://discuss.leetcode.com/topic/29856/java-recursive-and-iterative-solutions/2 */
        public boolean isAdditiveNumber(String num) {
            int n = num.length();
            for (int i = 1; i <= n / 2; ++i) {
                for (int j = 1; Math.max(j, i) <= n - i - j; ++j) {
                    if (isValid(i, j, num)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean isValid(int i, int j, String num) {
            if (num.charAt(0) == '0' && i > 1) {
                return false;
            }
            if (num.charAt(i) == '0' && j > 1) {
                return false;
            }
            String sum;
            Long x1 = Long.parseLong(num.substring(0, i));
            Long x2 = Long.parseLong(num.substring(i, i + j));
            for (int start = i + j; start != num.length(); start += sum.length()) {
                x2 = x2 + x1;
                x1 = x2 - x1;
                sum = x2.toString();
                if (!num.startsWith(sum, start)) {
                    return false;
                }
            }
            return true;
        }
    }

}

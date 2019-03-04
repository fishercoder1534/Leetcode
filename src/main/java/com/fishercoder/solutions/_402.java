package com.fishercoder.solutions;

/**
 * 402. Remove K Digits
 *
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

 Note:
 The length of num is less than 10002 and will be ≥ k.
 The given num does not contain any leading zero.
 Example 1:

 Input: num = "1432219", k = 3
 Output: "1219"
 Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
 Example 2:

 Input: num = "10200", k = 1
 Output: "200"
 Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
 Example 3:

 Input: num = "10", k = 2
 Output: "0"
 Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */
public class _402 {
    public static class Solution1 {

        /** credit: https://discuss.leetcode.com/topic/59412/a-greedy-method-using-stack-o-n-time-and-o-n-space */
        public String removeKdigits(String num, int k) {
            int digits = num.length() - k;
            char[] stack = new char[num.length()];
            int top = 0;

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                while (top > 0 && stack[top - 1] > c && k > 0) {
                    top--;
                    k--;
                }
                stack[top++] = c;
            }

            int index = 0;
            while (index < digits && stack[index] == '0') {
                index++;
            }
            return index == digits ? "0" : new String(stack, index, digits - index);
        }
    }
}

package com.fishercoder.solutions;

/**
 * 556. Next Greater Element III
 *
 * Given a positive 32-bit integer n, you need to find the smallest 32-bit integer which has exactly the same digits existing
 * in the integer n and is greater in value than n. If no such positive 32-bit integer exists, you need to return -1.
 *
 * Example 1:
 * Input: 12
 * Output: 21
 *
 * Example 2:
 * Input: 21
 * Output: -1
 */
public class _556 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/85759/this-problem-is-the-same-to-next-permutation-algorithm-only and https://discuss.leetcode.com/topic/85755/java-solution-like-next-permutation-problem-o-n
         */

        public int nextGreaterElement(int n) {
            char[] digits = String.valueOf(n).toCharArray();
            int i = digits.length - 2;
            while (i >= 0 && digits[i + 1] <= digits[i]) {
                i--;
            }
            if (i < 0) {
                return -1;
            }
            int j = digits.length - 1;
            while (j >= 0 && digits[j] <= digits[i]) {
                j--;
            }
            swap(digits, i, j);
            reverse(digits, i + 1);
            try {
                return Integer.parseInt(new String(digits));
            } catch (Exception e) {
                return -1;
            }
        }

        private void reverse(char[] a, int start) {
            int i = start;
            int j = a.length - 1;
            while (i < j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }

        private void swap(char[] a, int i, int j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

}

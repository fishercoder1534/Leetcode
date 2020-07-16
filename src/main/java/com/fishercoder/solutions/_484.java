package com.fishercoder.solutions;

public class _484 {
    public static class Solution1 {

        /**
         * credit:https://discuss.leetcode.com/topic/76221/java-o-n-clean-solution-easy-to-understand
         * <p>
         * For example, given IDIIDD we start with sorted sequence 1234567
         * Then for each k continuous D starting at index i we need to reverse [i, i+k] portion of the sorted sequence.
         * <p>
         * e.g.
         * IDIIDD
         * <p>
         * 1234567 // sorted
         * 1324765 // answer
         */
        public int[] findPermutation(String s) {
            int[] result = new int[s.length() + 1];
            for (int i = 0; i <= s.length(); i++) {
                result[i] = i + 1;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'D') {
                    int left = i;
                    while (i < s.length() && s.charAt(i) == 'D') {
                        i++;
                    }
                    reverse(result, left, i);
                }
            }
            return result;
        }

        private void reverse(int[] result, int left, int i) {
            while (left < i) {
                int temp = result[left];
                result[left] = result[i];
                result[i] = temp;
                left++;
                i--;
            }
        }
    }

}

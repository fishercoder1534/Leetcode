package com.fishercoder.solutions;

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

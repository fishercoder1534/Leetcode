package com.fishercoder.solutions;

public class _402 {
    public static class Solution1 {

        /**
         * credit: https://discuss.leetcode.com/topic/59412/a-greedy-method-using-stack-o-n-time-and-o-n-space
         */
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

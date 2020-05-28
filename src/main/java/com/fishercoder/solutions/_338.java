package com.fishercoder.solutions;

public class _338 {
    public static class Solution1 {
        //use the most regular method to get it AC'ed first
        public int[] countBits(int num) {
            int[] ones = new int[num + 1];
            for (int i = 0; i <= num; i++) {
                ones[i] = countOnes(i);
            }
            return ones;
        }

        private int countOnes(int i) {
            int ones = 0;
            while (i != 0) {
                ones++;
                i &= (i - 1);
            }
            return ones;
        }
    }

    private class Solution2 {
        /**
         * lixx2100's post is cool:https://discuss.leetcode.com/topic/40162/three-line-java-solution
         * An easy recurrence for this problem is f[i] = f[i / 2] + i % 2
         * and then we'll use bit manipulation to express the above recursion function
         * right shift by 1 means to divide by 2
         * AND with 1 means to modulo 2
         * this is so cool!
         */
        public int[] countBits(int num) {
            int[] ones = new int[num + 1];
            for (int i = 1; i <= num; i++) {
                ones[i] = ones[i >> 1] + (i & 1);
            }
            return ones;
        }
    }
}

package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.List;

public class _338 {
    public static class Solution1 {
        // use the most regular method to get it AC'ed first
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
         * lixx2100's post is cool: https://discuss.leetcode.com/topic/40162/three-line-java-solution
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

    private class Solution3 {
        /**
         * My own solution after peeking at the hints on LeetCode.
         * <p>
         * First, once we scratch it out, we can easily see this:
         * Decimal	Binary	Set Bits
         * 0	0	0
         * 1	001	1
         * 2	010	1
         * 3	011	2
         * 4	100	1
         * 5	101	2
         * 6	110	2
         * 7	111	3
         * 8	1000	1
         * 9	1001	2
         * 10	1010	2
         * 11	1011	3
         * 12	1100	2
         * 13	1101	3
         * 14	1110	3
         * 15	1111	4
         * 16	10000	1
         * we can compute the current group of ones count by re-using the previous group:
         * Block 1 (2-3):   1, 2
         * Block 2 (4-7):   1, 2, 2, 3
         * Block 3 (8-15):  1, 2, 2, 3, 2, 3, 3, 4
         *
         */
        public int[] countBits(int n) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            if (n == 0) {
                return list.stream().mapToInt(Integer::intValue).toArray();
            }
            list.add(1);
            int lastBatchSize = 1;
            int startIndex = 1;
            while (list.size() <= n) {
                for (int i = startIndex; i < startIndex + lastBatchSize; i++) {
                    list.add(list.get(i));
                }
                for (int i = startIndex; i < startIndex + lastBatchSize; i++) {
                    list.add(list.get(i) + 1);
                }
                startIndex += lastBatchSize;
                lastBatchSize *= 2;
            }
            return list.subList(0, n + 1).stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

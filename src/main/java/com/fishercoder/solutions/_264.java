package com.fishercoder.solutions;

import java.util.TreeSet;

public class _264 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/21791/o-n-java-solution
         */
        public int nthUglyNumber(int n) {
            int[] ugly = new int[n];
            ugly[0] = 1;
            int index2 = 0;
            int index3 = 0;
            int index5 = 0;
            int factor2 = 2;
            int factor3 = 3;
            int factor5 = 5;
            for (int i = 1; i < n; i++) {
                int min = Math.min(Math.min(factor2, factor3), factor5);
                ugly[i] = min;
                if (factor2 == min) {
                    factor2 = 2 * ugly[++index2];
                }
                if (factor3 == min) {
                    factor3 = 3 * ugly[++index3];
                }
                if (factor5 == min) {
                    factor5 = 5 * ugly[++index5];
                }
            }
            return ugly[n - 1];
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 11/7/2021.
         * Although not super robust, as the input increases, I'll have to increase the times (variable n) on line 61 as some smaller numbers might appear later.
         */
        public int nthUglyNumber(int n) {
            TreeSet<Long> treeSet = new TreeSet<>();
            treeSet.add(1L);
            int count = 1;
            int polled = 0;
            int[] primes = new int[]{2, 3, 5};
            while (!treeSet.isEmpty()) {
                int size = treeSet.size();
                for (int i = 0; i < size; i++) {
                    Long curr = treeSet.pollFirst();
                    polled++;
                    if (polled == n) {
                        return curr.intValue();
                    }
                    for (int prime : primes) {
                        treeSet.add(prime * curr);
                        count++;
                    }
                }
                if (count >= n * 3) {
                    while (polled < n - 1) {
                        treeSet.pollFirst();
                        polled++;
                    }
                    return treeSet.pollFirst().intValue();
                }
            }
            return -1;
        }
    }
}

package com.fishercoder.solutions;

public class _1526 {
    public static class Solution1 {
        /**
         * This brute force solution results in TLE on LeetCode.
         */
        public int minNumberOperations(int[] target) {
            int ops = 0;
            while (!allZero(target)) {
                int i = 0;
                while (target[i] == 0) {
                    i++;
                }
                for (; i < target.length && target[i] != 0; i++) {
                    target[i]--;
                }
                ops++;
            }
            return ops;
        }

        private boolean allZero(int[] target) {
            for (int i : target) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

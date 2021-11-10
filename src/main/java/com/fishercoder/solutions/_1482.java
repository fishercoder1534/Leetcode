package com.fishercoder.solutions;

public class _1482 {
    public static class Solution1 {
        /**
         * https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/discuss/686316/JavaC%2B%2BPython-Binary-Search
         */
        public int minDays(int[] bloomDay, int m, int k) {
            int n = bloomDay.length;
            int left = 1;
            int right = Integer.MAX_VALUE;
            if (m * k > n) {
                return -1;
            }
            while (left < right) {
                int mid = left + (right - left) / 2;
                int flower = 0;
                int bouq = 0;
                for (int j = 0; j < n; j++) {
                    if (bloomDay[j] > mid) {
                        flower = 0;
                    } else if (++flower >= k) {
                        bouq++;
                        flower = 0;
                    }
                }
                if (bouq < m) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
}

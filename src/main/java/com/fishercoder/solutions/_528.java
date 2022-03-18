package com.fishercoder.solutions;

import java.util.Random;

public class _528 {
    public static class Solution1 {
        Random random;
        int[] preSums;

        public Solution1(int[] w) {
            this.random = new Random();
            for (int i = 1; i < w.length; ++i) {
                w[i] += w[i - 1];
            }
            this.preSums = w;
        }

        public int pickIndex() {
            int len = preSums.length;
            int idx = random.nextInt(preSums[len - 1]) + 1;
            int left = 0, right = len - 1;
            // search position
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (preSums[mid] == idx)
                    return mid;
                else if (preSums[mid] < idx)
                    left = mid + 1;
                else
                    right = mid;
            }
            return left;
        }
    }
}

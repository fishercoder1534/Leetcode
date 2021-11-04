package com.fishercoder.solutions;

public class _1151 {
    public static class Solution1 {
        /**
         * My completely original solution on 11/4/2021.
         * Typical sliding window problem/solution
         */
        public int minSwaps(int[] data) {
            int oneCount = 0;
            for (int d : data) {
                if (d == 1) {
                    oneCount++;
                }
            }
            if (oneCount <= 1) {
                return 0;
            }
            int left = 0;
            int right = 0;
            int ones = 0;
            int zeroes = 0;
            int minSwaps = data.length;
            while (right < data.length) {
                if (data[right] == 1) {
                    ones++;
                } else {
                    zeroes++;
                }
                if (ones + zeroes == oneCount) {
                    minSwaps = Math.min(minSwaps, zeroes);
                    if (data[left] == 1) {
                        ones--;
                    } else {
                        zeroes--;
                    }
                    left++;
                }
                right++;
            }
            return minSwaps;
        }
    }
}

package com.fishercoder.solutions;

import java.util.Arrays;

public class _575 {
    public static class Solution1 {
        public int distributeCandies(int[] candies) {
            Arrays.sort(candies);
            int sisCount = 0;
            for (int i = 0; i < candies.length; i++) {
                int val = candies[i];
                sisCount++;
                if (sisCount >= candies.length / 2) {
                    return candies.length / 2;
                }
                while (i < candies.length && candies[i] == val) {
                    i++;
                }
                i--;
            }
            return sisCount;
        }
    }
}

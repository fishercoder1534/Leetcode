package com.fishercoder.solutions;

import java.util.Arrays;

public class _2279 {
    public static class Solution1 {
        public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            int[] delta = new int[capacity.length];
            int ans = 0;
            for (int i = 0; i < capacity.length; i++) {
                if (capacity[i] == rocks[i]) {
                    ans++;
                } else {
                    delta[i] = capacity[i] - rocks[i];
                }
            }
            Arrays.sort(delta);
            for (int i = 0; i < capacity.length; i++) {
                if (delta[i] != 0) {
                    if (additionalRocks >= delta[i]) {
                        ans++;
                        additionalRocks -= delta[i];
                    }
                }
            }
            return ans;
        }
    }
}

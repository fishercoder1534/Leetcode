package com.fishercoder.solutions;

public class _755 {
    public static class Solution1 {
        public int[] pourWater(int[] heights, int V, int K) {
            int index;
            while (V > 0) {
                index = K;
                for (int i = K - 1; i >= 0; i--) {
                    if (heights[i] > heights[index]) {
                        break;
                    } else if (heights[i] < heights[index]) {
                        index = i;
                    }
                }
                if (index != K) {
                    heights[index]++;
                    V--;
                    continue;
                }

                for (int i = K + 1; i < heights.length; i++) {
                    if (heights[i] > heights[index]) {
                        break;
                    } else if (heights[i] < heights[index]) {
                        index = i;
                    }
                }
                heights[index]++;
                V--;
            }
            return heights;
        }
    }
}

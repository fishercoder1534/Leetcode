package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3074 {
    public static class Solution1 {
        public int minimumBoxes(int[] apple, int[] capacity) {
            int apples = 0;
            for (int app : apple) {
                apples += app;
            }
            Arrays.sort(capacity);
            int boxes = 0;
            for (int i = capacity.length - 1; i >= 0; i--) {
                boxes++;
                apples -= capacity[i];
                if (apples <= 0) {
                    return boxes;
                }
            }
            return boxes;
        }
    }
}

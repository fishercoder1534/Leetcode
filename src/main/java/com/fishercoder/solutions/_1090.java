package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1090 {
    public static class Solution1 {
        public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
            int[][] tuple = new int[values.length][2];
            for (int i = 0; i < values.length; i++) {
                tuple[i][0] = values[i];
                tuple[i][1] = labels[i];
            }
            Arrays.sort(tuple, (a, b) -> b[0] - a[0]);
            Map<Integer, Integer> labelUsedCountMap = new HashMap<>();
            int sum = 0;
            int numbersUsed = 0;
            for (int i = 0; i < values.length; i++) {
                int val = tuple[i][0];
                int usedCount = labelUsedCountMap.getOrDefault(tuple[i][1], 0);
                if (usedCount >= useLimit) {
                    continue;
                } else {
                    sum += val;
                    numbersUsed++;
                    labelUsedCountMap.put(tuple[i][1], usedCount + 1);
                }
                if (numbersUsed >= numWanted) {
                    break;
                }
            }
            return sum;
        }
    }
}

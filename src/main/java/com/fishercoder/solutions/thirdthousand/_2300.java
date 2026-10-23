package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2300 {
    public static class Solution1 {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int[] result = new int[spells.length];
            Arrays.sort(potions);
            for (int i = 0; i < spells.length; i++) {
                int j = binarySearch(potions, success, spells[i]);
                result[i] = potions.length - j;
            }
            return result;
        }

        private int binarySearch(int[] potions, long success, int spell) {
            int left = 0;
            int right = potions.length - 1;
            int firstValidIndex = potions.length;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) potions[mid] * spell >= success) {
                    firstValidIndex = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return firstValidIndex;
        }
    }
}

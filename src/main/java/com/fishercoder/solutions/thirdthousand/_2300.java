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
            while (left < right) {
                int mid = left + (right - left) / 2;
                if ((long) potions[mid] * spell >= success) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (left == right && left == potions.length - 1 && (long) spell * potions[left] < success) {
                return potions.length;
            }
            return right;
        }
    }
}

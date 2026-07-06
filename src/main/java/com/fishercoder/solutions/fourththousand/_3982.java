package com.fishercoder.solutions.fourththousand;

import java.util.TreeMap;

public class _3982 {
    public static class Solution1 {
        public int maxDigitRange(int[] nums) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int num : nums) {
                int digitRange = computeDigitRange(num);
                map.put(digitRange, map.getOrDefault(digitRange, 0) + num);
            }
            return map.lastEntry().getValue();
        }

        private int computeDigitRange(int num) {
            int smallest = Integer.MAX_VALUE;
            int biggest = Integer.MIN_VALUE;
            while (num > 0) {
                int digit = num % 10;
                smallest = Math.min(smallest, digit);
                biggest = Math.max(biggest, digit);
                num /= 10;
            }
            return biggest - smallest;
        }
    }
}

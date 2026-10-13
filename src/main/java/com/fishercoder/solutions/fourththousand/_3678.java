package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;
import java.util.TreeMap;

public class _3678 {
    public static class Solution1 {
        public int smallestAbsent(int[] nums) {
            long sum = Arrays.stream(nums).sum();
            double ave = (double) sum / nums.length;
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int candidate = map.floorKey((int) ave) + 1;
            while (map.containsKey(candidate) || candidate <= 0 || candidate <= ave) {
                candidate++;
            }
            return candidate;
        }
    }
}

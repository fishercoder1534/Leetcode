package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2465 {
    public static class Solution1 {
        public int distinctAverages(int[] nums) {
            Arrays.sort(nums);
            Set<Double> averageSet = new HashSet<>();
            for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
                averageSet.add((nums[i] + nums[j]) / 2.0);
            }
            return averageSet.size();
        }
    }
}

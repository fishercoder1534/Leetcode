package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2441 {
    public static class Solution1 {
        public int findMaxK(int[] nums) {
            int maxK = -1;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
                if (set.contains(-nums[i])) {
                    maxK = Math.max(maxK, Math.abs(nums[i]));
                }
            }
            return maxK;
        }
    }
}

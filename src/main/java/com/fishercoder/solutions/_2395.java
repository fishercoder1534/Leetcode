package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _2395 {
    public static class Solution1 {
        public boolean findSubarrays(int[] nums) {
            Set<Integer> sums = new HashSet<>();
            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (!sums.add(sum)) {
                    return true;
                }
            }
            return false;
        }
    }
}

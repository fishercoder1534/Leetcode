package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2784 {
    public static class Solution1 {
        public boolean isGood(int[] nums) {
            int max = -1;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
            }
            if (nums.length != max + 1) {
                return false;
            }
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {
                    if (num != max) {
                        return false;
                    }
                }
            }
            return set.size() == max;
        }
    }
}

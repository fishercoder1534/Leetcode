package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2869 {
    public static class Solution1 {
        public int minOperations(List<Integer> nums, int k) {
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= k; i++) {
                set.add(i);
            }
            for (int i = nums.size() - 1; i >= 0; i--) {
                set.remove(nums.get(i));
                if (set.size() == 0) {
                    return nums.size() - i;
                }
            }
            return -1;
        }
    }
}

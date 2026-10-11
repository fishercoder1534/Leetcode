package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3718 {
    public static class Solution1 {
        public int missingMultiple(int[] nums, int k) {
            int max = nums[0];
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (num % k == 0) {
                    set.add(num);
                }
                max = Math.max(max, num);
            }
            int i = 1;
            for (; i * k <= max; i++) {
                if (!set.contains(i * k)) {
                    return i * k;
                }
            }
            return i * k;
        }
    }
}

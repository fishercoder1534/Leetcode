package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3487 {
    public static class Solution1 {
        public int maxSum(int[] nums) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            if (max < 0) {
                return max;
            }
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.add(num) && num > 0) {
                    sum += num;
                }
            }
            return sum;
        }
    }
}

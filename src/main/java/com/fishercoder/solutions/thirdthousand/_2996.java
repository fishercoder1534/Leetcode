package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2996 {
    public static class Solution1 {
        public int missingInteger(int[] nums) {
            int sum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] + 1 == nums[i]) {
                    sum += nums[i];
                } else {
                    break;
                }
            }
            Set<Integer> seen = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                seen.add(nums[i]);
            }
            while (seen.contains(sum)) {
                sum++;
            }
            return sum;
        }
    }
}

package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1695 {
    public static class Solution1 {
        public int maximumUniqueSubarray(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int maxSum = 0;
            int runningSum = 0;
            for (int right = 0, left = 0; right < nums.length; right++) {
                if (set.add(nums[right])) {
                    runningSum += nums[right];
                    maxSum = Math.max(maxSum, runningSum);
                } else {
                    while (left < right && set.contains(nums[right])) {
                        set.remove(nums[left]);
                        runningSum -= nums[left];
                        left++;
                    }
                    set.add(nums[right]);
                    runningSum += nums[right];
                }
            }
            return maxSum;
        }
    }
}

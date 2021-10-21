package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

    public static class Solution2 {
        /**
         * My completely original solution on 10/202/2021. Classic sliding window solution.
         */
        public int maximumUniqueSubarray(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int start = 0;
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    Integer lastIndex = map.get(nums[i]);
                    while (start <= lastIndex) {
                        sum -= nums[start];
                        start++;
                    }
                }
                sum += nums[i];
                map.put(nums[i], i);
                ans = Math.max(ans, sum);
            }
            return ans;
        }
    }
}

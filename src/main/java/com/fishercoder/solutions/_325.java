package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _325 {

    public static class Solution1 {
        /**
         * 1. This is a beautiful and classic solution that combines prefix sum and hashmap for quick search;
         * 2. This actually covers all possible cases and could find the maximum array size
         */
        public int maxSubArrayLen(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap();
            int sum = 0;
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum == k) {
                    max = i + 1;
                } else if (map.containsKey(sum - k)) {
                    max = Math.max(max, i - map.get(sum - k));
                }
                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }
            }
            return max;
        }
    }

}
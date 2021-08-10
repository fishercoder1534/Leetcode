package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1814 {
    public static class Solution1 {
        public int countNicePairs(int[] nums) {
            long[] reverses = getRev(nums);
            Map<Long, Integer> map = new HashMap<>();
            long nicePairs = 0;
            for (int i = 0; i < nums.length; i++) {
                long diff = nums[i] - reverses[i];
                map.put(diff, map.getOrDefault(diff, 0) + 1);
                nicePairs = (nicePairs + map.get(nums[i] - reverses[i]) - 1) % 1000000007;
            }
            return (int) nicePairs;
        }

        private long[] getRev(int[] nums) {
            long[] reverses = new long[nums.length];
            for (int i = 0; i < nums.length; i++) {
                long reverse = 0;
                int num = nums[i];
                while (num != 0) {
                    reverse = reverse * 10 + num % 10;
                    num /= 10;
                }
                reverses[i] = reverse;
            }
            return reverses;
        }
    }
}

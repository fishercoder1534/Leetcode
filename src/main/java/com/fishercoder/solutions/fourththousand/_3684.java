package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3684 {
    public static class Solution1 {
        public int[] maxKDistinct(int[] nums, int k) {
            Arrays.sort(nums);
            List<Integer> list = new ArrayList<>();
            Set<Integer> seen = new HashSet<>();
            for (int i = nums.length - 1; i >= 0 && list.size() < k; i--) {
                if (seen.add(nums[i])) {
                    list.add(nums[i]);
                }
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

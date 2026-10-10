package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3731 {
    public static class Solution1 {
        public List<Integer> findMissingElements(int[] nums) {
            int smallest = nums[0];
            int largest = nums[nums.length - 1];
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                smallest = Math.min(smallest, num);
                largest = Math.max(largest, num);
                set.add(num);
            }
            List<Integer> res = new ArrayList<>();
            for (int num = smallest; num <= largest; num++) {
                if (!set.contains(num)) {
                    res.add(num);
                }
            }
            return res;
        }
    }
}

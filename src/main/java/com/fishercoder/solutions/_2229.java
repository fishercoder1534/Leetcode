package com.fishercoder.solutions;

import java.util.TreeSet;

public class _2229 {
    public static class Solution1 {
        public boolean isConsecutive(int[] nums) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            int min = nums[0];
            int max = nums[0];
            for (int num : nums) {
                treeSet.add(num);
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            return treeSet.size() == max - min + 1 && treeSet.size() == nums.length;
        }
    }
}

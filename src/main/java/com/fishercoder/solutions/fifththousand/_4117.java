package com.fishercoder.solutions.fifththousand;

import java.util.Arrays;
import java.util.TreeSet;

public class _4117 {
    public static class Solution1 {
        public int minRange(int a, int b, int c) {
            int[] nums = new int[]{a, b, c};
            Arrays.sort(nums);
            TreeSet<Integer> seen = new TreeSet<>();
            while (true) {
                int diff = nums[2] - nums[0];
                if (!seen.add(diff) || diff == 0 || seen.first() < diff) {
                    return seen.first();
                }
                nums[2] = nums[0] + nums[1];
                Arrays.sort(nums);
            }
        }
    }
}

package com.fishercoder.solutions.first_thousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _163 {
    public static class Solution1 {
        public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
            List<List<Integer>> missingRanges = new ArrayList<>();
            if (nums == null || nums.length == 0) {
                missingRanges.add(Arrays.asList(lower, upper));
                return missingRanges;
            }
            //check for missing numbers between lower and nums[0]
            if (lower < nums[0]) {
                missingRanges.add(Arrays.asList(lower, nums[0] - 1));
            }
            //check for missing numbers between nums
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] + 1 == nums[i + 1]) {
                    continue;
                }
                missingRanges.add(Arrays.asList(nums[i] + 1, nums[i + 1] - 1));
            }
            //check for any missing numbers between nums[n - 1] and upper
            if (nums[nums.length - 1] < upper) {
                missingRanges.add(Arrays.asList(nums[nums.length - 1] + 1, upper));
            }
            return missingRanges;
        }
    }
}

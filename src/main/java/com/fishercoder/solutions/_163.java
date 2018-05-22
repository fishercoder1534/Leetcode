package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 163. Missing Ranges
 *
 * Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.
 * For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].
 */
public class _163 {
    public static class Solution1 {
        public List<String> findMissingRanges(int[] nums, int lower, int upper) {
            List<String> result = new ArrayList<>();
            long low = (long) lower - 1;
            long up = 0;
            for (int i = 0; i <= nums.length; i++) {
                if (i == nums.length) {
                    up = (long) upper + 1;
                } else {
                    up = nums[i];
                }
                if (up == low + 2) {
                    result.add(low + 1 + "");
                } else if (up > low + 2) {
                    result.add((low + 1) + "->" + (up - 1));
                }
                low = up;
            }
            return result;
        }
    }
}

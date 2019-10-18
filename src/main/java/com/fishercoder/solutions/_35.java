package com.fishercoder.solutions;

/**
 * 35. Search Insert Position
 *
 * Given a sorted array and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 */

public class _35 {

    public static class Solution1 {
        public int searchInsert(int[] nums, int target) {
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (target <= nums[i]) {
                    return i;
                }
            }
            return len;
        }
    }

}

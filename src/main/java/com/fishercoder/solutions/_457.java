package com.fishercoder.solutions;

/**
 * 457. Circular Array Loop
 *
 * You are given an array of positive and negative integers.
 * If a number n at an index is positive, then move forward n steps.
 * Conversely, if it's negative (-n), move backward n steps.
 *
 * Assume the first element of the array is forward next to the last element,
 * and the last element is backward next to the first element.
 * Determine if there is a loop in this array.
 * A loop starts and ends at a particular index with more than 1 element along the loop. The loop must be "forward" or "backward'.
 *
 * Example 1: Given the array [2, -1, 1, 2, 2], there is a loop, from index 0 -> 2 -> 3 -> 0.
 * Example 2: Given the array [-1, 2], there is no loop.
 *
 * Note: The given array is guaranteed to contain no element "0".
 *
 * Can you do it in O(n) time complexity and O(1) space complexity?
 */
public class _457 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/66894/java-slow-fast-pointer-solution
         */
        public boolean circularArrayLoop(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    continue;
                }
                // slow/fast pointer
                int j = i;
                int k = getIndex(i, nums);
                while (nums[k] * nums[i] > 0 && nums[getIndex(k, nums)] * nums[i] > 0) {
                    if (j == k) {
                        // check for loop with only one element
                        if (j == getIndex(j, nums)) {
                            break;
                        }
                        return true;
                    }
                    j = getIndex(j, nums);
                    k = getIndex(getIndex(k, nums), nums);
                }
                // loop not found, set all element along the way to 0
                j = i;
                int val = nums[i];
                while (nums[j] * val > 0) {
                    int next = getIndex(j, nums);
                    nums[j] = 0;
                    j = next;
                }
            }
            return false;
        }

        public int getIndex(int i, int[] nums) {
            int n = nums.length;
            return i + nums[i] >= 0 ? (i + nums[i]) % n : n + ((i + nums[i]) % n);
        }
    }
}

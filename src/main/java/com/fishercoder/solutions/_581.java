package com.fishercoder.solutions;

import java.util.Arrays;

public class _581 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/89282/java-o-n-time-o-1-space
         * Use start and end to keep track of the minimum subarray nums[start...end] which must be sorted for the entire array nums.
         * If start < end < 0 at the end of the for loop, then the array is already fully sorted.
         * <p>
         * Time: O(n)
         * Space: O(1)
         */
        public int findUnsortedSubarray(int[] nums) {
            int n = nums.length;
            int start = -1;
            int end = -2;
            int min = nums[n - 1];
            int max = nums[0];
            for (int i = 1; i < n; i++) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[n - 1 - i]);
                if (nums[i] < max) {
                    end = i;
                }
                if (nums[n - 1 - i] > min) {
                    start = n - 1 - i;
                }
            }
            return end - start + 1;
        }
    }

    public static class Solution2 {
        /**
         * Time: O(n)
         * Space: O(1)
         * <p>
         * This is just an alternative way of writing Solution1, credit: https://leetcode.com/problems/shortest-unsorted-continuous-subarray/discuss/103057/Java-O(n)-Time-O(1)-Space/106306
         *
         * But still, initializing end to be -2 is an art to take care of the corner case as in Solution1.
         */
        public int findUnsortedSubarray(int[] nums) {
            int end = -2;
            int max = Integer.MIN_VALUE;
            //go from left to right, find the number that is smaller than the max number on its left side, that should be the end index because it needs to be sorted
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                if (nums[i] < max) {
                    end = i;
                }
            }
            int start = -1;
            int min = Integer.MAX_VALUE;
            //go from right to left, find the number that is bigger than the min number on its right, that should be the beginning index
            for (int i = nums.length - 1; i >= 0; i--) {
                min = Math.min(min, nums[i]);
                if (nums[i] > min) {
                    start = i;
                }
            }
            return end - start + 1;
        }
    }

    public static class Solution3 {
        /**
         * Time: O(nlogn)
         * Space: O(n)
         */
        public int findUnsortedSubarray(int[] nums) {
            int[] clones = nums.clone();
            Arrays.sort(clones);
            int start = nums.length;
            int end = 0;
            for (int i = 0; i < nums.length; i++) {
                if (clones[i] != nums[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            return (end - start > 0) ? end - start + 1 : 0;
        }
    }

}

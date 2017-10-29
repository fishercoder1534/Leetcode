package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 719. Find K-th Smallest Pair Distance
 *
 * Given an integer array, return the k-th smallest distance among all the pairs.
 * The distance of a pair (A, B) is defined as the absolute difference between A and B.

 Example 1:
 Input:
 nums = [1,3,1]
 k = 1
 Output: 0
 Explanation:
 Here are all the pairs:
 (1,3) -> 2
 (1,1) -> 0
 (3,1) -> 2
 Then the 1st smallest distance pair is (1,1), and its distance is 0.

 Note:
 2 <= len(nums) <= 10000.
 0 <= nums[i] < 1000000.
 1 <= k <= len(nums) * (len(nums) - 1) / 2.
 */

public class _719 {
    public static class Solution1 {
        /**
         * This brute force solution results in TLE of course.
         */
        public int smallestDistancePair(int[] nums, int k) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    minHeap.offer(Math.abs(nums[j] - nums[i]));
                }
            }

            int result = 0;
            while (k-- > 0) {
                result = minHeap.poll();
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/articles/find-k-th-smallest-pair-distance/#approach-3-binary-search-sliding-window-accepted
         */
        public int smallestDistancePair(int[] nums, int k) {
            Arrays.sort(nums);
            int lo = 0;
            int hi = nums[nums.length - 1] - nums[0];
            while (lo < hi) {
                int mi = (lo + hi) / 2;
                int count = 0;
                int left = 0;
                for (int right = 0; right < nums.length; ++right) {
                    while (nums[right] - nums[left] > mi) {
                        left++;
                    }
                    count += right - left;
                }
                //count = number of pairs with distance <= mi
                if (count >= k) {
                    hi = mi;
                } else {
                    lo = mi + 1;
                }
            }
            return lo;
        }
    }
}

package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2762 {
    public static class Solution1 {
        /**
         * Sliding window + monotonic deque to achieve O(n) space and O(n) time.
         */
        public long continuousSubarrays(int[] nums) {
            Deque<Integer> decreasing = new ArrayDeque<>();
            Deque<Integer> increasing = new ArrayDeque<>();
            long ans = 0;
            int left = 0;
            for (int right = 0; right < nums.length; right++) {
                while (!decreasing.isEmpty() && nums[decreasing.peekLast()] <= nums[right]) {
                    decreasing.pollLast();
                }
                decreasing.addLast(right);

                while (!increasing.isEmpty() && nums[increasing.peekLast()] >= nums[right]) {
                    increasing.pollLast();
                }
                increasing.addLast(right);

                while (nums[decreasing.peekFirst()] - nums[increasing.peekFirst()] > 2) {
                    left++;
                    if (decreasing.peekFirst() < left) {
                        decreasing.pollFirst();
                    }
                    if (increasing.peekFirst() < left) {
                        increasing.pollFirst();
                    }
                }

                ans += right - left + 1;
            }
            return ans;
        }
    }
}

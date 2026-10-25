package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2762 {
    public static class Solution1 {
        /**
         * Sliding window + monotonic deque to achieve O(n) space and O(n) time.
         */
        public long continuousSubarrays(int[] nums) {
            Deque<Integer> maxDeque = new ArrayDeque<>();
            Deque<Integer> minDeque = new ArrayDeque<>();
            long ans = 0;
            int left = 0;
            for (int right = 0; right < nums.length; right++) {
                //maintain the decreasing order (max tracker)
                while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) {
                    maxDeque.pollLast();
                }
                maxDeque.addLast(right);

                //maintain the increasing order (min tracker)
                while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right]) {
                    minDeque.pollLast();
                }
                minDeque.addLast(right);

                //contract the window when the condition is broken, you can change this condition depending on the problem variant
                while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > 2) {
                    left++;
                    if (maxDeque.peekFirst() < left) {
                        maxDeque.pollFirst();
                    }
                    if (minDeque.peekFirst() < left) {
                        minDeque.pollFirst();
                    }
                }

                ans += right - left + 1;
            }
            return ans;
        }
    }
}

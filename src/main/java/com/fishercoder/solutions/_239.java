package com.fishercoder.solutions;

import java.util.LinkedList;

public class _239 {

    public static class Solution1 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            if (n == 0) {
                return nums;
            }
            int[] result = new int[n - k + 1];
            LinkedList<Integer> dq = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (!dq.isEmpty() && dq.peek() < i - k + 1) {
                    dq.poll();
                }
                while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                    dq.pollLast();
                }
                dq.offer(i);
                if (i - k + 1 >= 0) {
                    result[i - k + 1] = nums[dq.peek()];
                }
            }
            return result;
        }
    }
}

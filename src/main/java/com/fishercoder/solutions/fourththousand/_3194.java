package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _3194 {
    public static class Solution1 {
        public double minimumAverage(int[] nums) {
            PriorityQueue<Double> minHeap = new PriorityQueue<>();
            Arrays.sort(nums);
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                double ave = ((double) nums[left] + nums[right]) / 2;
                minHeap.offer(ave);
                left++;
                right--;
            }
            return minHeap.poll();
        }
    }
}

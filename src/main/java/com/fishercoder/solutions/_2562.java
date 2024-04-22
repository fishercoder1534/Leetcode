package com.fishercoder.solutions;

public class _2562 {
    public static class Solution1 {
        public long findTheArrayConcVal(int[] nums) {
            long sum = 0;
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int first = nums[left++];
                int last = nums[right--];
                int times = 1;
                sum += last;
                while (last != 0) {
                    last /= 10;
                    times *= 10;
                }
                sum += first * times;
            }
            if (left == right) {
                sum += nums[left];
            }
            return sum;
        }
    }
}

package com.fishercoder.solutions;

public class _2535 {
    public static class Solution1 {
        public int differenceOfSum(int[] nums) {
            long elementSum = 0l;
            long digitSum = 0l;
            for (int num : nums) {
                elementSum += num;
                while (num != 0) {
                    digitSum += num % 10;
                    num /= 10;
                }
            }
            return (int) Math.abs(elementSum - digitSum);
        }
    }
}

package com.fishercoder.solutions.thirdthousand;

public class _2535 {
    public static class Solution1 {
        public int differenceOfSum(int[] nums) {
            long elementSum = 0L;
            long digitSum = 0L;
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

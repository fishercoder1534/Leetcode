package com.fishercoder.solutions;

public class _1785 {
    public static class Solution1 {
        public int minElements(int[] nums, int limit, int goal) {
            long sum = 0;
            for (int num : nums) {
                sum += num;
            }
            long diff = Math.abs(goal - sum);
            return diff % limit == 0 ? (int) (diff / limit) : (int) ((diff / limit) + 1);
        }
    }
}

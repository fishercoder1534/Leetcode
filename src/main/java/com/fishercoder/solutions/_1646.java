package com.fishercoder.solutions;

public class _1646 {
    public static class Solution1 {
        public int getMaximumGenerated(int n) {
            if (n == 0) {
                return 0;
            }
            int[] nums = new int[n + 1];
            nums[0] = 0;
            nums[1] = 1;
            int max = 1;
            for (int i = 1; i <= n / 2; i++) {
                nums[(i * 2)] = nums[i];
                max = Math.max(max, nums[i]);
                if ((i * 2) + 1 <= n) {
                    nums[(i * 2) + 1] = nums[i] + nums[i + 1];
                    max = Math.max(max, nums[(i * 2) + 1]);
                }
            }
            return max;
        }
    }
}

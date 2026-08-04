package com.fishercoder.solutions.secondthousand;

import java.util.Arrays;

public class _1979 {
    public static class Solution1 {
        public int findGCD(int[] nums) {
            Arrays.sort(nums);
            return getGcd(nums[0], nums[nums.length - 1]);
        }

        int getGcd(int a, int b) {
            return b == 0 ? a : getGcd(b, a % b);
        }
    }

    public static class Solution2 {
        public int findGCD(int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            return gcd(min, max);
        }

        private int gcd(int x, int y) {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        }
    }
}

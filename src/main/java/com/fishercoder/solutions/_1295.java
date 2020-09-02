package com.fishercoder.solutions;

import java.util.Arrays;

public class _1295 {
    public static class Solution1 {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (String.valueOf(num).length() % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        public int findNumbers(int[] nums) {
            return (int) Arrays.stream(nums).filter(num -> String.valueOf(num).length() % 2 == 0).count();
        }
    }
}

package com.fishercoder.solutions;

import java.util.Arrays;

public class _645 {
    public static class Solution1 {
        public int[] findErrorNums(int[] nums) {
            int[] result = new int[2];
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] == nums[i]) {
                    result[0] = nums[i];
                }
            }
            long temp = 0;
            for (int i = 0; i < nums.length; i++) {
                temp += i + 1;
                temp -= nums[i];
            }
            temp += result[0];
            result[1] = (int) temp;
            return result;
        }
    }
}

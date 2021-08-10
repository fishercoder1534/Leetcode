package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public static class Solution2 {
        public int[] findErrorNums(int[] nums) {
            Set<Integer> set = new HashSet();
            boolean[] has = new boolean[nums.length];
            int dup = -1;
            for (int i = 0; i < nums.length; i++) {
                has[nums[i] - 1] = true;
                if (!set.add(nums[i])) {
                    dup = nums[i];
                }
            }
            int dup2 = -1;
            for (int i = 0; i < has.length; i++) {
                if (!has[i]) {
                    dup2 = i + 1;
                }
            }
            return new int[]{dup, dup2};
        }
    }

    public static class Solution3 {
        public int[] findErrorNums(int[] nums) {
            int[] arr = new int[nums.length];
            Set<Integer> set = new HashSet<>();
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = i + 1;
                if (!set.add(nums[i])) {
                    result[0] = nums[i];
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (!set.contains(i + 1)) {
                    result[1] = i + 1;
                }
            }
            return result;
        }
    }
}

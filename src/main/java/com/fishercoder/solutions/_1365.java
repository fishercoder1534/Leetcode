package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1365 {
    public static class Solution1 {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] result = new int[nums.length];
            int[] tmp = Arrays.copyOf(nums, nums.length);
            Arrays.sort(tmp);
            List<Integer> list = new ArrayList<>();
            for (int i : tmp) {
                list.add(i);
            }
            for (int i = 0; i < nums.length; i++) {
                result[i] = list.indexOf(nums[i]);
            }
            return result;
        }
    }
}

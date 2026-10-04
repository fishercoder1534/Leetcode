package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3912 {
    public static class Solution1 {
        public List<Integer> findValidElements(int[] nums) {
            boolean[] valid = new boolean[nums.length];
            valid[0] = true;
            valid[nums.length - 1] = true;
            int leftMax = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > leftMax) {
                    leftMax = nums[i];
                    valid[i] = true;
                }
            }
            int rightMax = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] > rightMax) {
                    rightMax = nums[i];
                    valid[i] = true;
                }
            }
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (valid[i]) {
                    result.add(nums[i]);
                }
            }
            return result;
        }
    }
}

package com.fishercoder.solutions.fourththousand;

public class _3024 {
    public static class Solution1 {
        public String triangleType(int[] nums) {
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral";
            } else {
                if (!validTriangle(nums)) {
                    return "none";
                } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
                    return "isosceles";
                } else {
                    return "scalene";
                }
            }
        }

        private boolean validTriangle(int[] nums) {
            return nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[0] + nums[2] > nums[1];
        }
    }
}

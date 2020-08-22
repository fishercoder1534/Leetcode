package com.fishercoder.solutions;

public class _1558 {
    public static class Solution1 {
        public int minOperations(int[] nums) {
            int ops = 0;
            while (!allZero(nums)) {
                if (allEvenAndNonZeroes(nums)) {
                    nums = half(nums);
                    ops++;
                } else if (hasOdds(nums)) {
                    int[] result = new int[nums.length];
                    for (int i = 0; i < nums.length; i++) {
                        if (nums[i] % 2 != 0) {
                            result[i] = nums[i] - 1;
                            ops++;
                        } else {
                            result[i] = nums[i];
                        }
                    }
                    nums = result;
                } else {
                    int[] result = new int[nums.length];
                    for (int i = 0; i < nums.length; i++) {
                        if (nums[i] != 0) {
                            result[i] = nums[i] / 2;
                        } else {
                            result[i] = nums[i];
                        }
                    }
                    nums = result;
                    ops++;
                }
            }
            return ops;
        }

        private boolean hasOdds(int[] nums) {
            for (int i : nums) {
                if (i % 2 != 0) {
                    return true;
                }
            }
            return false;
        }

        private int[] half(int[] nums) {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] / 2;
            }
            return result;
        }

        private boolean allEvenAndNonZeroes(int[] nums) {
            for (int i : nums) {
                if (i % 2 != 0 || i == 0) {
                    return false;
                }
            }
            return true;
        }

        private boolean allZero(int[] nums) {
            for (int i : nums) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

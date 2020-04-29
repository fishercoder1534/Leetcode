package com.fishercoder.solutions;

public class _41 {

    public static class Solution1 {
        /**
         * Time: O(n) Space: O(1)
         * Idea: put every number in its right position, e.g. put 5 in nums[4].
         */
        public int firstMissingPositive(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (nums[i] > 0 && nums[i] != i + 1 && nums[i] - 1 < nums.length && nums[i] != nums[nums[i]
                        - 1]) {
                    swap(nums, i, nums[i] - 1);
                } else {
                    i++;
                }
            }

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j + 1) {
                    return j + 1;
                }
            }

            return nums.length + 1;
        }

        void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

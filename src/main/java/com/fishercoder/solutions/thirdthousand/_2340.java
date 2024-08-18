package com.fishercoder.solutions.thirdthousand;

public class _2340 {
    public static class Solution1 {
        public int minimumSwaps(int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            int minIndex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (min == nums[i]) {
                    minIndex = i;
                    break;
                }
            }
            int minSwaps = 0;
            // now move the leftmost smallest index to the beginning of the array
            for (int i = minIndex; i > 0; i--) {
                swap(nums, i, i - 1);
                minSwaps++;
            }

            int maxIndex = -1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (max == nums[i]) {
                    maxIndex = i;
                    break;
                }
            }

            // now move the leftmost smallest index to the beginning of the array
            for (int i = maxIndex; i < nums.length - 1; i++) {
                swap(nums, i, i + 1); // this line is optional at this point
                minSwaps++;
            }

            return minSwaps;
        }

        private void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}

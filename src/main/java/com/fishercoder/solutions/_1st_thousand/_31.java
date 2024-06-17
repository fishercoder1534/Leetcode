package com.fishercoder.solutions._1st_thousand;

public class _31 {
    public static class Solution1 {
        /**
         * Leetcode has a very good article to illustrate this problem and with animation:
         * https://leetcode.com/articles/next-permutation/
         * 1. if the array is already in decrementing order, then there's no next larger permutation possible.
         * 2. if not, start from the end of the array, find the first pair of numbers that break the decrementing order
         * 3. then from that index going to the right again, find the element that is closest bigger than this number, swap them
         * 4. reverse the right half of this array after this index to make it sorted increasingly so that it's the next permutation
         * <p>
         * Use this nums as an example: 1,2,5,4,3
         * 1. we first found such an adjacent pair: 2 and 5 that breaks the decrementing order;
         * 2. then starting from the right side again, we find a number that's bigger than 2, so that is 3, swap them, the array becomes: 1,3,5,4,2
         * 3. reverse this sub-array: 5,4,2 since they are guaranteed to be decreasing order, so reversing them will give us the next permutation: 1,3,2,4,5
         */

        public void nextPermutation(int[] nums) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }
            if (i >= 0) {
                int j = nums.length - 1;
                while (j >= 0 && nums[i] >= nums[j]) {
                    j--;
                }

                swap(nums, i, j);
            }

            reverse(nums, i + 1);
        }

        private void reverse(int[] nums, int start) {
            int end = nums.length - 1;
            while (start <= end) {
                swap(nums, start++, end--);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}

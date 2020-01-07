package com.fishercoder.solutions;

/**
 * 283. Move Zeroes
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.*/
public class _283 {
    public static class Solution1 {
        public void moveZeroes(int[] nums) {
            //keep the last non-zero index and keep overwriting it, then append zeroes to fill the end
            int j = 0;
            int i = 0;
            for (; j < nums.length; j++) {
                if (nums[j] != 0) {
                    nums[i++] = nums[j];
                }
            }
            for (; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }

    public static class Solution2 {
        public void moveZeroes(int[] nums) {
            //this solutoin is the most optimal since it minimizes the number of operations
            //the idea is to swap the non-zero element to the first zero number position
            for (int i = 0, j = 0; i < nums.length && j < nums.length; j++) {
                if (nums[j] != 0) {
                    int temp = nums[i];
                    nums[i++] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    //then I came up with this solution and got it AC'ed! Cheers!
    //basically, find the next non-zero number and swap it with the current zero number
    //Apparently it's not the most optimal, since this is basically an O(n^2) solution, then I turned to Editorial solutions
    public static class Solution3 {
        public void moveZeroes(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    int j = i + 1;
                    while (j < nums.length && nums[j] == 0) {
                        j++;
                    }
                    if (j >= nums.length) {
                        return;
                    } else {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }
    }

}

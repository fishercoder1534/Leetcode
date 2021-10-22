package com.fishercoder.solutions;

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
            //this solution is the most optimal since it minimizes the number of operations
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

    public static class Solution4 {
        /**
         * I'm glad that I finally figured this one out completely on my own, this O(n) time, O(1) space solution.
         */
        public void moveZeroes(int[] nums) {
            int i = 0;//zero index
            int j = 0;//non zero index
            while (i < nums.length && j < nums.length) {
                if (nums[j] != 0) {
                    if (i < j) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                    }
                }
                j++;
                while (i < nums.length && nums[i] != 0) {
                    i++;
                }
            }
        }
    }

}

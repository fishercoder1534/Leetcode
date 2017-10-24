package com.fishercoder.solutions;

/**
 * 494. Target Sum
 *
 *  You are given a list of non-negative integers, a1, a2, ..., an, and a target, S.
 *  Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
 *  Find out how many ways to assign symbols to make sum of integers equal to target S.

 Example 1:

 Input: nums is [1, 1, 1, 1, 1], S is 3.
 Output: 5
 Explanation:

 -1+1+1+1+1 = 3
 +1-1+1+1+1 = 3
 +1+1-1+1+1 = 3
 +1+1+1-1+1 = 3
 +1+1+1+1-1 = 3

 There are 5 ways to assign symbols to make the sum of nums be target 3.

 Note:

 The length of the given array is positive and will not exceed 20.
 The sum of elements in the given array will not exceed 1000.
 Your output answer is guaranteed to be fitted in a 32-bit integer.

 */
public class _494 {

    public static class Solution1 {
        public int findTargetSumWays(int[] nums, int S) {
            return find(0, nums, S);
        }

        private int find(int p, int[] nums, int sum) {
            if (p == nums.length) {
                if (sum == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return find(p + 1, nums, sum + nums[p]) + find(p + 1, nums, sum - nums[p]);
        }
    }

}
package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 462. Minimum Moves to Equal Array Elements II
 *
 * Given a non-empty integer array,
 * find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing a selected element by 1 or decrementing a selected element by 1.
 *
 * You may assume the array's length is at most 10,000.

 Example:

 Input:
 [1,2,3]

 Output:
 2

 Explanation:
 Only two moves are needed (remember each move increments or decrements one element):

 [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
 */

public class _462 {

    public static class Solution1 {
        public int minMoves2(int[] nums) {
            /**sort this array, find the median of this array as the pivot*/
            Arrays.sort(nums);
            int result = 0;
            int result1 = 0;
            if (nums.length % 2 != 0) {
                int median = nums[nums.length / 2];
                for (int n : nums) {
                    result += Math.abs(n - median);
                }
                return result;
            } else {
                int median1 = nums[nums.length / 2];
                for (int n : nums) {
                    result1 += Math.abs(n - median1);
                }
                int result2 = 0;
                int median2 = nums[nums.length / 2 - 1];
                for (int n : nums) {
                    result2 += Math.abs(n - median2);
                }
                result1 = Math.min(result1, result2);
                return result1;
            }
        }
    }

}

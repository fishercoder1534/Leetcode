package com.fishercoder.solutions;

import java.util.Arrays;

public class _300 {

    /**
     * credit: https://leetcode.com/problems/longest-increasing-subsequence/solution/
     */
    public static class Solution1 {
        /**
         * brute force:
         * Time: O(2^n), size of recursion tree will be: 2^n
         * Space: O(n^2)
         * will result in Time Limit Exceeded exception.
         * <p>
         * The idea is straightforward: we'll iterate through each number, check to see if its next neighbor is smaller or bigger than itself,
         * if bigger, then we'll take it, if not, we'll not take it.
         */
        public int lengthOfLIS(int[] nums) {
            return recursion(nums, Integer.MIN_VALUE, 0);
        }

        private int recursion(int[] nums, int prev, int curr) {
            if (curr == nums.length) {
                return 0;
            }
            int taken = 0;
            if (nums[curr] > prev) {
                taken = 1 + recursion(nums, nums[curr], curr + 1);
            }
            int notTaken = recursion(nums, prev, curr + 1);
            return Math.max(taken, notTaken);
        }
    }

    public static class Solution2 {
        /**
         * This is an iteration on the previous solution, we use a 2-d array to memoize the previously calculated result
         * Time: O(n^2)
         * Space: O(n^2)
         */
        public int lengthOfLIS(int[] nums) {
            int len = nums.length;
            int[][] memo = new int[len + 1][len];
            for (int[] m : memo) {
                Arrays.fill(m, -1);
            }
            return recusionWithMemo(nums, -1, 0, memo);
        }

        private int recusionWithMemo(int[] nums, int prevIndex, int currIndex, int[][] memo) {
            if (currIndex == nums.length) {
                return 0;
            }
            if (memo[prevIndex + 1][currIndex] >= 0) {
                //because we initialize all elements in memo to be -1,
                // so if it's not -1, then it means we have computed this value before,
                // we'll just return it and this way it avoid duplicate recursion
                return memo[prevIndex + 1][currIndex];
            }
            int taken = 0;
            if (prevIndex < 0 || nums[currIndex] > nums[prevIndex]) {
                taken = 1 + recusionWithMemo(nums, currIndex, currIndex + 1, memo);
            }
            int notTaken = recusionWithMemo(nums, prevIndex, currIndex + 1, memo);
            memo[prevIndex + 1][currIndex] = Math.max(taken, notTaken);
            return memo[prevIndex + 1][currIndex];
        }
    }

    public static class Solution3 {
        /**
         * DP solution
         * Time: O(n^2)
         * Space: O(n)
         */
        public int lengthOfLIS(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int[] dp = new int[nums.length];
            dp[0] = 1;
            int result = 1;
            for (int i = 1; i < nums.length; i++) {
                int maxVal = 0;
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        maxVal = Math.max(maxVal, dp[j]);
                    }
                }
                dp[i] = maxVal + 1;
                result = Math.max(result, dp[i]);
            }
            return result;
        }
    }

    public static class Solution4 {
        /**
         * use binary search.
         * Time: O(nlogn)
         * Space: O(n)
         * <p>
         * The reason we can use binary search here is because all numbers we put into dp array are sorted.
         * Arrays.binarySearch() method returns index of the search key,
         * if it is contained in the array, else it returns (-(insertion point) - 1).
         * The insertion point is the point at which the key would be inserted into the array:
         * the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key.
         */
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            int len = 0;
            for (int num : nums) {
                int index = Arrays.binarySearch(dp, 0, len, num);
                if (index < 0) {
                    index = -(index + 1);
                }
                dp[index] = num;
                if (index == len) {
                    len++;
                }
            }
            return len;
        }
    }
}

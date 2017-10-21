package com.fishercoder.solutions;

/**
 * 698. Partition to K Equal Sum Subsets
 *
 * Given an array of integers nums and a positive integer k,
 * find whether it's possible to divide this array into k non-empty subsets whose sums are all equal.

 Example 1:

 Input: nums = [4, 3, 2, 3, 5, 2, 1], k = 4
 Output: True
 Explanation: It's possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.

 Note:
 1 <= k <= len(nums) <= 16.
 0 < nums[i] < 10000.
 */
public class _698 {

    public static class Solution1 {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            long sum = 0;
            for (int num : nums) {
                sum += num;
            }
            if (sum % k != 0) {
                return false;
            }
            int equalSum = (int) (sum / k);
            boolean[] visited = new boolean[nums.length];
            return canPartition(nums, visited, 0, k, 0, 0, equalSum);
        }

        private boolean canPartition(int[] nums, boolean[] visited, int startIndex, int k, int currSum, int currNum, int target) {
            if (k == 1) {
                return true;
            }
            if (currSum == target && currNum > 0) {
                /**Everytime when we get currSum == target, we'll start from index 0 and look up the numbers that are not used yet
                 * and try to find another sum that could equal to target*/
                return canPartition(nums, visited, 0, k - 1, 0, 0, target);
            }
            for (int i = startIndex; i < nums.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    if (canPartition(nums, visited, i + 1, k, currSum + nums[i], currNum++, target)) {
                        return true;
                    }
                    visited[i] = false;
                }
            }
            return false;
        }
    }

}

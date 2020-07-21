package com.fishercoder.solutions;

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

package com.fishercoder.solutions;

import java.util.Arrays;

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

    public static class Solution2 {
        /**
         * I'm glad that I figured out below solution completely on my own on 9/30/2021.
         * Backtracking is so beautiful!
         * <p>
         * Although not super concise, and I've added a sorting step, it's completely original.
         */
        public boolean canPartitionKSubsets(int[] nums, int k) {
            Arrays.sort(nums);
            long sum = 0l;
            for (int num : nums) {
                sum += num;
            }
            int ave = (int) sum / k;
            if (sum % k != 0) {
                return false;
            }
            boolean[] used = new boolean[nums.length];
            int found = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (!used[i]) {
                    used[i] = true;
                    found += recursive(nums, used, ave, nums[i], i);
                }
            }
            return k == found;
        }

        private int recursive(int[] nums, boolean[] used, int targetSum, int currSum, int currIndex) {
            if (currSum == targetSum) {
                return 1;
            } else if (currSum > targetSum) {
                used[currIndex] = false;
                return 0;
            } else {
                if (currIndex > 0) {
                    for (int i = currIndex; i > 0; i--) {
                        if (!used[i - 1]) {
                            used[i - 1] = true;
                            int found = recursive(nums, used, targetSum, currSum + nums[i - 1], i - 1);
                            if (found == 1) {
                                return found;
                            }
                            used[i - 1] = false;//this is the backtracking step: reset this number to be available if not found
                        }
                    }
                }
                return 0;
            }
        }
    }

}

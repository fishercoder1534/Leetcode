package com.fishercoder.solutions.fifththousand;

public class _4099 {
    public static class Solution1 {
        /**
         * My completely original solution, but didn't have time to do it during the Contest as I was with my kids at Halloween party...
         */
        public int minOperations(int[] nums, int[] locked, int k) {
            int minOps = 0;
            int unlockOps = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) {
                    if (locked[i] == 1) {
                        locked[i] = 0;
                        unlockOps++;
                    }
                    //if it's right neighbor is locked, we'll also have to unlock it
                    if (i + 1 < locked.length && locked[i + 1] == 1) {
                        locked[i + 1] = 0;
                        unlockOps++;
                    }
                    if (unlockOps > k) {
                        return -1;
                    }
                    //only when it's not in increasing order, we'll swap them
                    if (i + 1 < nums.length && nums[i] > nums[i + 1]) {
                        swap(i, i + 1, nums);
                        minOps++;
                    }
                }
            }
            if (unlockOps > k) {
                return -1;
            }
            while (!isStrictlyIncreasing(nums)) {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != i + 1 && i + 1 < nums.length && nums[i] > nums[i + 1]) {
                        minOps++;
                        swap(i, i + 1, nums);
                        break;
                    }
                }
            }
            return minOps + unlockOps;
        }

        private void swap(int i, int j, int[] nums) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        private boolean isStrictlyIncreasing(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) {
                    return false;
                }
            }
            return true;
        }
    }
}

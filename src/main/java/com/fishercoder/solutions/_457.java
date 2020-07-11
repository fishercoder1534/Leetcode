package com.fishercoder.solutions;

public class _457 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/66894/java-slow-fast-pointer-solution
         */
        public boolean circularArrayLoop(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    continue;
                }
                // slow/fast pointer
                int j = i;
                int k = getIndex(i, nums);
                while (nums[k] * nums[i] > 0 && nums[getIndex(k, nums)] * nums[i] > 0) {
                    if (j == k) {
                        // check for loop with only one element
                        if (j == getIndex(j, nums)) {
                            break;
                        }
                        return true;
                    }
                    j = getIndex(j, nums);
                    k = getIndex(getIndex(k, nums), nums);
                }
                // loop not found, set all element along the way to 0
                j = i;
                int val = nums[i];
                while (nums[j] * val > 0) {
                    int next = getIndex(j, nums);
                    nums[j] = 0;
                    j = next;
                }
            }
            return false;
        }

        public int getIndex(int i, int[] nums) {
            int n = nums.length;
            return i + nums[i] >= 0 ? (i + nums[i]) % n : n + ((i + nums[i]) % n);
        }
    }
}

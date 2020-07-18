package com.fishercoder.solutions;

public class _673 {
    public static class Solution1 {
        /**
         * Reference: https://discuss.leetcode.com/topic/103020/java-c-simple-dp-solution-with-explanation
         */
        public int findNumberOfLIS(int[] nums) {
            int n = nums.length;
            int[] cnt = new int[n];
            int[] len = new int[n];
            int max = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                len[i] = cnt[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        if (len[i] == len[j] + 1) {
                            cnt[i] += cnt[j];
                        }
                        if (len[i] < len[j] + 1) {
                            len[i] = len[j] + 1;
                            cnt[i] = cnt[j];
                        }
                    }
                }

                if (max == len[i]) {
                    count += cnt[i];
                }

                if (len[i] > max) {
                    max = len[i];
                    count = cnt[i];
                }
            }
            return count;
        }
    }
}

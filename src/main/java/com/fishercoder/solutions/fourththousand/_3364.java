package com.fishercoder.solutions.fourththousand;

import java.util.List;

public class _3364 {
    public static class Solution1 {
        public int minimumSumSubarray(List<Integer> nums, int l, int r) {
            int minSum = Integer.MAX_VALUE;
            for (int len = l; len <= r; len++) {
                int sum = findSmallestSum(nums, len);
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
            return minSum == Integer.MAX_VALUE ? -1 : minSum;
        }

        private int findSmallestSum(List<Integer> nums, int len) {
            int sum = 0;
            int i = 0;
            for (; i < len; i++) {
                sum += nums.get(i);
            }
            int minSum = Integer.MAX_VALUE;
            if (sum > 0) {
                minSum = sum;
            }
            for (; i < nums.size(); i++) {
                sum -= nums.get(i - len);
                sum += nums.get(i);
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
            return minSum;
        }
    }

    public static class Solution2 {

        /**
         * My completely original solution using prefix sum.
         */
        public int minimumSumSubarray(List<Integer> nums, int l, int r) {
            int[] prefixSums = new int[nums.size()];
            prefixSums[0] = nums.get(0);
            for (int i = 1; i < nums.size(); i++) {
                prefixSums[i] = prefixSums[i - 1] + nums.get(i);
            }
            int ans = Integer.MAX_VALUE;
            int len = l;
            while (len <= r) {
                for (int i = len - 1; i < nums.size(); i++) {
                    if (i - len >= 0) {
                        if (prefixSums[i] - prefixSums[i - len] > 0) {
                            ans = Math.min(ans, prefixSums[i] - prefixSums[i - len]);
                        }
                    } else if (prefixSums[i] > 0) {
                        ans = Math.min(ans, prefixSums[i]);
                    }
                }
                len++;
            }
            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
}

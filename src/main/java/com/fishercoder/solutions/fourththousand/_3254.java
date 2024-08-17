package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3254 {
    public static class Solution1 {
        public int[] resultsArray(int[] nums, int k) {
            int n = nums.length;
            int[] ans = new int[n - k + 1];
            boolean sorted;
            if (k == 1) {
                return nums;
            }
            Arrays.fill(ans, -1);
            for (int i = 0; i <= n - k; i++) {
                sorted = true;
                for (int j = i + 1; j < i + k; j++) {
                    if (nums[j] != nums[j - 1] + 1) {
                        sorted = false;
                        break;
                    }
                }
                if (sorted) {
                    ans[i] = nums[i + k - 1];
                }
            }
            return ans;
        }
    }
}

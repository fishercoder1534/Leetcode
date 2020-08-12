package com.fishercoder.solutions;

public class _1198 {
    public static class Solution1 {
        public int smallestCommonElement(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            for (int j = 0; j < n; j++) {
                int minCommon = mat[0][j];
                //we'll start from the second row
                int i = 1;
                for (; i < m; i++) {
                    if (thisRowHasThisNumber(mat[i], minCommon)) {
                        continue;
                    } else {
                        break;
                    }
                }
                if (i == m) {
                    return minCommon;
                }
            }
            return -1;
        }

        private boolean thisRowHasThisNumber(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (target == nums[mid]) {
                    return true;
                } else if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
    }
}

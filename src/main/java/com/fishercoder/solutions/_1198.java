package com.fishercoder.solutions;

/**
 * 1198. Find Smallest Common Element in All Rows
 *
 * Given a matrix mat where every row is sorted in increasing order, return the smallest common element in all rows.
 * If there is no common element, return -1.
 *
 * Example 1:
 * Input: mat = [[1,2,3,4,5],[2,4,5,8,10],[3,5,7,9,11],[1,3,5,7,9]]
 * Output: 5
 *
 * Constraints:
 * 1 <= mat.length, mat[i].length <= 500
 * 1 <= mat[i][j] <= 10^4
 * mat[i] is sorted in increasing order.
 * */
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

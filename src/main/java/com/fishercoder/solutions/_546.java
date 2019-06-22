package com.fishercoder.solutions;

/**
 * 546. Remove Boxes
 *
 * Given several boxes with different colors represented by different positive numbers.
 * You may experience several rounds to remove boxes until there is no box left.
 * Each time you can choose some continuous boxes with the same color (composed of k boxes, k >= 1), remove them and get k*k points.
 * Find the maximum points you can get.

 Example 1:
 Input:

 [1, 3, 2, 2, 2, 3, 4, 3, 1]
 Output:
 23

 Explanation:
 [1, 3, 2, 2, 2, 3, 4, 3, 1]
 ----> [1, 3, 3, 4, 3, 1] (3*3=9 points)
 ----> [1, 3, 3, 3, 1] (1*1=1 points)
 ----> [1, 1] (3*3=9 points)
 ----> [] (2*2=4 points)
 Note: The number of boxes n would not exceed 100.

 */

public class _546 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/articles/remove-boxes/#approach-2-using-dp-with-memorizationaccepted
         *
         * For an entry in dp[l][r][k], l represents the starting index of the subarray,
         * r represents the ending index of the subarray
         * and k represents the number of elements similar to the r​th element
         * following it which can be combined to obtain the point information to be stored in dp[l][r][k].
         */
        public int removeBoxes(int[] boxes) {
            int[][][] dp = new int[100][100][100];
            return calculatePoints(boxes, dp, 0, boxes.length - 1, 0);
        }

        public int calculatePoints(int[] boxes, int[][][] dp, int l, int r, int k) {
            if (l > r) {
                return 0;
            }
            if (dp[l][r][k] != 0) {
                return dp[l][r][k];
            }
            while (r > l && boxes[r] == boxes[r - 1]) {
                r--;
                k++;
            }
            dp[l][r][k] = calculatePoints(boxes, dp, l, r - 1, 0) + (k + 1) * (k + 1);
            for (int i = l; i < r; i++) {
                if (boxes[i] == boxes[r]) {
                    dp[l][r][k] = Math.max(dp[l][r][k],
                            calculatePoints(boxes, dp, l, i, k + 1) + calculatePoints(boxes, dp, i + 1, r - 1, 0));
                }
            }
            return dp[l][r][k];
        }
    }
}

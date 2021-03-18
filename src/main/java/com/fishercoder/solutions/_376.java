package com.fishercoder.solutions;

public class _376 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/wiggle-subsequence/discuss/84843/Easy-understanding-DP-solution-with-O(n)-Java-version
         */
        public int wiggleMaxLength(int[] nums) {
            int len = nums.length;
            int[] up = new int[len];
            int[] down = new int[len];
            up[0] = 1;
            down[0] = 1;
            for (int i = 1; i < len; i++) {
                if (nums[i] > nums[i - 1]) {
                    up[i] = down[i - 1] + 1;
                    down[i] = down[i - 1];
                } else if (nums[i] < nums[i - 1]) {
                    down[i] = up[i - 1] + 1;
                    up[i] = up[i - 1];
                } else {
                    up[i] = up[i - 1];
                    down[i] = down[i - 1];
                }
            }
            return Math.max(down[len - 1], up[len - 1]);
        }
    }

    public static class Solution2 {
        public int wiggleMaxLength(int[] nums) {
            if (nums.length < 2) {
                return nums.length;
            }
            int prevDiff = nums[1] - nums[0];
            int count = (prevDiff != 0) ? 2 : 1;
            for (int i = 2; i < nums.length; i++) {
                int diff = nums[i] - nums[i - 1];
                /**ATTN: prevDiff could be zero. e.g. [3,3,3,2,5]
                 * but diff needs to be exactly greater than zero*/
                if ((prevDiff <= 0 && diff > 0) || (prevDiff >= 0) && diff < 0) {
                    count++;
                    prevDiff = diff;
                }
            }
            return count;
        }
    }
}

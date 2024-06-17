package com.fishercoder.solutions.first_thousand;

public class _376 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/wiggle-subsequence/discuss/84843/Easy-understanding-DP-solution-with-O(n)-Java-version
         * <p>
         * For every position in the array, there are only three possible statuses for it.
         * <p>
         * up position, it means nums[i] > nums[i-1]
         * down position, it means nums[i] < nums[i-1]
         * equals to position, nums[i] == nums[i-1]
         * So we can use two arrays up[] and down[] to record the max wiggle sequence length so far at index i.
         * If nums[i] > nums[i-1], that means it wiggles up. the element before it must be a down position. so up[i] = down[i-1] + 1; down[i] keeps the same with before.
         * If nums[i] < nums[i-1], that means it wiggles down. the element before it must be a up position. so down[i] = up[i-1] + 1; up[i] keeps the same with before.
         * If nums[i] == nums[i-1], that means it will not change anything becasue it didn't wiggle at all. so both down[i] and up[i] keep the same.
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

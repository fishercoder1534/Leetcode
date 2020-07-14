package com.fishercoder.solutions;

public class _486 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/76312/java-1-line-recursion-solution
         * Explanation
         * So assuming the sum of the array it SUM, so eventually player1 and player2 will split the SUM between themselves.
         * For player1 to win, he/she has to get more than what player2 gets.
         * If we think from the prospective of one player, then what he/she gains each time is a plus,
         * while, what the other player gains each time is a minus. Eventually if player1 can have a >0 total, player1 can win.
         * <p>
         * Helper function simulate this process. In each round:
         * if e==s, there is no choice but have to select nums[s]
         * otherwise, this current player has 2 options:
         * --> nums[s]-helper(nums,s+1,e): this player select the front item, leaving the other player a choice from s+1 to e
         * --> nums[e]-helper(nums,s,e-1): this player select the tail item, leaving the other player a choice from s to e-1
         * Then take the max of these two options as this player's selection, return it.
         */
        public boolean predictTheWinner(int[] nums) {
            return helper(nums, 0, nums.length - 1, new Integer[nums.length][nums.length]) >= 0;
        }

        private int helper(int[] nums, int start, int end, Integer[][] mem) {
            if (mem[start][end] == null) {
                mem[start][end] = start == end ? nums[end] :
                        Math.max(nums[end] - helper(nums, start, end - 1, mem),
                                nums[start] - helper(nums, start + 1, end, mem));
            }
            return mem[start][end];
        }
    }

}

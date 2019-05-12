package com.fishercoder.solutions;

/**
 * 486. Predict the Winner
 *
 * Given an array of scores that are non-negative integers.
 * Player 1 picks one of the numbers from either end of the array followed by the player 2 and then player 1 and so on.
 * Each time a player picks a number, that number will not be available for the next player.
 * This continues until all the scores have been chosen.
 * The player with the maximum score wins.
 * Given an array of scores, predict whether player 1 is the winner.
 * You can assume each player plays to maximize his score.

 Example 1:
 Input: [1, 5, 2]
 Output: False
 Explanation: Initially, player 1 can choose between 1 and 2.
 If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5, then player 1 will be left with 1 (or 2).
 So, final score of player 1 is 1 + 2 = 3, and player 2 is 5.
 Hence, player 1 will never be the winner and you need to return False.

 Example 2:
 Input: [1, 5, 233, 7]
 Output: True
 Explanation: Player 1 first chooses 1. Then player 2 have to choose between 5 and 7. No matter which number player 2 choose, player 1 can choose 233.
 Finally, player 1 has more score (234) than player 2 (12), so you need to return True representing player1 can win.

 Note:
 1 <= length of the array <= 20.
 Any scores in the given array are non-negative integers and will not exceed 10,000,000.
 If the scores of both players are equal, then player 1 is still the winner.
 */
public class _486 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/76312/java-1-line-recursion-solution
         * Explanation
         * So assuming the sum of the array it SUM, so eventually player1 and player2 will split the SUM between themselves.
         * For player1 to win, he/she has to get more than what player2 gets.
         * If we think from the prospective of one player, then what he/she gains each time is a plus,
         * while, what the other player gains each time is a minus. Eventually if player1 can have a >0 total, player1 can win.
         * 
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

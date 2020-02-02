package com.fishercoder.solutions;

/**
 * 1217. Play with Chips
 *
 * There are some chips, and the i-th chip is at position chips[i].
 * You can perform any of the two following types of moves any number of times (possibly zero) on any chip:
 *
 * Move the i-th chip by 2 units to the left or to the right with a cost of 0.
 * Move the i-th chip by 1 unit to the left or to the right with a cost of 1.
 *
 * There can be two or more chips at the same position initially.
 *
 * Return the minimum cost needed to move all the chips to the same position (any position).
 *
 * Example 1:
 * Input: chips = [1,2,3]
 * Output: 1
 * Explanation: Second chip will be moved to positon 3 with cost 1. First chip will be moved to position 3 with cost 0. Total cost is 1.
 *
 * Example 2:
 * Input: chips = [2,2,2,3,3]
 * Output: 2
 * Explanation: Both fourth and fifth chip will be moved to position two with cost 1. Total minimum cost will be 2.
 *
 * Constraints:
 * 1 <= chips.length <= 100
 * 1 <= chips[i] <= 10^9
 * */
public class _1217 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/play-with-chips/discuss/398239/C%2B%2B-3-lines*/
        public int minCostToMoveChips(int[] chips) {
            int chipsAtOddPosition = 0;
            int chipsAtEvenPosition = 0;
            for (int i = 0; i < chips.length; i++) {
                if (chips[i] % 2 == 0) {
                    chipsAtEvenPosition++;
                } else {
                    chipsAtOddPosition++;
                }
            }
            return chipsAtEvenPosition > chipsAtOddPosition ? chipsAtOddPosition : chipsAtEvenPosition;
        }
    }
}

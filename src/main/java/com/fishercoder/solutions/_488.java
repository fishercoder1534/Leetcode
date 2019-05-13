package com.fishercoder.solutions;

/**
 * 488. Zuma Game
 *
 * Think about Zuma Game. You have a row of balls on the table, colored red(R), yellow(Y), blue(B), green(G), and white(W).
 * You also have several balls in your hand.

 Each time, you may choose a ball in your hand, and insert it into the row (including the leftmost place and rightmost place).
 Then, if there is a group of 3 or more balls in the same color touching, remove these balls. Keep doing this until no more balls can be removed.

 Find the minimal balls you have to insert to remove all the balls on the table. If you cannot remove all the balls, output -1.

 Examples:

 Input: "WRRBBW", "RB"
 Output: -1
 Explanation: WRRBBW -> WRR[R]BBW -> WBBW -> WBB[B]W -> WW

 Input: "WWRRBBWW", "WRBRW"
 Output: 2
 Explanation: WWRRBBWW -> WWRR[R]BBWW -> WWBBWW -> WWBB[B]WW -> WWWW -> empty

 Input:"G", "GGGGG"
 Output: 2
 Explanation: G -> G[G] -> GG[G] -> empty

 Input: "RBYYBBRRB", "YRBGB"
 Output: 3
 Explanation: RBYYBBRRB -> RBYY[Y]BBRRB -> RBBBRRB -> RRRB -> B -> B[B] -> BB[B] -> empty

 Note:

 You may assume that the initial row of balls on the table won’t have any 3 or more consecutive balls with the same color.
 The number of balls on the table won't exceed 20, and the string represents these balls is called "board" in the input.
 The number of balls in your hand won't exceed 5, and the string represents these balls is called "hand" in the input.
 Both input strings will be non-empty and only contain characters 'R','Y','B','G','W'.
 */
public class _488 {

    public static class Solution1 {

        /**
         * credit: https://discuss.leetcode.com/topic/79820/short-java-solution-beats-98
         * Two layer of recursion, pretty cool!
         */

        int maxcount = 6;   // the max balls you need will not exceed 6 since "The number of balls in your hand won't exceed 5"

        public int findMinStep(String board, String hand) {
            int[] handCount = new int[26];
            for (int i = 0; i < hand.length(); ++i) {
                ++handCount[hand.charAt(i) - 'A'];
            }
            int result = dfs(board + "#", handCount);  // append a "#" to avoid special process while j==board.length, make the code shorter.
            return result == maxcount ? -1 : result;
        }

        private int dfs(String s, int[] handCount) {
            s = removeConsecutive(s);
            if (s.equals("#")) {
                return 0;
            }
            int result = maxcount;
            int need = 0;
            for (int i = 0, j = 0; j < s.length(); ++j) {
                if (s.charAt(j) == s.charAt(i)) {
                    continue;
                }
                need = 3 - (j - i);     //balls need to remove current consecutive balls.
                if (handCount[s.charAt(i) - 'A'] >= need) {
                    handCount[s.charAt(i) - 'A'] -= need;
                    result = Math.min(result, need + dfs(s.substring(0, i) + s.substring(j), handCount));
                    handCount[s.charAt(i) - 'A'] += need;
                }
                i = j;
            }
            return result;
        }

        //remove consecutive balls longer than 3
        private String removeConsecutive(String board) {
            for (int i = 0, j = 0; j < board.length(); ++j) {
                if (board.charAt(j) == board.charAt(i)) {
                    continue;
                }
                if (j - i >= 3) {
                    return removeConsecutive(board.substring(0, i) + board.substring(j));
                } else {
                    i = j;
                }
            }
            return board;
        }
    }
}

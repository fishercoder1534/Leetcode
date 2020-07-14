package com.fishercoder.solutions;

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

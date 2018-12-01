package com.fishercoder.solutions;

/**You are playing the following Nim Game with your friend:
 * There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 * The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * Both of you are very clever and have optimal strategies for the game.
 * Write a function to determine whether you can win the game given the number of stones in the heap.
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove,
 * the last stone will always be removed by your friend.

 Hint:
 If there are 5 stones in the heap, could you figure out a way to remove the stones such that you will always be the winner?*/

public class _292 {

    public static class Solution1 {
        /**
         * 1. If there are only 1 or 2 or 3 stones, you could always win by taking 1 or 2 or 3 stones;
         * 2. If there are 4 stones, you could never win because no matter you tak 1 or 2 or 3 stones, you could never take the 4th one;
         * 3. If there are 5 or 6 or 7 stones, you could always win because no matter how your opponent works, you'll always get the last one;
         * 4. Then we could deduce that as long as the number is not divisible by 4, you could always win.
         */

        public boolean canWinNim(int n) {
            return n % 4 != 0;
        }
    }
}

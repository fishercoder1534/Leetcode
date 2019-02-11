package com.fishercoder.solutions;

/**
 * 374. Guess Number Higher or Lower
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

 -1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
 Example:
 n = 10, I pick 6.
 Return 6.

 */
public class _374 {
    public static class Solution1 {
        /**
         * The core problem/trouble to solve this problem is to figure out the problem description: this
         * API: guess(int num) means to take your guess num and let you know if your guessed num is
         * bigger or smaller than the answer. That's why if num > target, it returns -1 which means the
         * target is smaller than your guess!!!
         */

        public int guessNumber(int n) {
            int left = 1;
            int right = n;
            while (left + 1 < right) {
                int mid = left + (right - left) / 2;
                int g = guess(mid);
                if (g == 0) {
                    return mid;
                } else if (g > 0) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            if (guess(left) == 0) {
                return left;
            }
            return right;
        }

        /**
         * This is a fake guess method that I wrote just to compile/test, I'll have to change it to
         * another number other than 6 based on the number to be found.
         */
        private int guess(int num) {
            if (num > 6) {
                return -1;
            } else if (num < 6) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}

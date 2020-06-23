package com.fishercoder.solutions;

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

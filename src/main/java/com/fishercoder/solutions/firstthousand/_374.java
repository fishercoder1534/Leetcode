package com.fishercoder.solutions.firstthousand;

public class _374 {
    public static class Solution1 {
        /*
         * The core problem/trouble to solve this problem is to figure out the problem description: this
         * API: guess(int num) means to take your guess num and let you know if your guessed num is
         * bigger or smaller than the answer. That's why if num > target, it returns -1 which means the
         * target is smaller than your guess!!!
         */

        public int guessNumber(int n) {
            int left = 1;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                int g = guess(mid);
                if (g == 0) {
                    return mid;
                } else if (g > 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return guess(left) == 0 ? left : right;
        }

        /*
         * This is a fake guess method that I wrote just to make the compiler happy.
         */
        private int guess(int num) {
            return 1;
        }
    }

    public static class Solution2 {
        public int guessNumber(int n) {
            int left = 1;
            int right = n;
            /**The difference between this solution2 vs the above solution1 is the condition of the while loop:
             * here, I'm using left <= right
             * so it'll guarantee to return within the while loop,
             * this is just another way of handling all cases for binary search
             * */
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (guess(mid) == -1) {
                    right = mid - 1;
                } else if (guess(mid) == 1) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }

        /*
         * This is a fake guess method that I wrote just to make the compiler happy.
         */
        private int guess(int num) {
            return 1;
        }
    }
}

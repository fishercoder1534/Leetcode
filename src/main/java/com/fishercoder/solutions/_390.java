package com.fishercoder.solutions;

/**
 * 390. Elimination Game
 *
 * There is a list of sorted integers from 1 to n.
 * Starting from left to right,
 * remove the first number and every other number afterward until you reach the end of the list.
 * Repeat the previous step again, but this time from right to left,
 * remove the right most number and every other number from the remaining numbers.
 * We keep repeating the steps again, alternating left to right and right to left, until a single number remains.
 * Find the last number that remains starting with a list of length n.

 Example:

 Input:
 n = 9,
 1 2 3 4 5 6 7 8 9
 2 4 6 8
 2 6
 6

 Output:
 6

 */
public class _390 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/55870/share-my-solutions-for-contest-2 instead of
         * literally removing half of the elements in each scan, this solution is just moving the
         * pointer to point to next start position So brilliant!
         */
        public int lastRemaining(int n) {
            int remaining = n;
            int start = 1;
            int step = 2;
            boolean forward = true;
            while (remaining > 1) {
                remaining /= 2;
                if (forward) {
                    start = start + step * remaining - step / 2;
                } else {
                    start = start - step * remaining + step / 2;
                }
                step *= 2;
                forward = !forward;
            }
            return start;
        }
    }
}

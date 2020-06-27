package com.fishercoder.solutions;

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

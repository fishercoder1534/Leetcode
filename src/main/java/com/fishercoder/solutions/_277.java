package com.fishercoder.solutions;

public class _277 {

    public static class Solution1 {
        public int findCelebrity(int n) {
            int candidate = 0;
            for (int i = 1; i < n; i++) {
                if (knows(candidate, i)) {
                    candidate = i;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i != candidate && (knows(candidate, i) || !knows(i, candidate))) {
                    return -1;
                }
            }
            return candidate;
        }

        //this is a mock-up method to make IDE happy.s
        boolean knows(int i, int candidate) {
            return false;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/21/2021, which turns out to match https://leetcode.com/problems/find-the-celebrity/solution/ Solution 1.
         * Time: O(n^2)
         * Space: O(1)
         */
        public int findCelebrity(int n) {
            for (int i = 0; i < n; i++) {
                //check if i is the celebrity
                int j = 0;
                for (; j < n; j++) {
                    if (i != j) {
                        if (knows(i, j)) {
                            break;
                        }
                        if (!knows(j, i)) {
                            break;
                        }
                    }
                }
                if (j == n) {
                    return i;
                }
            }
            return -1;
        }

        //this is a mock-up method to make IDE happy.s
        boolean knows(int i, int candidate) {
            return false;
        }
    }
}

package com.fishercoder.solutions;

public class _277 {

    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/find-the-celebrity/solution/ approach 2
         * 1. we narrow down the possible celebrity candidate to only one person
         * 2. we check to make sure that every other person knows
         * this candidate and this candidate doesn't know any one of them, otherwise return -1
         *
         * We can think of this is a directed graph problem, a total of n vertices, the one vertex that has zero outgoing edges
         * and n - 1 incoming edges is the celebrity.
         */
        public int findCelebrity(int n) {
            int candidate = 0;
            for (int i = 1; i < n; i++) {
                if (knows(candidate, i)) {
                    //this rules out the possibility that candidiate is a celebrity since he/she knows i
                    //so we update candidate to be i, because at least i doesn't know anybody yet.
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

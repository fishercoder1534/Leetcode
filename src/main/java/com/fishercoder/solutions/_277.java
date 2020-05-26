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
        private boolean knows(int i, int candidate) {
            return false;
        }
    }
}

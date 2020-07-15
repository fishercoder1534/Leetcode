package com.fishercoder.solutions;

public class _526 {
    public static class Solution1 {
        /**
         * A good post to look at: https://discuss.leetcode.com/topic/79916/java-solution-backtracking
         * and there's a generic template afterwards for backtracking problems
         */

        int count = 0;

        public int countArrangement(int N) {
            backtracking(N, new int[N + 1], 1);
            return count;
        }

        private void backtracking(int N, int[] used, int pos) {
            if (pos > N) {
                count++;
                return;
            }

            for (int i = 1; i <= N; i++) {
                if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
                    used[i] = 1;
                    backtracking(N, used, pos + 1);
                    used[i] = 0;
                }
            }
        }
    }

}

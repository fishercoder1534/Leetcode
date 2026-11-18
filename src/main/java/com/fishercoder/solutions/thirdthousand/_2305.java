package com.fishercoder.solutions.thirdthousand;

public class _2305 {
    public static class Solution1 {
        int minUnfairness = Integer.MAX_VALUE;

        public int distributeCookies(int[] cookies, int k) {
            backtrack(cookies, new int[k], 0, k);
            return minUnfairness;
        }

        private void backtrack(int[] cookies, int[] children, int idx, int k) {
            if (idx == cookies.length) {
                int max = 0;
                for (int c : children) max = Math.max(max, c);
                minUnfairness = Math.min(minUnfairness, max);
                return;
            }
            for (int i = 0; i < k; i++) {
                children[i] += cookies[idx];
                backtrack(cookies, children, idx + 1, k);
                children[i] -= cookies[idx];
                if (children[i] == 0) break;
            }
        }
    }
}

package com.fishercoder.solutions;

public class _96 {

    public static class Solution1 {
        public int numTrees(int n) {
            int[] G = new int[n + 1];
            G[0] = G[1] = 1;

            for (int i = 2; i <= n; ++i) {
                for (int j = 1; j <= i; ++j) {
                    int temp = G[j - 1] * G[i - j];
                    G[i] = G[i] + temp;
                }
            }
            return G[n];
        }
    }
}

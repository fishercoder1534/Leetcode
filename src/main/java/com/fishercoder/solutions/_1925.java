package com.fishercoder.solutions;

public class _1925 {
    public static class Solution1 {
        public int countTriples(int n) {
            int count = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    int product = i * i + j * j;
                    double sq = Math.sqrt(product);
                    if (sq <= n && (sq - Math.floor(sq) == 0)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}

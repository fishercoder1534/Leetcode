package com.fishercoder.solutions.thirdthousand;

public class _2320 {
    public static class Solution1 {
        public int countHousePlacements(int n) {
            long MOD = 1_000_000_007;
            long prev2 = 1, prev1 = 2;
            if (n == 1) return (int) (prev1 * prev1 % MOD);
            for (int i = 2; i <= n; i++) {
                long curr = (prev1 + prev2) % MOD;
                prev2 = prev1;
                prev1 = curr;
            }
            return (int) (prev1 * prev1 % MOD);
        }
    }
}

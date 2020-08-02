package com.fishercoder.solutions;

public class _935 {
    /*
     * The intuition is to calculate the number of ways
     * we can reach a key k after i hops, based on the number of ways we can reach keys x after i-1 hops
     * s.t. the knight can move from x to k in one move
     * For example,
     * We can reach 6 in 3 ways after 1 hop (1 -> 6, 7 -> 6 or 0 -> 6)
     * We can reach 8 in 2 ways after 1 hop (1 -> 8 or 3 -> 8)
     * Thus, we can reach 1 in 5 ways after 2 hops:
     * . 1. 1 -> 6 -> 1
     * . 2. 7 -> 6 -> 1
     * . 3. 0 -> 6 -> 1
     *   4. 1 -> 8 -> 1
     *   5. 3 -> 8 -> 1
     */
    public static class Solution1 {
        private static final int MOD = 1000_000_007;

        // whereFromHere[i] is an array of keys that can be reached from the ith digit
        private static final int[][] whereFromHere = {
                {4, 6}, {6, 8}, {7, 9}, {4, 8},  // 0, 1, 2, 3
                {3, 9, 0}, {}, {1, 7, 0},          // 4, 5, 6
                {2, 6}, {1, 3}, {2, 4}              // 7, 8, 9
        };

        public int knightDialer(int N) {
            // a[i] is the number of ways we can end up on the ith digit
            // The initial array is for N = 1, i.e. for 0 hops.
            long[] a = new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

            // Simulate N - 1 hops
            for (int i = 0; i < N - 1; ++i) {
                long[] tmp = new long[10];

                // For each digit
                for (int j = 0; j < 10; j++) {
                    // Which other digits can we reach?
                    for (int k : whereFromHere[j]) {
                        tmp[j] = (tmp[j] + a[k]) % MOD;
                    }
                }

                // Sanity checks based on symmetry of the keypad
                assert tmp[1] == tmp[3];
                assert tmp[4] == tmp[6];
                assert tmp[7] == tmp[9];

                a = tmp;
            }

            long ans = 0;
            for (long k : a) {
                ans = (ans + k) % MOD;
            }

            return (int) ans;
        }
    }
}

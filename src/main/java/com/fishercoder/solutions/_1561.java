package com.fishercoder.solutions;

import java.util.Arrays;

public class _1561 {
    public static class Solution1 {
        public int maxCoins(int[] piles) {
            Arrays.sort(piles);
            int j = 0;
            int coins = 0;
            for (int i = piles.length - 2; i > 0; i -= 2) {
                coins += piles[i];
                if (++j == piles.length / 3) {
                    return coins;
                }
            }
            return coins;
        }
    }
}

package com.fishercoder.solutions.thirdthousand;

public class _2806 {
    public static class Solution1 {
        public int accountBalanceAfterPurchase(int purchaseAmount) {
            if (purchaseAmount == 100) {
                return 0;
            }
            int balance = 100;
            while (purchaseAmount >= 10) {
                balance -= 10;
                purchaseAmount -= 10;
            }
            if (purchaseAmount >= 5) {
                balance -= 10;
            }
            return balance;
        }
    }

}

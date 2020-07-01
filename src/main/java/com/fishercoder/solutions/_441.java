package com.fishercoder.solutions;

public class _441 {

    public static class Solution1 {
        public int arrangeCoins(int n) {
            if (n < 2) {
                return n;
            }
            int row = 0;
            int count = 0;
            long sum = 0;
            while (sum < n) {
                row += 1;
                sum += row;
                count++;
            }
            if (sum == n) {
                return count;
            }
            return count - 1;
        }
    }

}
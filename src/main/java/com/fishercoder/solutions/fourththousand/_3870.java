package com.fishercoder.solutions.fourththousand;

public class _3870 {
    public static class Solution1 {
        /**
         * Given this constraint: 1 <= n <= 105
         * it's easy, numbers in this range: [1,000 and 100,000] there's only one comma for each number.
         */
        public int countCommas(int n) {
            if (n < 1000) {
                return 0;
            }
            return n - 999;
        }
    }
}

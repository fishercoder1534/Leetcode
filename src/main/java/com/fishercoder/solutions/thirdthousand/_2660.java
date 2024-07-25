package com.fishercoder.solutions.thirdthousand;

public class _2660 {
    public static class Solution1 {
        public int isWinner(int[] player1, int[] player2) {
            int sum1 = computeSum(player1);
            int sum2 = computeSum(player2);
            if (sum1 < sum2) {
                return 2;
            } else if (sum1 > sum2) {
                return 1;
            } else {
                return 0;
            }
        }

        private int computeSum(int[] pins) {
            int sum = 0;
            for (int i = 0; i < pins.length; i++) {
                if (i > 0 && pins[i - 1] == 10 || (i > 1 && pins[i - 2] == 10)) {
                    sum += pins[i] * 2;
                } else {
                    sum += pins[i];
                }
            }
            return sum;
        }
    }
}

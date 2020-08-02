package com.fishercoder.solutions;

public class _1535 {
    public static class Solution1 {
        public int getWinner(int[] arr, int k) {
            int winner = arr[0];
            int winTimes = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > winner) {
                    winner = arr[i];
                    winTimes = 1;
                } else {
                    winTimes++;
                }

                if (winTimes >= k) {
                    return winner;
                }
            }
            return winner;
        }
    }
}

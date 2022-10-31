package com.fishercoder.solutions;

public class _1690 {
    public static class Solution1 {

        int[] stonesRef;

        int[] prepareSums;

        int[][] maxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ = new int[1005][1005];

        public int stoneGameVII(int[] stones) {
            this.stonesRef = stones;
            int totalStonesNumber = stones.length;
            this.prepareSums = new int[totalStonesNumber + 1];
            for (int i = 1; i <= totalStonesNumber; i++) {
                this.prepareSums[i] = this.prepareSums[i - 1] + stones[i - 1];
            }
            for (int len = 1; len <= totalStonesNumber; len++) {
                for (int i = 1; i + len - 1 <= totalStonesNumber; i++) {
                    int j = i + len - 1;
                    this.setMaxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ(i, j);
                }
            }
            return maxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ[1][totalStonesNumber];
        }

        private void setMaxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ(int i, int j) {
            if (j - i == 0) {
                maxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ[i][j] = 0;
            } else if (j - i == 1) {
                maxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ[i][j] = Math.max(stonesRef[i - 1], stonesRef[j - 1]);
            } else {
                maxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ[i][j] = Math.max(
                        this.sumOfTheStonesValueInPosIToJ(i + 1, j)
                                - maxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ[i + 1][j],
                        this.sumOfTheStonesValueInPosIToJ(i, j - 1)
                                - maxDiffScoureBetweenTowPlayerWhenPlayInPosItoJ[i][j - 1]);
            }
        }

        private int sumOfTheStonesValueInPosIToJ(int i, int j) {
            return this.prepareSums[j] - this.prepareSums[i - 1];
        }
    }
}

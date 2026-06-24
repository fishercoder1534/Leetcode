package com.fishercoder.solutions.firstthousand;

public class _605 {

    public static class Solution1 {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            int i = 0;
            while (i < flowerbed.length) {
                if (flowerbed[i] == 0
                        && (i == 0 || flowerbed[i - 1] == 0)
                        && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    count++;
                    flowerbed[i] = 1;
                }
                if (count >= n) {
                    return true;
                }
                i++;
            }
            if (count >= n) {
                return true;
            }
            return false;
        }
    }

    public static class Solution2 {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            for (int i = 0; i < flowerbed.length; i++) {
                boolean emptyLeftPlot = i == 0 || flowerbed[i - 1] == 0;
                boolean emptyRightPlot = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                if (emptyLeftPlot && emptyRightPlot && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    if (n <= 0) {
                        return true;
                    }
                }
            }
            return n <= 0;
        }
    }
}

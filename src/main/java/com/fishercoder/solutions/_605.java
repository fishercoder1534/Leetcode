package com.fishercoder.solutions;

public class _605 {

    public static class Solution1 {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            int i = 0;
            while (i < flowerbed.length) {
                if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
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
            int len = flowerbed.length;
            if (len == 1) {
                if ((flowerbed[0] == 0 && n <= 1) || n == 0) {
                    return true;
                }
                return false;
            }
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            for (int i = 1; i < len - 1; i++) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    //modify the input, discuss this with interviwer, if not allowed, then have a copy of this input and modify copy
                    flowerbed[i] = 1;
                }
                if (n <= 0) {
                    return true;
                }
            }
            if (len >= 2 && flowerbed[len - 2] == 0 && flowerbed[len - 1] == 0) {
                n--;
            }
            if (n <= 0) {
                return true;
            }
            return false;
        }
    }

}

package com.fishercoder.solutions.fourththousand;

public class _3477 {
    public static class Solution1 {
        public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
            for (int i = 0; i < fruits.length; i++) {
                for (int j = 0; j < baskets.length; j++) {
                    if (fruits[i] <= baskets[j]) {
                        baskets[j] = -1;
                        fruits[i] = -1;
                        break;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < fruits.length; i++) {
                if (fruits[i] > -1) {
                    count++;
                }
            }
            return count;
        }
    }
}

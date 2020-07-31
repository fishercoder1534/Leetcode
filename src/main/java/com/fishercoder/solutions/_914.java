package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _914 {
    public static class Solution1 {
        public boolean hasGroupsSizeX(int[] deck) {
            //Size too small for partitions
            if (deck.length < 2) {
                return false;
            }

            //Track repetitions of values in deck array
            Map<Integer, Integer> mapReps = new HashMap<>();
            for (int card : deck) {
                if (!mapReps.containsKey(card)) {
                    mapReps.put(card, 1);
                } else {
                    mapReps.put(card, mapReps.get(card) + 1);
                }
            }

            //Create array of map values
            int num = 0;
            int[] arrReps = new int[mapReps.size()];
            for (Map.Entry<Integer, Integer> e : mapReps.entrySet()) {
                arrReps[num++] = e.getValue();
            }

            //Find greatest common denominator
            num = arrGCD(arrReps, arrReps.length);

            //If gcd of all repetitions is greater than 1, it's partitionable.
            return num > 1;
        }

        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        private int arrGCD(int[] arr, int n) {
            int result = arr[0];
            for (int i = 1; i < n; i++) {
                result = gcd(arr[i], result);
            }

            return result;
        }
    }
}
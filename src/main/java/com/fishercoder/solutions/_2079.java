package com.fishercoder.solutions;

public class _2079 {
    public static class Solution1 {
        public int wateringPlants(int[] plants, int capacity) {
            int steps = 0;
            int remainder = capacity;
            for (int i = 0; i < plants.length; i++) {
                if (plants[i] > remainder) {
                    steps += i * 2;
                    steps++;
                    remainder = capacity - plants[i];
                } else {
                    remainder -= plants[i];
                    steps++;
                }
            }
            return steps;
        }
    }
}

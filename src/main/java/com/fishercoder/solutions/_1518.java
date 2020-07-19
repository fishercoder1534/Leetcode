package com.fishercoder.solutions;

public class _1518 {
    public static class Solution1 {
        public int numWaterBottles(int numBottles, int numExchange) {
            int drunk = numBottles;
            int emptyBottles = numBottles;
            while (emptyBottles >= numExchange) {
                int exchangedBottles = emptyBottles / numExchange;
                drunk += exchangedBottles;
                int unUsedEmptyBottles = emptyBottles % numExchange;
                emptyBottles = exchangedBottles + unUsedEmptyBottles;
            }
            return drunk;
        }
    }
}

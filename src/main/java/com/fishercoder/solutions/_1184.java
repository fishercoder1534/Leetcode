package com.fishercoder.solutions;

public class _1184 {
    public static class Solution1 {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            if (start > destination) {
                int tmp = start;
                start = destination;
                destination = tmp;
            }
            int clockwise = 0;
            for (int i = start; i < destination; i++) {
                clockwise += distance[i];
            }
            int counterClockwise = 0;
            for (int i = destination; i < distance.length; i++) {
                counterClockwise += distance[i];
            }
            for (int i = 0; i < start; i++) {
                counterClockwise += distance[i];
            }

            return Math.min(clockwise, counterClockwise);
        }
    }
}

package com.fishercoder.solutions.fifththousand;

public class _4020 {
    public static class Solution1 {
        public int elevatorRequests(int n, int[] requests) {
            int totalTime = 0;
            int currentFloor = 0;
            for (int i = 0; i < requests.length; i++) {
                totalTime += Math.abs(requests[i] - currentFloor);
                currentFloor = requests[i];
            }
            return totalTime;
        }
    }
}

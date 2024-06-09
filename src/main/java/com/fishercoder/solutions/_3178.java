package com.fishercoder.solutions;

public class _3178 {
    public static class Solution1 {
        public int numberOfChild(int n, int k) {
            //decrement by 1 to make it easier to do math so it becomes o to n - 1
            n--;
            int roundTrips = k / n;
            int remainingSteps = k % n;
            if (roundTrips % 2 == 0) {
                //this means it's forward direction
                return remainingSteps;
            } else {
                //this means it's reverse direction
                return n - remainingSteps;
            }
        }
    }
}

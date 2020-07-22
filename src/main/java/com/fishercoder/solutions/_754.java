package com.fishercoder.solutions;

public class _754 {
    public static class Solution1 {
        /**
         * Two case:
         * 1. go to the right, and reach the goal exactly.
         * 2. go over the goal by several steps:
         * by even number, then you can choose one of the steps that went right to go back to the left (the step is half of what you went over)
         * by odd number, then you keep going until you are over by an even number.
         */
        public int reachNumber(int target) {
            int absTarget = Math.abs(target);
            int steps = 1;
            int sum = 0;
            while (sum < absTarget || (sum - absTarget) % 2 == 1) {
                sum += steps;
                steps++;
            }
            return steps - 1;
        }
    }
}

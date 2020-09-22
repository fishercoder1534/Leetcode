package com.fishercoder.solutions;

public class _1342 {
    public static class Solution1 {
        public int numberOfSteps(int num) {
            int steps = 0;
            while (num != 0) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num--;
                }
                steps++;
            }
            return steps;
        }
    }
}

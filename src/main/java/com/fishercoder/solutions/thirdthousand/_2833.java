package com.fishercoder.solutions.thirdthousand;

public class _2833 {
    public static class Solution1 {
        public int furthestDistanceFromOrigin(String moves) {
            int count = 0;
            int any = 0;
            for (char c : moves.toCharArray()) {
                if (c == 'L') {
                    count++;
                } else if (c == 'R') {
                    count--;
                } else {
                    any++;
                }
            }
            return Math.abs(count) + any;
        }
    }
}

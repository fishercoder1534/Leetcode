package com.fishercoder.solutions.fourththousand;

public class _3168 {
    public static class Solution1 {
        public int minimumChairs(String s) {
            int seated = 0;
            int seats = 0;
            for (char c : s.toCharArray()) {
                if (c == 'E') {
                    seated++;
                } else {
                    seated--;
                }
                seats = Math.max(seated, seats);
            }
            return seats;
        }
    }
}

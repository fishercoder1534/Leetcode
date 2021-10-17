package com.fishercoder.solutions;

import java.util.Arrays;

public class _2037 {
    public static class Solution1 {
        public int minMovesToSeat(int[] seats, int[] students) {
            int ans = 0;
            Arrays.sort(seats);
            Arrays.sort(students);
            for (int i = 0; i < seats.length; i++) {
                ans += Math.abs(seats[i] - students[i]);
            }
            return ans;
        }
    }
}

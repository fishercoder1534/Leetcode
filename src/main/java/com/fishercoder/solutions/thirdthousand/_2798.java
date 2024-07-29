package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2798 {
    public static class Solution1 {
        public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            return (int) Arrays.stream(hours).filter(hour -> hour >= target).count();
        }
    }
}

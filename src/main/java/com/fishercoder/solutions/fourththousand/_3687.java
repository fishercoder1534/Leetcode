package com.fishercoder.solutions.fourththousand;

public class _3687 {
    public static class Solution1 {
        public int lateFee(int[] daysLate) {
            int res = 0;
            for (int day : daysLate) {
                if (day == 1) {
                    res++;
                } else if (day >= 2 && day <= 5) {
                    res += 2 * day;
                } else {
                    res += day * 3;
                }
            }
            return res;
        }
    }
}

package com.fishercoder.solutions;

public class _1491 {
    public static class Solution1 {
        public double average(int[] salary) {
            int max = salary[0];
            int min = salary[0];
            for (int i = 1; i < salary.length; i++) {
                max = Math.max(max, salary[i]);
                min = Math.min(min, salary[i]);
            }
            long total = 0;
            int count = 0;
            for (int i = 0; i < salary.length; i++) {
                if (salary[i] != max && salary[i] != min) {
                    total += salary[i];
                    count++;
                }
            }
            return (double) total / count;
        }
    }
}

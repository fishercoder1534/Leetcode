package com.fishercoder.solutions;

import java.util.Arrays;

public class _1619 {
    public static class Solution1 {
        public double trimMean(int[] arr) {
            Arrays.sort(arr);
            int n = arr.length;
            long sum = 0;
            for (int i = (int) Math.round(n * 0.05); i < (n - n * 0.05); i++) {
                sum += arr[i];
            }
            return sum / (n - n * 0.1);
        }
    }
}

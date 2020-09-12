package com.fishercoder.solutions;

public class _1304 {
    public static class Solution1 {
        public int[] sumZero(int n) {
            int[] result = new int[n];
            int start = -n / 2;
            for (int i = 0; i < n / 2; i++) {
                result[i] = start++;
            }
            if (n % 2 == 0) {
                start++;
            }
            for (int i = n / 2; i < n; i++) {
                result[i] = start++;
            }
            return result;
        }
    }
}

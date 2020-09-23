package com.fishercoder.solutions;

public class _1343 {
    public static class Solution1 {
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int sum = 0;
            for (int i = 0; i < k - 1; i++) {
                sum += arr[i];
            }
            int count = 0;
            for (int i = k - 1; i < arr.length; i++) {
                sum += arr[i];
                if (i - k >= 0) {
                    sum -= arr[i - k];
                }
                if (sum / k >= threshold) {
                    count++;
                }
            }
            return count;
        }
    }
}

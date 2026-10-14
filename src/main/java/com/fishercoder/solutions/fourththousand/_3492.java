package com.fishercoder.solutions.fourththousand;

public class _3492 {
    public static class Solution1 {
        public int maxContainers(int n, int w, int maxWeight) {
            int left = 1;
            int right = n * n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (mid * w < maxWeight) {
                    left = mid + 1;
                } else if (mid * w > maxWeight) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
            return left * w > maxWeight ? (left - 1) : left;
        }
    }
}

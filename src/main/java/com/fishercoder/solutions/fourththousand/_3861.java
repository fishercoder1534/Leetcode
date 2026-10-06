package com.fishercoder.solutions.fourththousand;

public class _3861 {
    public static class Solution1 {
        public int minimumIndex(int[] capacity, int itemSize) {
            int smallestCapacity = Integer.MAX_VALUE;
            int ans = -1;
            for (int i = 0; i < capacity.length; i++) {
                if (capacity[i] >= itemSize && capacity[i] < smallestCapacity) {
                    smallestCapacity = capacity[i];
                    ans = i;
                }
            }
            return ans;
        }
    }
}

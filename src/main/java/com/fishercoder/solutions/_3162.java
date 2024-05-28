package com.fishercoder.solutions;

public class _3162 {
    public static class Solution1 {
        public int numberOfPairs(int[] nums1, int[] nums2, int k) {
            int count = 0;
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] % (nums2[j] * k) == 0) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}

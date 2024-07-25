package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2605 {
    public static class Solution1 {
        public int minNumber(int[] nums1, int[] nums2) {
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        return nums1[i];
                    }
                }
            }
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            if (nums1[0] < nums2[0]) {
                return nums1[0] * 10 + nums2[0];
            } else {
                return nums2[0] * 10 + nums1[0];
            }
        }
    }
}

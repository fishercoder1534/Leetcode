package com.fishercoder.solutions;

import java.util.Arrays;

public class _3131 {
    public static class Solution1 {
        public int addedInteger(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            return nums2[0] - nums1[0];
        }
    }
}

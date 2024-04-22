package com.fishercoder.solutions;

import java.util.Arrays;

public class _1874 {
    public static class Solution1 {
        public int minProductSum(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int ans = 0;
            for (int i = 0, j = nums1.length - 1; i < nums1.length && j >= 0; i++, j--) {
                ans += nums1[i] * nums2[j];
            }
            return ans;
        }
    }
}

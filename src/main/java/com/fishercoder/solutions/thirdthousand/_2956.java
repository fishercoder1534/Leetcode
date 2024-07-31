package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2956 {
    public static class Solution1 {
        /**
         * Although verbose, this is more efficient and faster than using Java.streams
         */
        public int[] findIntersectionValues(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }
            Set<Integer> set2 = new HashSet<>();
            for (int num : nums2) {
                set2.add(num);
            }
            int[] ans = new int[2];
            for (int num : nums1) {
                if (set2.contains(num)) {
                    ans[0]++;
                }
            }
            for (int num : nums2) {
                if (set1.contains(num)) {
                    ans[1]++;
                }
            }
            return ans;
        }
    }
}

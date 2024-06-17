package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2540 {
    public static class Solution1 {
        public int getCommon(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }
            Set<Integer> set2 = new HashSet<>();
            for (int num : nums2) {
                set2.add(num);
            }
            int result = -1;
            for (int num : nums1) {
                if (set2.contains(num)) {
                    result = num;
                    break;
                }
            }
            for (int num : nums2) {
                if (set1.contains(num) && result > num) {
                    result = num;
                    break;
                }
            }
            return result;
        }
    }
}

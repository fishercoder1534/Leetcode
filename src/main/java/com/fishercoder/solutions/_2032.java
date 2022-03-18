package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2032 {
    public static class Solution1 {
        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            Set<Integer> ans = new HashSet<>();
            Set<Integer> set1 = new HashSet<>();
            for (int i : nums1) {
                set1.add(i);
            }
            Set<Integer> set2 = new HashSet<>();
            for (int i : nums2) {
                set2.add(i);
            }
            Set<Integer> set3 = new HashSet<>();
            for (int i : nums3) {
                set3.add(i);
            }
            for (int i = 0; i < nums1.length; i++) {
                if (set2.contains(nums1[i]) || set3.contains(nums1[i])) {
                    ans.add(nums1[i]);
                }
            }
            for (int i = 0; i < nums2.length; i++) {
                if (set1.contains(nums2[i]) || set3.contains(nums2[i])) {
                    ans.add(nums2[i]);
                }
            }
            for (int i = 0; i < nums3.length; i++) {
                if (set1.contains(nums3[i]) || set2.contains(nums3[i])) {
                    ans.add(nums3[i]);
                }
            }
            List<Integer> result = new ArrayList<>();
            for (int i : ans) {
                result.add(i);
            }
            return result;
        }
    }
}

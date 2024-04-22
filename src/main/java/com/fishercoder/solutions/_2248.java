package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _2248 {
    public static class Solution1 {
        public List<Integer> intersection(int[][] nums) {
            int[] inter = nums[0];
            for (int i = 0; i < nums.length; i++) {
                inter = intersection(nums[i], inter);
            }
            Arrays.sort(inter);
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < inter.length; i++) {
                list.add(inter[i]);
            }
            return list;
        }

        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
            Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
            set1.retainAll(set2);
            int[] intersection = new int[set1.size()];
            int i = 0;
            for (int num : set1) {
                intersection[i++] = num;
            }
            return intersection;
        }

    }
}

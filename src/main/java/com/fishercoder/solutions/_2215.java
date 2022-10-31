package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _2215 {
    public static class Solution1 {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
            Set<Integer> set1Copy = new HashSet<>(set1);
            Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
            set1.removeAll(set2);
            set2.removeAll(set1Copy);
            List<Integer> list1 = set1.stream().mapToInt(n -> n).boxed().collect(Collectors.toList());
            List<Integer> list2 = set2.stream().mapToInt(n -> n).boxed().collect(Collectors.toList());
            return new ArrayList<>(Arrays.asList(list1, list2));
        }
    }
}

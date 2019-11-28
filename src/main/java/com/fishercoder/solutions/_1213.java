package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1213. Intersection of Three Sorted Arrays
 *
 * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order,
 * return a sorted array of only the integers that appeared in all three arrays.
 *
 * Example 1:
 * Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
 * Output: [1,5]
 * Explanation: Only 1 and 5 appeared in the three arrays.
 *
 * Constraints:
 *
 * 1 <= arr1.length, arr2.length, arr3.length <= 1000
 * 1 <= arr1[i], arr2[i], arr3[i] <= 2000
 * */
public class _1213 {
    public static class Solution1 {
        public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
            List<Integer> result = new ArrayList<>();
            Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
            Set<Integer> set3 = Arrays.stream(arr3).boxed().collect(Collectors.toSet());
            for (int i = 0; i < arr1.length; i++) {
                if (i >= arr2.length || i >= arr3.length) {
                    break;
                } else {
                    if (set2.contains(arr1[i]) && set3.contains(arr1[i])) {
                        result.add(arr1[i]);
                    }
                }
            }
            return result;
        }
    }
}

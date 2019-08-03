package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * 1122. Relative Sort Array
 *
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
 * Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
 *
 * Example 1:
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 *
 * Constraints:
 * arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * Each arr2[i] is distinct.
 * Each arr2[i] is in arr1.
 * */
public class _1122 {
    public static class Solution1 {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            Arrays.stream(arr1).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
            int[] result = new int[arr1.length];
            int i = 0;
            for (int num : arr2) {
                int count = map.get(num);
                while (count-- > 0) {
                    result[i++] = num;
                }
                map.remove(num);
            }
            for (int key : map.keySet()) {
                int count = map.get(key);
                while (count-- > 0) {
                    result[i++] = key;
                }
            }
            return result;
        }
    }
}

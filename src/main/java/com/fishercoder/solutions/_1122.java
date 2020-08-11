package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.TreeMap;

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

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class _1471 {
    public static class Solution1 {
        public int[] getStrongest(int[] arr, int k) {
            Arrays.sort(arr);
            int median = arr.length % 2 != 0 ? arr[arr.length / 2] : arr[arr.length / 2 - 1];
            TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>(Collections.reverseOrder());
            for (int num : arr) {
                int diff = Math.abs(num - median);
                if (!treeMap.containsKey(diff)) {
                    treeMap.put(diff, new ArrayList<>());
                }
                treeMap.get(diff).add(num);
            }
            List<Integer> sorted = new ArrayList<>();
            for (int key : treeMap.keySet()) {
                List<Integer> sort = treeMap.get(key);
                Collections.sort(sort, Collections.reverseOrder());
                sorted.addAll(sort);
            }
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = sorted.get(i);
            }
            return result;
        }
    }
}

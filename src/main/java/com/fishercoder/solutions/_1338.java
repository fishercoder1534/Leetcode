package com.fishercoder.solutions;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1338 {
    public static class Solution1 {
        public int minSetSize(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            List<Integer> list = new ArrayList<>();
            for (int k : map.keySet()) {
                list.add(map.get(k));
            }
            Collections.sort(list, Collections.reverseOrder());
            int sum = 0;
            int i = 0;
            while (sum < arr.length / 2) {
                sum += list.get(i++);
            }
            return i--;
        }
    }

    public static class Solution2 {
        public int minSetSize(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<int[]> list = new ArrayList<>();
            for (int key : map.keySet()) {
                list.add(new int[]{map.get(key), key});
            }
            Collections.sort(list, (a, b) -> b[0] - a[0]);
            int minSet = 0;
            int count = 0;
            for (int[] pair : list) {
                count += pair[0];
                minSet++;
                if (count >= arr.length / 2) {
                    return minSet;
                }
            }
            return minSet;
        }
    }
}

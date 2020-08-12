package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1182 {
    public static class Solution1 {
        public List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
            Map<Integer, List<Integer>> map = buildMap(colors);
            List<Integer> result = new ArrayList<>();
            for (int[] query : queries) {
                result.add(binarySearch(query[0], map.get(query[1])));
            }
            return result;
        }

        private Integer binarySearch(int index, List<Integer> indices) {
            if (indices == null) {
                return -1;
            }
            int left = 0;
            int right = indices.size() - 1;
            int minDistance = Integer.MAX_VALUE;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (indices.get(mid) == index) {
                    return 0;
                } else if (indices.get(mid) > index) {
                    minDistance = Math.min(minDistance, indices.get(mid) - index);
                    right = mid - 1;
                } else {
                    minDistance = Math.min(minDistance, index - indices.get(mid));
                    left = mid + 1;
                }
            }
            return minDistance;
        }

        private Map<Integer, List<Integer>> buildMap(int[] colors) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < colors.length; i++) {
                if (!map.containsKey(colors[i])) {
                    map.put(colors[i], new ArrayList<>());
                }
                map.get(colors[i]).add(i);
            }
            return map;
        }
    }
}

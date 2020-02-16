package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1182. Shortest Distance to Target Color
 *
 * You are given an array colors, in which there are three colors: 1, 2 and 3.
 * You are also given some queries. Each query consists of two integers i and c,
 * return the shortest distance between the given index i and the target color c. If there is no solution return -1.
 *
 * Example 1:
 * Input: colors = [1,1,2,1,3,2,2,3,3], queries = [[1,3],[2,2],[6,1]]
 * Output: [3,0,3]
 * Explanation:
 * The nearest 3 from index 1 is at index 4 (3 steps away).
 * The nearest 2 from index 2 is at index 2 itself (0 steps away).
 * The nearest 1 from index 6 is at index 3 (3 steps away).
 *
 * Example 2:
 * Input: colors = [1,2], queries = [[0,3]]
 * Output: [-1]
 * Explanation: There is no 3 in the array.
 *
 * Constraints:
 * 1 <= colors.length <= 5*10^4
 * 1 <= colors[i] <= 3
 * 1 <= queries.length <= 5*10^4
 * queries[i].length == 2
 * 0 <= queries[i][0] < colors.length
 * 1 <= queries[i][1] <= 3
 * */
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

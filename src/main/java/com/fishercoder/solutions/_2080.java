package com.fishercoder.solutions;

import java.util.*;

public class _2080 {
    public static class Solution1 {

        public static class RangeFreqQuery {
            /**
             * This post explains it well: https://leetcode.com/problems/range-frequency-queries/discuss/1589019/Java-or-Binary-Search-or-Log(n)-for-every-query
             */

            Map<Integer, List<Integer>> map;

            public RangeFreqQuery(int[] arr) {
                map = new HashMap<>();
                for (int i = 0; i < arr.length; i++) {
                    List<Integer> list = map.getOrDefault(arr[i], new ArrayList<>());
                    list.add(i);
                    map.put(arr[i], list);
                }
            }

            public int query(int left, int right, int value) {
                List<Integer> list = map.getOrDefault(value, new ArrayList<>());
                int start = Collections.binarySearch(list, left);
                int end = Collections.binarySearch(list, right);
                if (start < 0) {
                    start = (start + 1) * -1;
                }
                if (end < 0) {
                    end = (end + 2) * -1;
                }
                return end - start + 1;
            }
        }
    }
}

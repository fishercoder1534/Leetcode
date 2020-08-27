package com.fishercoder.solutions;

import java.util.TreeMap;

public class _436 {

    public static class Solution1 {
        public int[] findRightInterval(int[][] intervals) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int[] res = new int[intervals.length];
            for (int i = 0; i < intervals.length; i++) {
                map.put(intervals[i][0], i);
            }
            for (int i = 0; i < intervals.length; i++) {
                Integer key = map.ceilingKey(intervals[i][intervals[i].length - 1]);
                res[i] = key != null ? map.get(key) : -1;
            }
            return res;
        }
    }

}

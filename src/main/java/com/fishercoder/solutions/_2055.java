package com.fishercoder.solutions;

import java.util.TreeMap;

public class _2055 {
    public static class Solution1 {
        public int[] platesBetweenCandles(String s, int[][] queries) {
            int[] ans = new int[queries.length];
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            int left = 0;
            int right = 0;
            while (left < s.length() && s.charAt(left) != '|') {
                left++;
            }
            treeMap.put(left, 0);
            int count = 0;
            while (left < s.length()) {
                if (s.charAt(left) == '|') {
                    right = left + 1;
                    while (right < s.length() && s.charAt(right) != '|') {
                        count++;
                        right++;
                    }
                    if (right < s.length()) {
                        treeMap.put(right, count);
                    }
                    left = right;
                } else {
                    left++;
                }
            }
            for (int i = 0; i < queries.length; i++) {
                int l = queries[i][0];
                int r = queries[i][1];
                Integer start = treeMap.ceilingKey(l);
                Integer end = treeMap.floorKey(r);
                if (start == null || end == null || start >= end) {
                    continue;
                }
                ans[i] = treeMap.get(end) - treeMap.get(start);
            }
            return ans;
        }
    }
}

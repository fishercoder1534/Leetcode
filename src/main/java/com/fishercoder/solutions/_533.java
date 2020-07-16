package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _533 {
    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/81686/verbose-java-o-m-n-solution-hashmap/5
         * This program is very well designed to do things:
         * 1. it scans the entire matrix once, but does two things in this scan:
         * first it records an array of cols that keeps count of how many 'B' are there in each column;
         * second, at the end of traversing each column, it puts this entire row as the key into a HashMap
         * when there N number of 'B's in this row.
         * 2. then we could go through the HashMap keyset:
         * if one row has N number of 'B's, we go through this row's each column to see if any element in this row is 'B' and also that element's column has N 'B's
         */
        public int findBlackPixel(char[][] picture, int N) {
            if (picture == null || picture.length == 0 || picture[0].length == 0) {
                return 0;
            }
            int m = picture.length;
            int n = picture[0].length;
            int[] cols = new int[n];
            Map<String, Integer> map = new HashMap<>();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (picture[i][j] == 'B') {
                        count++;
                        cols[j]++;
                    }
                    stringBuilder.append(picture[i][j]);
                }
                if (count == N) {
                    /**we use this entire row string as key for the map*/
                    map.put(stringBuilder.toString(), map.getOrDefault(stringBuilder.toString(), 0) + 1);
                }
                stringBuilder.setLength(0);
            }

            int answer = 0;
            for (String key : map.keySet()) {
                if (map.get(key) != N) {
                    continue;
                }
                for (int i = 0; i < n; i++) {
                    if (key.charAt(i) == 'B' && cols[i] == N) {
                        answer += N;
                    }
                }
            }
            return answer;
        }
    }

}

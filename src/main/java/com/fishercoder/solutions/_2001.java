package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2001 {
    public static class Solution1 {
        /**
         * credit: https://github.com/fishercoder1534/Leetcode/blob/master/python3/2001.py
         */
        public long interchangeableRectangles(int[][] rectangles) {
            Map<Double, Integer> map = new HashMap<>();
            for (int[] rec : rectangles) {
                double ratio = (double) rec[0] / rec[1];
                map.put(ratio, map.getOrDefault(ratio, 0) + 1);
            }
            long answer = 0;
            for (double ratio : map.keySet()) {
                int count = map.get(ratio);
                answer += (long) count * (count - 1) / 2;
            }
            return answer;
        }
    }
}

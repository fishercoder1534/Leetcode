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

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/number-of-pairs-of-interchangeable-rectangles/discuss/1458404/Java-or-HashMap
         * <p>
         * This is an even smarter way to solve this problem:
         * whenever we encounter a rectangle that has the samw ratio we met before, just increment the answer by the count of this ratio
         * because this new rectangle could be matched up with all previously encountered ones!
         * <p>
         * This is 100% beat on all submissions on space and time as of 9/12/2021.
         */
        public long interchangeableRectangles(int[][] rectangles) {
            Map<Double, Integer> map = new HashMap<>();
            long ans = 0l;
            for (int[] rec : rectangles) {
                double ratio = (double) rec[0] / rec[1];
                ans += map.getOrDefault(ratio, 0);
                map.put(ratio, map.getOrDefault(ratio, 0) + 1);
            }
            return ans;
        }
    }
}

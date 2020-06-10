package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _356 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/48172/simple-java-hashset-solution
         */
        public boolean isReflected(int[][] points) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            Set<String> set = new HashSet<>();
            for (int[] point : points) {
                max = Math.max(max, point[0]);
                min = Math.min(min, point[0]);
                String str = point[0] + "a" + point[1];
                set.add(str);
            }
            int sum = max + min;
            for (int[] p : points) {
                String str = (sum - p[0]) + "a" + p[1];
                if (!set.contains(str)) {
                    return false;
                }
            }
            return true;
        }
    }
}

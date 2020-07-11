package com.fishercoder.solutions;

import java.util.Arrays;

public class _475 {

    public static class Solution1 {
        //credit: https://discuss.leetcode.com/topic/71460/short-and-clean-java-binary-search-solution
        public int findRadius(int[] houses, int[] heaters) {
            Arrays.sort(heaters);
            int radius = Integer.MIN_VALUE;
            for (int house : houses) {
                int index = Arrays.binarySearch(heaters, house);
                if (index < 0) {
                    index = ~index;
                }
                int distance1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
                int distance2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;

                radius = Math.max(radius, Math.min(distance1, distance2));
            }
            return radius;
        }
    }
}

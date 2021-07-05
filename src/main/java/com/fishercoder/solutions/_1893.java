package com.fishercoder.solutions;

import java.util.Arrays;

public class _1893 {
    public static class Solution1 {
        public boolean isCovered(int[][] ranges, int left, int right) {
            Arrays.sort(ranges, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
            int checked = left;
            for (int[] range : ranges) {
                while (checked >= range[0] && checked <= range[1]) {
                    checked++;
                }
            }
            return checked >= (right + 1);
        }
    }
}

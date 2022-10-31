package com.fishercoder.solutions;

import java.util.Arrays;

public class _1996 {
    public static class Solution1 {
        public int numberOfWeakCharacters(int[][] properties) {
            int count = 0;
            /**sort them based on:
             * if attack values equal, then sort by defense value ascendingly
             * if not, sort by attack values descendingly.
             * */
            Arrays.sort(properties, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
            int max = 0;
            for (int i = 0; i < properties.length; i++) {
                count += max > properties[i][1] ? 1 : 0;
                max = Math.max(max, properties[i][1]);
            }
            return count;
        }
    }
}

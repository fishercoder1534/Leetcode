package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _954 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/array-of-doubled-pairs/solution/
         */
        public boolean canReorderDoubled(int[] A) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : A) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            Integer[] sorted = new Integer[A.length];
            for (int i = 0; i < A.length; i++) {
                sorted[i] = A[i];
            }
            Arrays.sort(sorted, Comparator.comparingInt(Math::abs));
            for (int num : sorted) {
                if (map.get(num) == 0) {
                    continue;
                }
                if (!map.containsKey(2 * num) || map.get(2 * num) <= 0) {
                    return false;
                }
                map.put(num, map.get(num) - 1);
                map.put(2 * num, map.get(2 * num) - 1);
            }
            return true;
        }
    }
}

package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1128 {
    public static class Solution1 {
        public int numEquivDominoPairs(int[][] dominoes) {
            int m = dominoes.length;
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < m; i++) {
                int smaller = Math.min(dominoes[i][0], dominoes[i][1]);
                int bigger = Math.max(dominoes[i][0], dominoes[i][1]);
                int key = smaller * 10 + bigger;
                count += map.getOrDefault(key, 0);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            return count;
        }

    }
}

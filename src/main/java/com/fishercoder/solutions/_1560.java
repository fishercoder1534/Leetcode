package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class _1560 {
    public static class Solution1 {
        public List<Integer> mostVisited(int n, int[] rounds) {
            List<Integer> result = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < rounds.length - 1; i++) {
                if (rounds[i] > rounds[i + 1]) {
                    if (i == 0) {
                        map.put(rounds[i], 1);
                    }
                    for (int j = rounds[i] + 1; j <= n; j++) {
                        map.put(j, map.getOrDefault(j, 0) + 1);
                    }
                    for (int j = 1; j <= rounds[i + 1]; j++) {
                        map.put(j, map.getOrDefault(j, 0) + 1);
                    }
                } else {
                    int j;
                    if (i == 0) {
                        j = rounds[i];
                    } else {
                        j = rounds[i] + 1;
                    }
                    for (; j <= rounds[i + 1]; j++) {
                        map.put(j, map.getOrDefault(j, 0) + 1);
                    }
                }
            }

            int mostVisitedCount = 0;
            for (int key : map.keySet()) {
                mostVisitedCount = Math.max(mostVisitedCount, map.get(key));
            }
            for (int key : map.keySet()) {
                if (map.get(key) == mostVisitedCount) {
                    result.add(key);
                }
            }
            Collections.sort(result);
            return result;
        }
    }
}

package com.fishercoder.solutions.thirdthousand;

import java.util.HashMap;
import java.util.Map;

public class _2399 {
    public static class Solution1 {
        public boolean checkDistances(String s, int[] distance) {
            Map<Character, int[]> map = new HashMap<>();
            int i = 0;
            for (char c : s.toCharArray()) {
                if (!map.containsKey(c)) {
                    map.put(c, new int[]{-1, -1});
                }
                int[] indices = map.get(c);
                if (indices[0] == -1) {
                    indices[0] = i;
                } else {
                    indices[1] = i;
                }
                i++;
            }
            for (char c : map.keySet()) {
                int index = c - 'a';
                int[] indices = map.get(c);
                if (distance[index] + 1 != indices[1] - indices[0]) {
                    return false;
                }
            }
            return true;
        }
    }
}

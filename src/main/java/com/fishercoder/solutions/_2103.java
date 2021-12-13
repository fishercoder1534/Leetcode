package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _2103 {
    public static class Solution1 {
        public int countPoints(String rings) {
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for (int i = 0; i < rings.length() - 1; i += 2) {
                char color = rings.charAt(i);
                int pos = Character.getNumericValue(rings.charAt(i + 1));
                Set<Integer> set = map.getOrDefault(pos, new HashSet<>());
                if (color == 'R') {
                    set.add(1);
                } else if (color == 'G') {
                    set.add(2);
                } else {
                    set.add(3);
                }
                map.put(pos, set);
            }
            int ans = 0;
            for (int pos : map.keySet()) {
                if (map.get(pos).size() == 3) {
                    ans++;
                }
            }
            return ans;
        }
    }
}

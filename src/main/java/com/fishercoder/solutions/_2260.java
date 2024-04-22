package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2260 {
    public static class Solution1 {
        public int minimumCardPickup(int[] cards) {
            int min = cards.length;
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < cards.length; i++) {
                List<Integer> list = map.getOrDefault(cards[i], new ArrayList<>());
                list.add(i);
                map.put(cards[i], list);
            }
            boolean found = false;
            for (int key : map.keySet()) {
                List<Integer> list = map.get(key);
                for (int i = 0; i < list.size() - 1; i++) {
                    found = true;
                    min = Math.min(min, list.get(i + 1) - list.get(i) + 1);
                }
            }
            if (!found) {
                return -1;
            } else {
                return min;
            }
        }
    }
}

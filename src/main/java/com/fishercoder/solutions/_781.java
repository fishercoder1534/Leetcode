package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _781 {
    public static class Solution1 {
        public int numRabbits(int[] answers) {
            Map<Integer, Integer> map = new HashMap<>();
            int rabbits = 0;
            for (int rabbitType : answers) {
                if (map.containsKey(rabbitType)) {
                    int count = map.get(rabbitType);
                    count--;
                    if (count == 0) {
                        map.remove(rabbitType);
                    } else {
                        map.put(rabbitType, count);
                    }
                } else {
                    rabbits += rabbitType;
                    rabbits++;
                    if (rabbitType != 0) {
                        map.put(rabbitType, rabbitType);
                    }
                }
            }
            return rabbits;
        }
    }
}

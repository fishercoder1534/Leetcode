package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1103 {
    public static class Solution1 {
        public int[] distributeCandies(int candies, int numPeople) {
            Map<Integer, Integer> map = new HashMap<>();
            int candy = 1;
            while (candies > 0) {
                for (int person = 1; person <= numPeople && candies > 0; person++, candy++) {
                    if (candies < candy) {
                        map.put(person, map.getOrDefault(person, 0) + candies);
                        candies -= candy;
                        break;
                    } else {
                        map.put(person, map.getOrDefault(person, 0) + candy);
                        candies -= candy;
                    }
                }
            }
            int[] result = new int[numPeople];
            for (int i = 1; i <= numPeople; i++) {
                if (map.containsKey(i)) {
                    result[i - 1] = map.get(i);
                } else {
                    result[i - 1] = 0;
                }
            }
            return result;
        }
    }
}

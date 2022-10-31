package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1742 {
    public static class Solution1 {
        public int countBalls(int lowLimit, int highLimit) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int limit = lowLimit, i = 0; limit <= highLimit; limit++, i++) {
                int number = 0;
                int tmp = limit;
                do {
                    number += tmp % 10;
                    tmp /= 10;
                } while (tmp != 0);
                map.put(number, map.getOrDefault(number, 0) + 1);
            }
            int maxBalls = 0;
            for (int c : map.keySet()) {
                maxBalls = Math.max(maxBalls, map.get(c));
            }
            return maxBalls;
        }
    }
}

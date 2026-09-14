package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3945 {
    public static class Solution1 {
        public int digitFrequencyScore(int n) {
            Map<Integer, Integer> map = new HashMap<>();
            while (n > 0) {
                map.put(n % 10, map.getOrDefault(n % 10, 0) + 1);
                n /= 10;
            }
            int score = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                score += entry.getKey() * entry.getValue();
            }
            return score;
        }
    }
}

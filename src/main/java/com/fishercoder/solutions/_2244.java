package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2244 {
    public static class Solution1 {
        public int minimumRounds(int[] tasks) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int task : tasks) {
                map.put(task, map.getOrDefault(task, 0) + 1);
            }
            int rounds = 0;
            for (int task : map.keySet()) {
                int count = map.get(task);
                if (count == 2 || count == 3) {
                    rounds++;
                } else if (count == 1) {
                    return -1;
                } else {
                    if (count % 3 == 0) {
                        rounds += count / 3;
                    } else {
                        rounds += (count / 3 + 1);
                    }
                }
            }
            return rounds;
        }
    }
}

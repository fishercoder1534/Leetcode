package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3386 {
    public static class Solution1 {
        public int buttonWithLongestTime(int[][] events) {
            Map<Integer, Integer> map = new HashMap<>();
            int ans = events[0][0];
            map.put(events[0][0], events[0][1]);
            for (int i = 1; i < events.length; i++) {
                int duration = events[i][1] - events[i - 1][1];
                if (map.getOrDefault(events[i][0], 0) < duration) {
                    map.put(events[i][0], duration);
                }
            }
            int maxDuration = events[0][1];
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxDuration) {
                    ans = entry.getKey();
                    maxDuration = entry.getValue();
                } else if (entry.getValue() == maxDuration) {
                    if (entry.getKey() < ans) {
                        ans = entry.getKey();
                    }
                }
            }
            return ans;
        }
    }
}

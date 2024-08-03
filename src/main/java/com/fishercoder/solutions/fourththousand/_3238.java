package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3238 {
    public static class Solution1 {
        public int winningPlayerCount(int n, int[][] pick) {
            int winners = 0;
            Map<Integer, int[]> map = new HashMap<>();
            for (int[] p : pick) {
                int player = p[0];
                int color = p[1];
                int[] colors = map.getOrDefault(player, new int[11]);
                colors[color]++;
                map.put(player, colors);
            }
            for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
                int player = entry.getKey();
                int[] colors = entry.getValue();
                for (int c : colors) {
                    if (c >= player + 1) {
                        winners++;
                        break;
                    }
                }
            }
            return winners;
        }
    }
}

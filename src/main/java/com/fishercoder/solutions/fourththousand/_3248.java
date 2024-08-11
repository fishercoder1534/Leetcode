package com.fishercoder.solutions.fourththousand;

import java.util.List;

public class _3248 {
    public static class Solution1 {
        public int finalPositionOfSnake(int n, List<String> commands) {
            int[] pos = new int[2];
            for (String command : commands) {
                if (command.equals("RIGHT")) {
                    pos[1]++;
                } else if (command.equals("DOWN")) {
                    pos[0]++;
                } else if (command.equals("UP")) {
                    pos[0]--;
                } else if (command.equals("LEFT")) {
                    pos[1]--;
                }
            }
            return pos[0] * n + pos[1];
        }
    }
}

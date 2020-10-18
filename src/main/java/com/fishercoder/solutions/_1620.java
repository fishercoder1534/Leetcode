package com.fishercoder.solutions;

public class _1620 {
    public static class Solution1 {
        public static int[] bestCoordinate(int[][] towers, int radius) {
            int maxSignal = 0;
            int[] best = new int[2];
            for (int i = 0; i < towers.length; i++) {
                int thisQuality = 0;
                for (int j = 0; j < towers.length; j++) {
                    double distance = Math.sqrt((towers[i][0] - towers[j][0]) * (towers[i][0] - towers[j][0]) + (towers[i][1] - towers[j][1]) * (towers[i][1] - towers[j][1]));
                    if (distance <= radius) {
                        thisQuality += Math.floor(towers[j][2] / (1 + distance));
                    }
                }
                if (thisQuality > maxSignal) {
                    maxSignal = thisQuality;
                    best[0] = towers[i][0];
                    best[1] = towers[i][1];
                } else if (thisQuality == maxSignal) {
                    if (towers[i][0] < best[0]) {
                        best[0] = towers[i][0];
                        best[1] = towers[i][1];
                    } else if (towers[i][0] == best[0] && towers[i][1] < best[1]) {
                        best[0] = towers[i][0];
                        best[1] = towers[i][1];
                    }
                }
            }
            return best;
        }
    }
}

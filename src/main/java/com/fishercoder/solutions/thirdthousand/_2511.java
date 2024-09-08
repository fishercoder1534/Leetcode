package com.fishercoder.solutions.thirdthousand;

public class _2511 {
    public static class Solution1 {
        public int captureForts(int[] forts) {
            int max = 0;
            for (int i = 0; i < forts.length; i++) {
                if (forts[i] == 1 || forts[i] == -1) {
                    for (int j = i + 1; j < forts.length; j++) {
                        if ((forts[i] == 1 && forts[j] == -1)
                                || (forts[i] == -1 && forts[j] == 1)) {
                            max = Math.max(max, j - i - 1);
                            break;
                        } else if ((forts[j] == 1 && forts[i] == 1)
                                || forts[j] == -1 && forts[i] == -1) {
                            break;
                        }
                    }
                }
            }
            return max;
        }
    }
}

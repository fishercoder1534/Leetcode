package com.fishercoder.solutions.fourththousand;

public class _3696 {
    public static class Solution1 {
        public int maxDistance(String[] words) {
            int maxDist = 0;
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = words.length - 1; j > i; j--) {
                    if (!words[i].equals(words[j])) {
                        maxDist = Math.max(j - i + 1, maxDist);
                    }
                }
            }
            return maxDist;
        }
    }
}

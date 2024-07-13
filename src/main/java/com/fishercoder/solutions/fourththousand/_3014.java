package com.fishercoder.solutions.fourththousand;

public class _3014 {
    public static class Solution1 {
        int KEY_COUNT = 8;

        public int minimumPushes(String word) {
            int times = 1;
            int pushes = 0;
            int len = word.length();
            while (len > 0) {
                if (len < KEY_COUNT) {
                    pushes += times * len;
                    return pushes;
                } else {
                    pushes += times * KEY_COUNT;
                    len -= KEY_COUNT;
                    times++;
                }
            }
            return pushes;
        }
    }
}

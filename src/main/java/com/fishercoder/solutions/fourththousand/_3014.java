package com.fishercoder.solutions.fourththousand;

public class _3014 {
    public static class Solution1 {

        public int minimumPushes(String word) {
            int keyCount = 8;
            int times = 1;
            int pushes = 0;
            int len = word.length();
            while (len > 0) {
                if (len < keyCount) {
                    pushes += times * len;
                    return pushes;
                } else {
                    pushes += times * keyCount;
                    len -= keyCount;
                    times++;
                }
            }
            return pushes;
        }
    }
}

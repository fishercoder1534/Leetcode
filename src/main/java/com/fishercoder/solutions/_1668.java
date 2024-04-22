package com.fishercoder.solutions;

public class _1668 {
    public static class Solution1 {
        public int maxRepeating(String sequence, String word) {
            StringBuilder sb = new StringBuilder(word);
            int times = 0;
            while (sequence.indexOf(sb.toString()) != -1) {
                times++;
                sb.append(word);
            }
            return times;
        }
    }
}

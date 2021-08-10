package com.fishercoder.solutions;

public class _1860 {
    public static class Solution1 {
        public int[] memLeak(int memory1, int memory2) {
            int time = 1;
            while (memory1 >= time || memory2 >= time) {
                if (memory1 >= memory2) {
                    memory1 -= time;
                } else {
                    memory2 -= time;
                }
                time++;
            }
            return new int[]{time, memory1, memory2};
        }
    }
}

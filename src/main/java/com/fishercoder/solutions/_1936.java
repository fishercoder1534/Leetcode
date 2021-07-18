package com.fishercoder.solutions;

public class _1936 {
    public static class Solution1 {
        public int addRungs(int[] rungs, int dist) {
            int addons = 0;
            int currentHeight = 0;
            for (int i = 0; i < rungs.length; ) {
                int nextRung = rungs[i];
                if (nextRung - currentHeight <= dist) {
                    currentHeight = nextRung;
                    i++;
                } else {
                    int adds = (nextRung - currentHeight - 1) / dist;
                    addons += adds;
                    currentHeight += dist * adds;
                }
            }
            return addons;
        }
    }
}

package com.fishercoder.solutions;

public class _1375 {
    public static class Solution1 {
        public int numTimesAllBlue(int[] light) {
            int blues = 0;
            int[] status = new int[light.length];//0 means off, 1 means on
            for (int i = 0; i < light.length; i++) {
                status[light[i] - 1] = 1;
                if (checkAllBlues(status, i)) {
                    blues++;
                }
            }
            return blues;
        }

        private boolean checkAllBlues(int[] status, int endIndex) {
            for (int i = 0; i <= endIndex; i++) {
                if (status[i] != 1) {
                    return false;
                }
            }
            return true;
        }
    }
}

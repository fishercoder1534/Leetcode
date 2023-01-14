package com.fishercoder.solutions;

public class _2525 {
    public static class Solution1 {
        public String categorizeBox(int length, int width, int height, int mass) {
            int DIMENSION_LIMIT = 10000;
            int VOLUME_LIMIT = 1000000000;
            boolean isBulky = false;
            long volume = (long) length * width * height;
            if (length >= DIMENSION_LIMIT || width >= DIMENSION_LIMIT || height >= DIMENSION_LIMIT || volume >= VOLUME_LIMIT) {
                isBulky = true;
            }
            boolean isHeavy = mass >= 100;
            if (isBulky && isHeavy) {
                return "Both";
            } else if (!isBulky && !isHeavy) {
                return "Neither";
            } else if (isBulky && !isHeavy) {
                return "Bulky";
            } else {
                return "Heavy";
            }
        }
    }
}

package com.fishercoder.solutions;

public class _2525 {
    public static class Solution1 {
        public String categorizeBox(int length, int width, int height, int mass) {
            int dimensionLimit = 10000;
            int volumeLimit = 1000000000;
            boolean isBulky = false;
            long volume = (long) length * width * height;
            if (length >= dimensionLimit || width >= dimensionLimit || height >= dimensionLimit || volume >= volumeLimit) {
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

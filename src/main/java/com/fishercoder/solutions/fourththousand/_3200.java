package com.fishercoder.solutions.fourththousand;

public class _3200 {
    public static class Solution1 {
        public int maxHeightOfTriangle(int red, int blue) {
            return Math.max(getHeight(red, blue), getHeight(blue, red));
        }

        private int getHeight(int first, int second) {
            int height = 1;
            boolean useFirst = true;
            while (first > 0 || second > 0) {
                if (useFirst) {
                    if (first >= height) {
                        first -= height;
                    } else {
                        break;
                    }
                } else {
                    if (second >= height) {
                        second -= height;
                    } else {
                        break;
                    }
                }
                height++;
                useFirst = !useFirst;
            }
            return height - 1;
        }
    }
}

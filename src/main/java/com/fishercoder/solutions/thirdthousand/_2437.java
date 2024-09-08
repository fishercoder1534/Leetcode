package com.fishercoder.solutions.thirdthousand;

public class _2437 {
    public static class Solution1 {
        public int countTime(String time) {
            int[] count = new int[] {2, 10, 0, 6, 10};
            int times = 1;
            for (int i = 0; i < time.length(); i++) {
                if (time.charAt(i) == '?') {
                    if (i == 0 && time.charAt(0) == '?') {
                        if (time.charAt(1) == '?') {
                            times *= 24;
                        } else if (Character.getNumericValue(time.charAt(1)) < 4) {
                            times *= 3;
                        } else if (Character.getNumericValue(time.charAt(1)) >= 4) {
                            times *= 2;
                        }
                        i++;
                    } else if (i == 1 && (time.charAt(0) == '2' || time.charAt(0) == '?')) {
                        times *= 4;
                    } else {
                        times *= count[i];
                    }
                }
            }
            return times;
        }
    }
}

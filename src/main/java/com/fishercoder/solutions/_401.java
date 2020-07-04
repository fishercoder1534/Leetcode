package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _401 {

    public static class Solution1 {
        public List<String> readBinaryWatch(int num) {
            List<String> times = new ArrayList<>();
            for (int h = 0; h < 12; h++) {
                for (int m = 0; m < 60; m++) {
                    if (Integer.bitCount(h * 64 + m) == num) {
                        times.add(String.format("%d:%02d", h,
                                m));//%02 means to pad this two-digit decimal number on the left with zeroes
                    }
                }
            }
            return times;
        }
    }
}

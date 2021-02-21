package com.fishercoder.solutions;

public class _1769 {
    public static class Solution1 {
        public int[] minOperations(String boxes) {
            int[] box = new int[boxes.length()];
            for (int i = 0; i < boxes.length(); i++) {
                box[i] = boxes.charAt(i) - '0';
            }
            int[] result = new int[boxes.length()];
            for (int i = 0; i < boxes.length(); i++) {
                int ops = 0;
                for (int j = 0; j < boxes.length(); j++) {
                    if (i != j && box[j] == 1) {
                        ops += Math.abs(j - i);
                    }
                }
                result[i] = ops;
            }
            return result;
        }
    }
}

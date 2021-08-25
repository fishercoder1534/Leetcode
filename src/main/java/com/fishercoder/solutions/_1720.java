package com.fishercoder.solutions;

public class _1720 {
    public static class Solution1 {
        public int[] decode(int[] encoded, int first) {
            int[] arr = new int[encoded.length + 1];
            arr[0] = first;
            for (int i = 0; i < encoded.length; i++) {
                arr[i + 1] = encoded[i] ^ arr[i];
            }
            return arr;
        }
    }
}

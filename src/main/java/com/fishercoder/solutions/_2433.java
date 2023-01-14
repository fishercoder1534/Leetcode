package com.fishercoder.solutions;

public class _2433 {
    public static class Solution1 {
        public int[] findArray(int[] pref) {
            int[] arr = new int[pref.length];
            arr[0] = pref[0];
            int arrResult = arr[0];
            for (int i = 1; i < pref.length; i++) {
                arr[i] = arrResult ^ pref[i];
                arrResult ^= arr[i];
            }
            return arr;
        }
    }
}

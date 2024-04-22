package com.fishercoder.solutions;

public class _941 {
    public static class Solution1 {
        public boolean validMountainArray(int[] arr) {
            int i = 0;
            for (; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    continue;
                } else if (arr[i] == arr[i + 1]) {
                    return false;
                } else {
                    break;
                }
            }
            if (i == 0 || i >= arr.length - 1) {
                return false;
            }
            for (; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    continue;
                } else {
                    return false;
                }
            }
            return i == arr.length - 1;
        }
    }
}

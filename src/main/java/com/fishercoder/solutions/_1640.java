package com.fishercoder.solutions;

public class _1640 {
    public static class Solution1 {
        public boolean canFormArray(int[] arr, int[][] pieces) {
            for (int[] piece : pieces) {
                int first = piece[0];
                int index = findIndex(arr, first);
                if (index == -1) {
                    return false;
                }
                int i = 0;
                for (int j = index; i < piece.length && j < arr.length; i++, j++) {
                    if (arr[j] != piece[i]) {
                        return false;
                    }
                }
                if (i != piece.length) {
                    return false;
                }
            }
            return true;
        }

        private int findIndex(int[] arr, int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
            return -1;
        }
    }
}

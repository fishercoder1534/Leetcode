package com.fishercoder.solutions;

public class _1089 {
    public static class Solution1 {
        public void duplicateZeros(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0) {
                    duplicateZeros(arr, i + 1);
                    i++;
                }
            }
        }

        private void duplicateZeros(int[] arr, int zeroIndex) {
            int tmp = arr[zeroIndex];
            arr[zeroIndex] = 0;
            for (int i = zeroIndex + 1; i < arr.length; i++) {
                int next = arr[i];
                arr[i] = tmp;
                tmp = next;
            }
        }
    }
}

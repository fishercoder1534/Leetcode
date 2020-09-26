package com.fishercoder.solutions;

public class _1346 {
    public static class Solution1 {
        public boolean checkIfExist(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && (arr[i] * 2 == arr[j] || arr[i] == arr[j] * 2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

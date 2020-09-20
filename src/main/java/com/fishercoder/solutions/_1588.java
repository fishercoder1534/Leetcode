package com.fishercoder.solutions;

public class _1588 {
    public static class Solution1 {
        public int sumOddLengthSubarrays(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            int length = 3;
            while (length <= arr.length) {
                for (int j = 0; j <= arr.length - length; j++) {
                    for (int i = j; i < j + length; i++) {
                        sum += arr[i];
                    }
                }
                length += 2;
            }
            return sum;
        }
    }
}

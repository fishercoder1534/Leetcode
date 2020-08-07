package com.fishercoder.solutions;

public class _1085 {
    public static class Solution1 {
        public int sumOfDigits(int[] A) {
            int smallestNumber = A[0];
            for (int i = 1; i < A.length; i++) {
                smallestNumber = Math.min(smallestNumber, A[i]);
            }
            int sum = 0;
            while (smallestNumber > 0) {
                sum += smallestNumber % 10;
                smallestNumber /= 10;
            }
            return sum % 2 == 0 ? 1 : 0;
        }
    }
}

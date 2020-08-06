package com.fishercoder.solutions;

public class _1013 {
    public static class Solution1 {
        public boolean canThreePartsEqualSum(int[] A) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i];
            }
            if (sum % 3 != 0) {
                return false;
            }
            int equalSum = sum / 3;
            int left = 0;
            int leftSum = 0;
            while (left < A.length - 2 && leftSum != equalSum) {
                leftSum += A[left++];
            }
            if (left > A.length - 2 || leftSum != equalSum) {
                return false;
            }

            int right = A.length - 1;
            int rightSum = 0;
            while (right > left && rightSum != equalSum) {
                rightSum += A[right--];
            }
            if (right < left || rightSum != equalSum) {
                return false;
            }
            int middleSum = 0;
            for (int i = left; i <= right; i++) {
                middleSum += A[i];
            }
            return middleSum == equalSum;
        }
    }
}

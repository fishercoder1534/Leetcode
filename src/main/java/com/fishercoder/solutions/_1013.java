package com.fishercoder.solutions;

/**
 * 1013. Partition Array Into Three Parts With Equal Sum
 *
 * Given an array A of integers, return true if and only if we can partition the array into three non-empty parts with equal sums.
 * Formally, we can partition the array if we can find indexes i+1 < j with
 * (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])
 *
 * Example 1:
 * Input: [0,2,1,-6,6,-7,9,1,2,0,1]
 * Output: true
 * Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 *
 * Example 2:
 * Input: [0,2,1,-6,6,7,9,-1,2,0,1]
 * Output: false
 *
 * Example 3:
 * Input: [3,3,6,5,-2,2,5,1,-9,4]
 * Output: true
 * Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
 *
 * Note:
 *
 * 3 <= A.length <= 50000
 * -10000 <= A[i] <= 10000*/
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

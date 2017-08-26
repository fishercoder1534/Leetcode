package com.fishercoder.solutions;

/**
 * 396. Rotate Function
 *
 * Given an array of integers A and let n to be its length.

 Assume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a "rotation function" F on A as follow:

 F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].

 Calculate the maximum value of F(0), F(1), ..., F(n-1).

 Note:
 n is guaranteed to be less than 105.

 Example:

 A = [4, 3, 2, 6]

 F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
 F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
 F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
 F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26

 So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.*/

public class _396 {
    public static class Solution1 {
        /**
         * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]
         */
        public int maxRotateFunction(int[] A) {
            if (A == null || A.length == 0) {
                return 0;
            }
            int[] F = new int[A.length];
            int[] B = A;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < A.length; i++) {
                F[i] = compute(B);
                max = Math.max(max, F[i]);
                B = rotate(B);
            }
            return max;
        }

        private int compute(int[] b) {
            int sum = 0;
            for (int i = 0; i < b.length; i++) {
                sum += i * b[i];
            }
            return sum;
        }

        private int[] rotate(int[] a) {
            int first = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i - 1] = a[i];
            }
            a[a.length - 1] = first;
            return a;
        }
    }

    public static class Solution2 {
        /**
         * Reference: https://discuss.leetcode.com/topic/58459/java-o-n-solution-with-explanation
         */
        public int maxRotateFunction(int[] A) {
            int allSum = 0;
            int len = A.length;
            int F = 0;
            for (int i = 0; i < len; i++) {
                F += i * A[i];
                allSum += A[i];
            }
            int max = F;
            for (int i = len - 1; i >= 1; i--) {
                F = F + allSum - len * A[i];
                max = Math.max(F, max);
            }
            return max;
        }
    }
}

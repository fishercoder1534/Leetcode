package com.fishercoder.solutions;

public class _50 {

    public static class Solution1 {
        /**
         * Time: O(logn)
         * Space: O(logn)
         */
        public double myPow(double x, int n) {
            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }
            return fastPow(x, N);
        }

        private double fastPow(double x, long n) {
            if (n == 0) {
                return 1.0;
            }
            double half = fastPow(x, n / 2);
            if (n % 2 == 0) {
                return half * half;
            } else {
                return half * half * x;
            }
        }
    }

    public static class Solution2 {
        /**
         * Time: O(logn)
         * Space: O(1)
         */
        public double myPow(double x, int n) {
            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }
            double answer = 1;
            double currentProduct = x;
            for (long i = N; i > 0; i /= 2) {
                if (i % 2 == 1) {
                    answer = answer * currentProduct;
                }
                currentProduct *= currentProduct;
            }
            return answer;
        }
    }
}

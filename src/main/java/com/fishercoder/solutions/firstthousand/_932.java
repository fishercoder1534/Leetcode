package com.fishercoder.solutions.firstthousand;

import java.util.HashMap;
import java.util.Map;

public class _932 {
    public static class Solution1 {
        /**
         * THE CORE INSIGHT:
         * The equation 2 * A[k] = A[i] + A[j] dictates that the sum of A[i] and A[j] must be
         * even (since it equals 2 * A[k]).
         * If we can group the array such that A[i] is odd and A[j] is even, their sum will always be odd.
         * Since an odd number cannot equal 2 * A[k],
         * the condition can never be violated between an odd number on the left and an even number on the right.
         * By splitting the numbers into odd and even groups, you only have to ensure that
         * the "odd part" and the "even part" are internally beautiful.
         * <p>
         * MATHEMATICAL TRANSFORMATION:
         * A beautiful array remains beautiful if you apply a linear transformation
         * (A[x] -> a * A[x] + b) to its elements. We can recursively build the array:
         * <p>
         * 1. Solve the subproblem for the odd elements using the formula: 2 * x - 1
         * 2. Solve the subproblem for the even elements using the formula: 2 * x
         */

        private Map<Integer, int[]> memo = new HashMap<>();

        public int[] beautifulArray(int n) {
            //base case, if we already computed the result for this size n, we just return it
            if (memo.containsKey(n)) {
                return memo.get(n);
            }
            int[] result = new int[n];

            //base case: an array of size 1 is always beautiful
            if (n == 1) {
                result[0] = 1;
                return result;
            }

            //divide: solve for the odd and even elements independently
            int[] leftHalf = beautifulArray((n + 1) / 2);
            int[] rightHalf = beautifulArray(n / 2);

            //conquer and combine: transform and fill the results array
            int index = 0;

            for (int x : leftHalf) {
                result[index++] = x * 2 - 1;
            }
            for (int x : rightHalf) {
                result[index++] = x * 2;
            }

            //store the result into the map before returning
            memo.put(n, result);
            return result;
        }
    }
}

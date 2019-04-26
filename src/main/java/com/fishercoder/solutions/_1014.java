package com.fishercoder.solutions;

/**
 * 1014. Best Sightseeing Pair
 *
 * Given an array A of positive integers, A[i] represents the value of the i-th sightseeing spot,
 * and two sightseeing spots i and j have distance j - i between them.
 *
 * The score of a pair (i < j) of sightseeing spots is (A[i] + A[j] + i - j) :
 * the sum of the values of the sightseeing spots, minus the distance between them.
 *
 * Return the maximum score of a pair of sightseeing spots.
 *
 * Note:
 *  * 2 <= A.length <= 50000
 *  * 1 <= A[i] <= 1000
 */

public class _1014 {
    public static class Solution1 {
        public int maxScoreSightseeingPair(int[] A) {
            int bestPrevious = A[0];
            int maxSum = 0;

            for (int i = 1; i < A.length; ++i) {
                maxSum = Math.max(maxSum, bestPrevious + A[i] - i);
                bestPrevious = Math.max(bestPrevious, A[i] + i);
            }

            return maxSum;
        }
    }
}

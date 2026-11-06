package com.fishercoder.solutions.firstthousand;

import java.util.PriorityQueue;

public class _786 {
    public static class Solution1 {
        /**
         * My completely original solution:
         * Time: O(n^2^logn)
         * Space: O(n^2)
         */
        public int[] kthSmallestPrimeFraction(int[] arr, int k) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare((double) a[0] / a[1], (double) b[0] / b[1]));
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    pq.offer(new int[]{arr[i], arr[j]});
                }
            }
            while (k-- > 1) {
                pq.poll();
            }
            return pq.poll();
        }
    }

    public static class Solution2 {
        /**
         * Binary Search on Value Range (Optimal: O(N log W) time, O(1) space)
         * Since the array is strictly increasing, the fraction values must lie between 0.0 and 1.0.
         * We can perform a binary search on the value range and use a two-pointer technique to count
         * how many fractions are less than or equal to our current mid guess.
         * Credit: Gemini.
         */

        public int[] kthSmallestPrimeFraction(int[] arr, int k) {
            int n = arr.length;
            double left = 0.0;
            double right = 1.0;

            while (left < right) {
                double mid = left + (right - left) / 2;
                int count = 0;

                // Tracks the maximum fraction <= mid
                int p = 0;
                int q = 1;

                int j = 1;

                for (int i = 0; i < n; i++) {
                    while (j < n && arr[i] >= mid * arr[j]) {
                        j++;
                    }
                    count += (n - j);

                    // Keep track of the best fraction seen so far that is <= mid
                    if (j < n && p * arr[j] < q * arr[i]) {
                        p = arr[i];
                        q = arr[j];
                    }
                }

                if (count == k) {
                    return new int[]{p, q};
                } else if (count < k) {
                    left = mid;
                } else {
                    right = mid;
                }
            }

            return new int[]{};
        }
    }
}

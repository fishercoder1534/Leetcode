package com.fishercoder.solutions;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 1354. Construct Target Array With Multiple Sums
 *
 * Given an array of integers target. From a starting array, A consisting of all 1's, you may perform the following procedure :
 * let x be the sum of all elements currently in your array.
 * choose index i, such that 0 <= i < target.size and set the value of A at index i to x.
 * You may repeat this procedure as many times as needed.
 * Return True if it is possible to construct the target array from A otherwise return False.
 *
 * Example 1:
 * Input: target = [9,3,5]
 * Output: true
 * Explanation: Start with [1, 1, 1]
 * [1, 1, 1], sum = 3 choose index 1
 * [1, 3, 1], sum = 5 choose index 2
 * [1, 3, 5], sum = 9 choose index 0
 * [9, 3, 5] Done
 *
 * Example 2:
 * Input: target = [1,1,1,2]
 * Output: false
 * Explanation: Impossible to create target array from [1,1,1,1].
 *
 * Example 3:
 * Input: target = [8,5]
 * Output: true
 *
 * Constraints:
 * N == target.length
 * 1 <= target.length <= 5 * 10^4
 * 1 <= target[i] <= 10^9
 * */
public class _1354 {
    public static class Solution1 {
        /**
         * 1. A good idea/trick to calculate the previous value of the largest number max: (2 * max - total).
         * 2. Use a PriorityQueue to store the elements in reverse order to help us get the largest element in O(1) time
         * 3. Also keep a variable of total sum
         *
         * reference: https://leetcode.com/problems/construct-target-array-with-multiple-sums/discuss/510214/C%2B%2B-Reaching-Points-Work-Backwards
         */
        public boolean isPossible(int[] target) {
            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
            long sum = 0L;
            for (int v : target) {
                sum += v;
                pq.offer((long) v);
            }
            while (sum > pq.size()) {
                long max = pq.poll();
                Long prev = 2 * max - sum;
                if (prev < 1) {
                    return false;
                }
                pq.offer(prev);
                sum -= max;
                sum += prev;
            }
            return sum == pq.size();
        }
    }
}
package com.fishercoder.solutions;

import java.util.Collections;
import java.util.PriorityQueue;

public class _1354 {
    public static class Solution1 {
        /**
         * 1. A good idea/trick to calculate the previous value of the largest number max: (2 * max - total).
         * 2. Use a PriorityQueue to store the elements in reverse order to help us get the largest element in O(1) time
         * 3. Also keep a variable of total sum
         * <p>
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
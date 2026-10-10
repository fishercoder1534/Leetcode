package com.fishercoder.solutions.thirdthousand;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _2333 {
    public static class Solution1 {
        /**
         * 1. k1 and k2 could be combined into k operations as incrementing num1 is equivalent to decrementing num2;
         * 2. we'll operate on the differences instead of num1 and num2:
             * 2.1: we store the difference as the key in the map, frequency as the value in the map
             * 2.2. we sort by the difference in the priority queue
         * 3.
         *
         */
        public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
            int len = nums1.length;
            long k = k1 + k2;
            long totalDiffSum = 0l;
            //group their differences by their value
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < len; i++) {
                int diff = nums1[i] > nums2[i] ? nums1[i] - nums2[i] : nums2[i] - nums1[i];
                if (diff > 0) {
                    freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
                    totalDiffSum += diff;
                }
            }

            if (totalDiffSum <= k) {
                return 0;
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                pq.offer(new int[]{entry.getKey(), entry.getValue()});
            }

            //process while we have operations left
            while (!pq.isEmpty() && k > 0) {
                int[] curr = pq.poll();
                int currDiff = curr[0];
                int currFreq = curr[1];

                //find the next largest diff value in the max heap
                int nextDiff = pq.isEmpty() ? 0 : pq.peek()[0];
                long diffGap = currDiff - nextDiff;

                //ops needed to bring all elements in the current group down to the nextDiff
                long opsNeeded = diffGap * currFreq;

                if (k >= opsNeeded) {
                    k -= opsNeeded;
                    if (nextDiff > 0) {
                        pq.peek()[1] += currFreq;//merge frequencies
                    }
                } else {
                    //we don't have enough budget to bring everyone down to nextDiff.
                    //so we distribute remaining k evenly across the current frequency group
                    long drop = k / currFreq;
                    long remainder = k % currFreq;

                    int lowerDiff = currDiff - (int) drop;

                    if (lowerDiff > 0) {
                        pq.offer(new int[]{lowerDiff, currFreq - (int) remainder});
                    }
                    if (lowerDiff - 1 > 0) {
                        pq.offer(new int[]{lowerDiff - 1, (int) remainder});
                    }
                    k = 0;//budget exhausted.
                }
            }

            long minSqDiff = 0;
            while (!pq.isEmpty()) {
                int[] curr = pq.poll();
                minSqDiff += (long) (Math.pow(curr[0], 2) * curr[1]);
            }
            return minSqDiff;
        }
    }
}

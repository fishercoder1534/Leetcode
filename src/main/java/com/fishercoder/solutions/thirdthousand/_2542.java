package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _2542 {
    public static class Solution1 {
        /**
         * This is a great problem!
         * It combines lots of strategies, data structures and algorithms into one:
         * 1. sorting;
         * 2. priorityqueue;
         * 3. two-dimensions.
         *
         */
        public long maxScore(int[] nums1, int[] nums2, int k) {
            int n = nums1.length;
            int[][] pairs = new int[n][2];

            for (int i = 0; i < n; i++) {
                pairs[i][0] = nums2[i];
                pairs[i][1] = nums1[i];
            }

            //sort the pairs in descending order based on nums2, has to be descending for nums2, this is important for the below for loop to work correctly
            Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

            //min-heap to keep track of the k largest elements from nums1
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            long currentSum = 0;
            long maxScore = 0;

            //now we can iterate through pairs array, since nums2 is descending, we know pairs[i][0] is always the smallest so far, so we can heap.poll() any number from the heap, (the heap stores nums1) because its corresponding nums2 must be bigger than nums2[i][0]
            for (int i = 0; i < n; i++) {
                int num2Min = pairs[i][0];
                int num1Val = pairs[i][1];

                minHeap.offer(num1Val);
                currentSum += num1Val;

                //if we have more than k elements, discard the smallest nums1 element
                if (minHeap.size() > k) {
                    currentSum -= minHeap.poll();
                }

                //once we have exactly k elements, update the score
                if (minHeap.size() == k) {
                    maxScore = Math.max(maxScore, currentSum * num2Min);
                }
            }
            return maxScore;
        }

    }
}

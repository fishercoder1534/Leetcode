package com.fishercoder.solutions;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class _295 {
    /**
     * A few key points for both following solutions:
     * <p>
     * 1. always keep one queue one element more than the other if the number is odd, offer into that one
     * first, then poll from that queue and offer into the other queue, then check whether that queue is smaller
     * in size than the other, if so, poll one from the other queue and offer it into this queue
     * <p>
     * 2. only need to check whether this bigger queue size is greater than the other queue when returning.
     */

    public static class Solution1 {
        public static class MedianFinder {
            private Queue<Long> large;
            private Queue<Long> small;

            public MedianFinder() {
                large = new PriorityQueue<>();
                small = new PriorityQueue<>(Collections.reverseOrder());
            }

            // Adds a number into the data structure.
            public void addNum(int num) {
                large.offer((long) num);
                small.offer(large.poll());
                if (large.size() < small.size()) {
                    large.offer(small.poll());
                }
            }

            // Returns the median of current data stream
            public double findMedian() {
                if (large.size() > small.size()) {
                    return large.peek();
                }
                return (large.peek() + small.peek()) / 2.0;
            }
        }
    }

    public static class Solution2 {
        public static class MedianFinder {
            /**
             * credit: https://discuss.leetcode.com/topic/27521/short-simple-java-c-python-o-log-n-o-1
             * The idea is for sure to use two heaps, one is max heap, one is min heap, we always let the max heap be one element
             * bigger than min heap if the total number of elements is not even.
             * we could always get the median in O(1) time.
             * 1. use Long type to avoid overflow
             * 2. negate the numbers for small heap to save the effort for writing a reverse comparator, brilliant!
             */

            private Queue<Long> large;
            private Queue<Long> small;

            /**
             * initialize your data structure here.
             */
            public MedianFinder() {
                large = new PriorityQueue<>();
                small = new PriorityQueue<>();
            }

            // Adds a number into the data structure.
            public void addNum(int num) {
                large.offer((long) num);
                small.offer(-large.poll());
                if (large.size() < small.size()) {
                    large.offer(-small.poll());
                }
            }

            // Returns the median of current data stream
            public double findMedian() {
                if (large.size() > small.size()) {
                    return large.peek();
                }
                return (large.peek() - small.peek()) / 2.0;
            }

        }
    }
}
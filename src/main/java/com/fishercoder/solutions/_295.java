package com.fishercoder.solutions;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

 Examples:
 [2,3,4] , the median is 3

 [2,3], the median is (2 + 3) / 2 = 2.5

 Design a data structure that supports the following two operations:

 void addNum(int num) - Add a integer number from the data stream to the data structure.
 double findMedian() - Return the median of all elements so far.
 For example:

 addNum(1)
 addNum(2)
 findMedian() -> 1.5
 addNum(3)
 findMedian() -> 2
 */
public class _295 {

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

    public static class MedianFinderVerbose {
        private Queue<Long> large;
        private Queue<Long> small;

        public MedianFinderVerbose() {
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

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();
}
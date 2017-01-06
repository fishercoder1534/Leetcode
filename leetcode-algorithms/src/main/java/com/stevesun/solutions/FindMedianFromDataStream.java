package com.stevesun.solutions;

import java.util.*;

/**
 * Created by fishercoder1534 on 10/3/16.
 */
public class FindMedianFromDataStream {
}

class MedianFinder {
    //Thanks to Stefan's post: https://discuss.leetcode.com/topic/27521/short-simple-java-c-python-o-log-n-o-1
    /**
     * The idea is for sure to use two heaps, one is max heap, one is min heap, we always let the max heap be one element
     * bigger than min heap if the total number of elements is not even.
     * we could always get the median in O(1) time.
     * 1. use Long type to avoid overflow
     * 2. negate the numbers for small heap to save the effort for writing a reverse comparator, brilliant!*/
    private Queue<Long> large = new PriorityQueue<Long>();
    private Queue<Long> small = new PriorityQueue<Long>();

    // Adds a number into the data structure.
    public void addNum(int num) {
        large.offer((long) num);
        small.offer(-large.poll());
        if(large.size() < small.size()) large.offer(-small.poll());
    }

    // Returns the median of current data stream
    public double findMedian() {
        if(large.size() > small.size()) return large.peek();
        return (large.peek()-small.peek())/2.0;
    }

};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();
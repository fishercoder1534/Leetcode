package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 346. Moving Average from Data Stream
 *
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

 For example,
 MovingAverage m = new MovingAverage(3);
 m.next(1) = 1
 m.next(10) = (1 + 10) / 2
 m.next(3) = (1 + 10 + 3) / 3
 m.next(5) = (10 + 3 + 5) / 3
 */
public class _346 {

    public static class Solution1 {
        class MovingAverage {

            private Queue<Integer> q;
            private Long sum;
            private int max;

            /**
             * Initialize your data structure here.
             */
            public MovingAverage(int size) {
                q = new LinkedList();
                sum = 0L;
                max = size;
            }

            public double next(int val) {
                if (q.size() < max) {
                    q.offer(val);
                    sum += val;
                    return (double) sum / q.size();
                } else {
                    int first = q.poll();
                    sum -= first;
                    q.offer(val);
                    sum += val;
                    return (double) sum / q.size();
                }
            }
        }
    }
}

package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class _346 {

    public static class Solution1 {
        class MovingAverage {

            private Deque<Integer> q;
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
                    int first = q.pollFirst();
                    sum -= first;
                    q.offer(val);
                    sum += val;
                    return (double) sum / q.size();
                }
            }
        }
    }
}

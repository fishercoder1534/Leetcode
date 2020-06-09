package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

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

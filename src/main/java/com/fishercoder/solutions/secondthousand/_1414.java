package com.fishercoder.solutions.secondthousand;

import java.util.PriorityQueue;

public class _1414 {
    public static class Solution1 {
        /*
         * My completely original solution, heap is not really necessary, a regular array/list works out as well.
         */
        public int findMinFibonacciNumbers(int k) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            int one = 1;
            int two = 1;
            maxHeap.offer(one);
            maxHeap.offer(two);
            int three = one + two;
            while (three <= k) {
                maxHeap.offer(three);
                int tmp = two;
                two = three;
                one = tmp;
                three = one + two;
            }
            int minNumbers = 0;
            while (k > 0) {
                if (maxHeap.contains(k)) {
                    minNumbers++;
                    return minNumbers;
                } else {
                    while (maxHeap.peek() > k) {
                        maxHeap.poll();
                    }
                    Integer max = maxHeap.poll();
                    k -= max;
                    minNumbers++;
                }
            }
            return minNumbers;
        }
    }
}

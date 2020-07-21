package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class _703 {
    public static class Solution1 {
        public static class KthLargest {
            PriorityQueue<Integer> heap;
            int maxK;

            public KthLargest(int k, int[] nums) {
                heap = new PriorityQueue<>(Collections.reverseOrder());
                for (int num : nums) {
                    heap.offer(num);
                }
                maxK = k;
            }

            public int add(int val) {
                List<Integer> tmp = new ArrayList<>();
                int result = 0;
                int tmpK = maxK;
                heap.offer(val);
                while (tmpK-- > 0) {
                    result = heap.poll();
                    tmp.add(result);
                }
                for (int num : tmp) {
                    heap.offer(num);
                }
                return result;
            }
        }
    }
}

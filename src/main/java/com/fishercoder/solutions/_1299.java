package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1299 {
    public static class Solution1 {
        public int[] replaceElements(int[] arr) {
            PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
            for (int num : arr) {
                heap.offer(num);
            }
            int[] result = new int[arr.length];
            for (int i = 0; i < arr.length - 1; i++) {
                heap.remove(arr[i]);
                result[i] = heap.peek();
            }
            result[arr.length - 1] = -1;
            return result;
        }
    }
}

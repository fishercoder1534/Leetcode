package com.fishercoder.solutions;

import java.util.PriorityQueue;

/**
 * 1299. Replace Elements with Greatest Element on Right Side
 *
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 * After doing so, return the array.
 *
 * Example 1:
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * */
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

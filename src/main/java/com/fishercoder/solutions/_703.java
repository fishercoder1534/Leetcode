package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 703. Kth Largest Element in a Stream
 *
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * Your KthLargest class will have a constructor which accepts an integer K and an integer array nums,
 * which contains initial elements from the stream.
 * For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.
 *
 * Example:
 *
 * int K = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 * Note:
 * You may assume that nums' length ≥ K-1 and K ≥ 1.
 */
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

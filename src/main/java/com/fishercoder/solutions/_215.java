package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 215. Kth Largest Element in an Array
 *
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

 For example,
 Given [3,2,1,5,6,4] and k = 2, return 5.

 Note:
 You may assume k is always valid, 1 ≤ k ≤ array's length.

 */
public class _215 {

    public static class Solution1 {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }

    public static class Solution2 {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int i : nums) {
                maxHeap.offer(i);
            }
            while (k-- > 1) {
                maxHeap.poll();
            }
            return maxHeap.poll();
        }
    }

    public static class Solution3 {
        /**Quick Select algorithm
         * Time: O(n) in average, O(n^2) in worst case
         * 
         * Reference: https://discuss.leetcode.com/topic/14611/java-quick-select*/
        public int findKthLargest(int[] nums, int k) {
            int start = 0;
            int end = nums.length - 1;
            int index = nums.length - k;
            while (start < end) {
                int pivot = partition(nums, start, end);
                if (pivot < index) {
                    start = pivot + 1;
                } else if (pivot > index) {
                    end = pivot - 1;
                } else {
                    return nums[pivot];
                }
            }
            return nums[start];
        }

        int partition(int[] nums, int start, int end) {
            int pivot = start;
            while (start <= end) {
                while (start <= end && nums[start] <= nums[pivot]) {
                    start++;
                }
                while (start <= end && nums[end] > nums[pivot]) {
                    end--;
                }
                if (start > end) {
                    break;
                }
                swap(nums, start, end);
            }
            swap(nums, end, pivot);
            return end;
        }

        void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

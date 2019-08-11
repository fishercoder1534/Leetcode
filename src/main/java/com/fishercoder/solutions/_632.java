package com.fishercoder.solutions;

import java.util.List;
import java.util.PriorityQueue;

/**
 * 632. Smallest Range
 *
 * You have k lists of sorted integers in ascending order.
 * Find the smallest range that includes at least one number from each of the k lists.

 We define the range [a,b] is smaller than range [c,d] if b-a < d-c or a < c if b-a == d-c.

 Example 1:
 Input:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
 Output: [20,24]
 Explanation:
 List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
 List 2: [0, 9, 12, 20], 20 is in range [20,24].
 List 3: [5, 18, 22, 30], 22 is in range [20,24].

 Note:
 The given list may contain duplicates, so ascending order means >= here.
 1 <= k <= 3500
 -105 <= value of elements <= 105.
 For Java users, please note that the input type has been changed to List<List<Integer>>.
 And after you reset the code template, you'll see this point.

 */
public class _632 {
    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/94445/java-code-using-priorityqueue-similar-to-merge-k-array/2
         */
        public int[] smallestRange(List<List<Integer>> nums) {
            PriorityQueue<int[]> minHeap = new PriorityQueue<>(nums.size(), (a, b) -> a[0] - b[0]);
            /**int[] array consists of three numbers: value; which list in nums; index of value in this list*/

            int max = nums.get(0).get(0);
            for (int i = 0; i < nums.size(); i++) {
                minHeap.offer(new int[]{nums.get(i).get(0), i, 0});
                max = Math.max(max, nums.get(i).get(0));
            }
            int minRange = Integer.MAX_VALUE;
            int start = -1;
            while (minHeap.size() == nums.size()) {
                int[] curr = minHeap.poll();
                if (max - curr[0] < minRange) {
                    minRange = max - curr[0];
                    start = curr[0];
                }
                if (curr[2] + 1 < nums.get(curr[1]).size()) {
                    curr[0] = nums.get(curr[1]).get(curr[2] + 1);
                    curr[2]++;
                    minHeap.offer(curr);
                    max = Math.max(max, curr[0]);
                }
            }
            return new int[]{start, start + minRange};
        }
    }
}

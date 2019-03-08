package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 406. Queue Reconstruction by Height
 *
 * Suppose you have a random list of people standing in a queue.
 * Each person is described by a pair of integers (h, k),
 * where h is the height of the person and k is the number of people in
 * front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

 Note:
 The number of people is less than 1,100.

 Example

 Input:
 [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

 Output:
 [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]

 */
public class _406 {

    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/60437/java-solution-using-priorityqueue-and-linkedlist
         */
        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people, new Comparator<int[]>() {
                public int compare(int[] p1, int[] p2) {
                    return p1[0] != p2[0] ? Integer.compare(p2[0], p1[0])
                        : Integer.compare(p1[1], p2[1]);
                }
            });
            List<int[]> list = new LinkedList();
            for (int[] ppl : people) {
                list.add(ppl[1], ppl);
            }
            return list.toArray(new int[people.length][]);
        }
    }
}

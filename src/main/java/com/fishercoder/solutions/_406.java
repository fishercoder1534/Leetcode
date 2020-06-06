package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

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

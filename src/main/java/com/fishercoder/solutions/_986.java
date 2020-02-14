package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 986. Interval List Intersections
 *
 * Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
 * Return the intersection of these two interval lists.
 *
 * (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
 * The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.
 * For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
 *
 * Example 1:
 * Input: A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
 * Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
 * Reminder: The inputs and the desired output are lists of Interval objects, and not arrays or lists.
 *
 * Note:
 * 0 <= A.length < 1000
 * 0 <= B.length < 1000
 * 0 <= A[i].start, A[i].end, B[i].start, B[i].end < 10^9
 * NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
 * */
public class _986 {
    public static class Solution1 {
        public int[][] intervalIntersection(int[][] A, int[][] B) {
            int i = 0;
            int j = 0;
            List<int[]> list = new ArrayList<>();
            while (i < A.length && j < B.length) {
                int start = Math.max(A[i][0], B[j][0]);
                int end = Math.min(A[i][1], B[j][1]);
                if (start <= end) {
                    list.add(new int[]{start, end});
                }
                if (end == A[i][1]) {
                    i++;
                } else {
                    j++;
                }
            }
            int[][] result = new int[list.size()][2];
            for (int k = 0; k < list.size(); k++) {
                result[k] = list.get(k);
            }
            return result;
        }
    }
}

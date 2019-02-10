package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 373. Find K Pairs with Smallest Sums
 *
 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
 * Define a pair (u,v) which consists of one element from the first array and one element from the second array.
 * Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.

 Example 1:
 Given nums1 = [1,7,11], nums2 = [2,4,6],  k = 3
 Return: [1,2],[1,4],[1,6]
 The first 3 pairs are returned from the sequence:
 [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]

 Example 2:
 Given nums1 = [1,1,2], nums2 = [1,2,3],  k = 2
 Return: [1,1],[1,1]
 The first 2 pairs are returned from the sequence:
 [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]

 Example 3:
 Given nums1 = [1,2], nums2 = [3],  k = 3
 Return: [1,3],[2,3]
 All possible pairs are returned from the sequence:
 [1,3],[2,3]

 */
public class _373 {
    public static class Solution1 {

        final int[][] neighbors = new int[][] {{0, 1}, {1, 0}};

        public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            List<int[]> result = new ArrayList<>();
            if (nums1 == null
                || nums2 == null
                || k == 0
                || nums1.length == 0
                || nums2.length == 0) {
                return result;
            }
            Queue<Pair> meanHeap = new PriorityQueue<>();
            meanHeap.offer(new Pair(0, 0, nums1[0] + nums2[0]));
            boolean[][] visited = new boolean[nums1.length][nums2.length];
            visited[0][0] = true;//we start form (0,0), so mark it as visited
            while (k > 0 && !meanHeap.isEmpty()) {
                Pair pair = meanHeap.poll();
                result.add(new int[] {nums1[pair.row], nums2[pair.col]});
                k--;
                for (int[] neighbor : neighbors) {
                    int nextRow = pair.row + neighbor[0];
                    int nextCol = pair.col + neighbor[1];
                    if (nextRow < 0
                        || nextCol < 0
                        || nextRow >= nums1.length
                        || nextCol >= nums2.length
                        || visited[nextRow][nextCol]) {
                        continue;
                    }
                    visited[nextRow][nextCol] = true;
                    meanHeap.offer(new Pair(nextRow, nextCol, nums1[nextRow] + nums2[nextCol]));
                }
            }

            return result;
        }

        class Pair implements Comparable<Pair> {
            int row;
            int col;
            int sum;

            public Pair(int row, int col, int sum) {
                this.row = row;
                this.col = col;
                this.sum = sum;
            }

            @Override
            public int compareTo(Pair that) {
                return this.sum - that.sum;
            }
        }
    }
}

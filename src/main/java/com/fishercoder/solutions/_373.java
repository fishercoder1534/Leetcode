package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class _373 {

    public static class Solution1 {

        int[][] dirs = {{0, 1}, {1, 0}, {1, 1}};

        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

            List<List<Integer>> result = new ArrayList<>();

            // EDGE CASE
            if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
                return result;
            }

            // visited array
            boolean[][] visited = new boolean[nums1.length][nums2.length];

            // Min Heap
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
                return (a[0] + a[1]) - (b[0] + b[1]);
            });

            int[] temp = new int[]{nums1[0], nums2[0], 0, 0};
            pq.add(temp);
            visited[0][0] = true;

            while (!pq.isEmpty()) {
                int[] arr = pq.poll();
                List<Integer> ls = new ArrayList<>();
                ls.add(arr[0]);
                ls.add(arr[1]);
                result.add(ls);

                if (result.size() == k) {
                    break;
                }
                int i = arr[2];
                int j = arr[3];

                for (int[] dir : dirs) {
                    int dx = i + dir[0];
                    int dy = j + dir[1];
                    if (dx >= 0 && dx < nums1.length && dy >= 0 && dy < nums2.length && !visited[dx][dy]) {
                        pq.add(new int[]{nums1[dx], nums2[dy], dx, dy});
                        visited[dx][dy] = true;
                    }
                }
            }
            return result;
        }
    }
}

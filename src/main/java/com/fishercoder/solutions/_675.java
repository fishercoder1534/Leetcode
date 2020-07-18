package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class _675 {
    public static class Solution1 {
        public int cutOffTree(List<List<Integer>> forest) {
            if (forest == null || forest.isEmpty() || forest.size() == 0 || forest.get(0).get(0) == 0) {
                return -1;
            }
            int m = forest.size();
            int n = forest.get(0).size();
            /**cut trees in ascending order*/
            PriorityQueue<Tree> heap = new PriorityQueue<>((a, b) -> a.height - b.height);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (forest.get(i).get(j) > 1) {
                        /**This is important: we'll add trees that are only taller than 1!!!*/
                        heap.offer(new Tree(i, j, forest.get(i).get(j)));
                    }
                }
            }

            int sum = 0;
            Tree start = new Tree();
            while (!heap.isEmpty()) {
                Tree curr = heap.poll();
                int step = bfs(forest, curr, start, m, n);
                if (step == -1) {
                    return -1;
                }
                sum += step;
                start = curr;
            }
            return sum;
        }

        private int bfs(List<List<Integer>> forest, Tree target, Tree start, int m, int n) {
            int[] dirs = new int[]{0, 1, 0, -1, 0};
            boolean[][] visited = new boolean[m][n];
            Queue<Tree> queue = new LinkedList<>();
            queue.offer(start);
            visited[start.x][start.y] = true;
            int step = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int k = 0; k < size; k++) {
                    Tree tree = queue.poll();
                    if (tree.x == target.x && tree.y == target.y) {
                        return step;
                    }

                    for (int i = 0; i < 4; i++) {
                        int nextX = tree.x + dirs[i];
                        int nextY = tree.y + dirs[i + 1];
                        if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n || visited[nextX][nextY] || forest.get(nextX).get(nextY) == 0) {
                            continue;
                        }
                        queue.offer(new Tree(nextX, nextY, forest.get(nextX).get(nextY)));
                        visited[nextX][nextY] = true;
                    }
                }
                step++;
            }
            return -1;
        }

        class Tree {
            int x;
            int y;
            int height;

            public Tree(int x, int y, int height) {
                this.x = x;
                this.y = y;
                this.height = height;
            }

            public Tree() {
                this.x = 0;
                this.y = 0;
                this.height = 0;
            }
        }
    }
}

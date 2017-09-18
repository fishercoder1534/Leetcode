package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 675. Cut Off Trees for Golf Event
 *
 * You are asked to cut off trees in a forest for a golf event.
 * The forest is represented as a non-negative 2D map, in this map:
 * 0 represents the obstacle can't be reached.
 * 1 represents the ground can be walked through.
 *
 * The place with number bigger than 1 represents a tree can be walked through,
 * and this positive number represents the tree's height.
 *
 * You are asked to cut off all the trees in this forest in the order of tree's height -
 * always cut off the tree with lowest height first.
 * And after cutting, the original place has the tree will become a grass (value 1).
 *
 * You will start from the point (0, 0) and you should output the minimum steps you need to walk to cut off all the trees.
 *
 * If you can't cut off all the trees, output -1 in that situation.
 * You are guaranteed that no two trees have the same height and there is at least one tree needs to be cut off.
 *
 * Example 1:
 * Input:
 * [
 * [1,2,3],
 * [0,0,4],
 * [7,6,5]
 * ]
 * Output: 6
 *
 * Example 2:
 * Input:
 * [
 * [1,2,3],
 * [0,0,0],
 * [7,6,5]
 * ]
 * Output: -1
 *
 * Example 3:
 * Input:
 * [
 * [2,3,4],
 * [0,0,5],
 * [8,7,6]
 * ]
 * Output: 6
 *
 * Explanation: You started from the point (0,0) and you can cut off the tree in (0,0) directly without walking.
 * Hint: size of the given matrix will not exceed 50x50.
 */

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

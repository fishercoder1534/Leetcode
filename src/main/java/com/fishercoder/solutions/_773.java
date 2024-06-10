package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _773 {
    public static class Solution1 {
        public int slidingPuzzle(int[][] board) {
            String target = "123450";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    sb.append(board[i][j]);
                }
            }
            Queue<String> q = new LinkedList<>();
            String start = sb.toString();
            q.offer(start);
            Set<String> visited = new HashSet<>();
            visited.add(start);
            //since there are only 6 cells, we just use 0 through 5 to represent the positions:
            //0, 1, 2
            //3, 4, 5
            //the swap positions, go from left to right, top to bottom
            //swap[index] means the possible positions to swap when '0' is at position index
            int[][] swap = new int[][]{
                    {1, 3},
                    {0, 4, 2},
                    {1, 5},
                    {0, 4},
                    {3, 1, 5},
                    {2, 4}
            };
            int level = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    String curr = q.poll();
                    if (curr.equals(target)) {
                        return level;
                    }
                    int index = curr.indexOf('0');
                    for (int swapIndex : swap[index]) {
                        sb.setLength(0);
                        sb.append(curr);

                        //swap
                        sb.setCharAt(index, curr.charAt(swapIndex));
                        sb.setCharAt(swapIndex, '0');

                        String path = sb.toString();
                        if (!visited.add(path)) {
                            continue;
                        }
                        q.offer(path);
                    }
                }
                level++;
            }
            return -1;
        }
    }
}

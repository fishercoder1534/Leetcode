package com.fishercoder.solutions;

public class _1718 {
    public static class Solution1 {
        public int[] constructDistancedSequence(int n) {
            int[] result = new int[n * 2 - 1];
            boolean[] visited = new boolean[n + 1];
            backtracking(0, result, visited, n);
            return result;
        }

        private boolean backtracking(int index, int[] result, boolean[] visited, int n) {
            if (index == result.length) {
                return true;
            }
            if (result[index] != 0) {
                return backtracking(index + 1, result, visited, n);
            } else {
                for (int i = n; i > 0; i--) {
                    if (visited[i]) {
                        continue;
                    }
                    visited[i] = true;
                    result[index] = i;
                    if (i == 1) {
                        if (backtracking(index + 1, result, visited, n)) {
                            return true;
                        }
                    } else if (index + i < result.length && result[index + i] == 0) {
                        result[i + index] = i;
                        if (backtracking(index + 1, result, visited, n)) {
                            return true;
                        }
                        result[index + i] = 0;
                    }
                    result[index] = 0;
                    visited[i] = false;
                }
            }
            return false;
        }
    }
}

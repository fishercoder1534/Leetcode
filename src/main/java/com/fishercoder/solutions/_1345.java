package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 1345. Jump Game IV
 *
 * Given an array of integers arr, you are initially positioned at the first index of the array.
 * In one step you can jump from index i to index:
 * i + 1 where: i + 1 < arr.length.
 * i - 1 where: i - 1 >= 0.
 * j where: arr[i] == arr[j] and i != j.
 * Return the minimum number of steps to reach the last index of the array.
 * Notice that you can not jump outside of the array at any time.
 *
 * Example 1:
 * Input: arr = [100,-23,-23,404,100,23,23,23,3,404]
 * Output: 3
 * Explanation: You need three jumps from index 0 --> 4 --> 3 --> 9. Note that index 9 is the last index of the array.
 *
 * Example 2:
 * Input: arr = [7]
 * Output: 0
 * Explanation: Start index is the last index. You don't need to jump.
 *
 * Example 3:
 * Input: arr = [7,6,9,6,9,6,9,7]
 * Output: 1
 * Explanation: You can jump directly from index 0 to index 7 which is last index of the array.
 *
 * Example 4:
 * Input: arr = [6,1,9]
 * Output: 2
 *
 * Example 5:
 * Input: arr = [11,22,7,7,7,7,7,7,7,22,13]
 * Output: 3
 *
 * Constraints:
 * 1 <= arr.length <= 5 * 10^4
 * -10^8 <= arr[i] <= 10^8
 * */
public class _1345 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/jump-game-iv/discuss/502699/JavaC%2B%2B-BFS-Solution-Clean-code-O(N)*/
        public int minJumps(int[] arr) {
            Map<Integer, List<Integer>> valueToIndices = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                valueToIndices.computeIfAbsent(arr[i], k -> new LinkedList<>()).add(i);
            }
            boolean[] visited = new boolean[arr.length];
            Queue<Integer> indexQueue = new LinkedList<>();
            indexQueue.offer(0);
            int steps = 0;
            while (!indexQueue.isEmpty()) {
                int size = indexQueue.size();
                for (int i = 0; i < size; i++) {
                    int index = indexQueue.poll();
                    if (index == arr.length - 1) {
                        return steps;
                    }
                    List<Integer> nextPossibleIndices = valueToIndices.get(arr[index]);
                    nextPossibleIndices.add(index - 1);
                    nextPossibleIndices.add(index + 1);
                    for (int next : nextPossibleIndices) {
                        if (next >= 0 && next < arr.length && !visited[next]) {
                            visited[next] = true;
                            indexQueue.offer(next);
                        }
                    }
                    nextPossibleIndices.clear();//this line is the key to this entire algorithm to avoid TLE, explanation: https://leetcode.com/problems/jump-game-iv/discuss/502699/JavaC++-BFS-Solution-Clean-code-O(N)/445620
                }
                steps++;
            }
            return 0;
        }
    }
}

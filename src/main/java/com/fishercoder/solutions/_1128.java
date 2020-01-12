package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1128. Number of Equivalent Domino Pairs
 *
 * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.
 * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
 *
 * Example 1:
 *
 * Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
 * Output: 1
 *
 * Constraints:
 * 1 <= dominoes.length <= 40000
 * 1 <= dominoes[i][j] <= 9
 * */
public class _1128 {
    public static class Solution1 {
        public int numEquivDominoPairs(int[][] dominoes) {
            int m = dominoes.length;
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < m; i++) {
                int smaller = Math.min(dominoes[i][0], dominoes[i][1]);
                int bigger = Math.max(dominoes[i][0], dominoes[i][1]);
                int key = smaller * 10 + bigger;
                count += map.getOrDefault(key, 0);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            return count;
        }

    }
}

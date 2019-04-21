package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * There are 2N people a company is planning to interview.
 * The cost of flying the i-th person to city A is costs[i][0], and
 * the cost of flying the i-th person to city B is costs[i][1].
 *
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 */

public class _1029 {
    public static class Solution1 {
        public int twoCitySchedCost(int[][] costs) {
            Arrays.sort(costs, Comparator.comparing((int[] arr) -> arr[0] - arr[1]));
            int totalCost = 0;
            final int n = costs.length;

            for (int i = 0; i < n; ++i) {
                // 2i/n = I(i >= n/2), i.e. 1 if true, 0 if false
                totalCost += costs[i][2*i/n];
            }
            return totalCost;
        }
    }
}

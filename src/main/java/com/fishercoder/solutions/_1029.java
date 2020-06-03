package com.fishercoder.solutions;

import java.util.Arrays;

public class _1029 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/two-city-scheduling/discuss/280173/Java-4-lines-intuitive-solution
         * and
         * https://leetcode.com/problems/two-city-scheduling/discuss/278771/Java-sort-solution
         */
        public int twoCitySchedCost(int[][] costs) {
            Arrays.sort(costs, (a, b) -> (a[0] - a[1] - (b[0] - b[1])));
            int cost = 0;
            for (int i = 0; i < costs.length; i++) {
                if (i < costs.length / 2) {
                    cost += costs[i][0];
                } else {
                    cost += costs[i][1];
                }
            }
            return cost;
        }
    }
}

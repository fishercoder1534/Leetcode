package com.fishercoder.solutions;

import java.util.Arrays;

public class _568 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/articles/maximum-vacation-days/#approach-2-using-dfs-with-memoization-accepted
         */
        public int maxVacationDays(int[][] flights, int[][] days) {
            int[][] memo = new int[flights.length][days[0].length];
            for (int[] l : memo) {
                Arrays.fill(l, Integer.MIN_VALUE);
            }
            return dfs(flights, days, 0, 0, memo);
        }

        public int dfs(int[][] flights, int[][] days, int curCity, int weekno, int[][] memo) {
            if (weekno == days[0].length) {
                return 0;
            }
            if (memo[curCity][weekno] != Integer.MIN_VALUE) {
                return memo[curCity][weekno];
            }
            int maxvac = 0;
            for (int i = 0; i < flights.length; i++) {
                if (flights[curCity][i] == 1 || i == curCity) {
                    int vac = days[i][weekno] + dfs(flights, days, i, weekno + 1, memo);
                    maxvac = Math.max(maxvac, vac);
                }
            }
            memo[curCity][weekno] = maxvac;
            return maxvac;
        }
    }

}

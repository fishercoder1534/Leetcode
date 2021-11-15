package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _2076 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/SaveVMK/ on https://leetcode.com/contest/weekly-contest-267/ranking/
         */
        public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
            int[] head = new int[n];
            boolean[][] isr = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                head[i] = i;
            }
            List<List<Integer>> ch = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ch.add(new ArrayList<>());
                ch.get(i).add(i);
            }
            for (int[] res : restrictions) {
                isr[res[0]][res[1]] = true;
                isr[res[1]][res[0]] = true;
            }
            boolean[] ans = new boolean[requests.length];
            for (int i = 0; i < requests.length; i++) {
                int u = head[requests[i][0]];
                int v = head[requests[i][1]];
                if (u == v) {
                    ans[i] = true;
                    continue;
                }
                if (isr[u][v]) {
                    continue;
                }
                ans[i] = true;
                for (int v2 : ch.get(v)) {
                    ch.get(u).add(v2);
                    head[v2] = u;
                }
                for (int j = 0; j < n; j++) {
                    isr[u][j] |= isr[v][j];
                    isr[j][u] |= isr[j][v];
                }
            }
            return ans;
        }

    }
}

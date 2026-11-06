package com.fishercoder.solutions.thirdthousand;

import java.util.Iterator;
import java.util.TreeSet;

public class _2747 {
    public static class Solution1 {
        /**
         * This is my completely original solution, but got TLE at
         * 2122 / 3129 testcases passed
         */
        public int[] countServers(int n, int[][] logs, int x, int[] queries) {
            TreeSet<Integer>[] treeSets = new TreeSet[n + 1];
            for (int[] log : logs) {
                int serverId = log[0];
                int time = log[1];
                if (treeSets[serverId] == null) {
                    treeSets[serverId] = new TreeSet<>();
                }
                treeSets[serverId].add(time);
            }

            int[] ans = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int begin = queries[i] - x;
                int end = queries[i];
                int inDurationCount = 0;
                for (int j = 1; j <= n; j++) {
                    if (hasReceivedRequest(treeSets[j], begin, end)) {
                        inDurationCount++;
                    }
                }
                ans[i] = n - inDurationCount;
            }
            return ans;
        }

        private boolean hasReceivedRequest(TreeSet<Integer> treeSet, int begin, int end) {
            if (treeSet == null) {
                return false;
            }
            TreeSet<Integer> copy = new TreeSet<>(treeSet);
            Iterator<Integer> iter = copy.iterator();
            while (iter.hasNext()) {
                int time = iter.next();
                iter.remove();
                if (time >= begin && time <= end) {
                    return true;
                }
            }
            return false;
        }
    }
}

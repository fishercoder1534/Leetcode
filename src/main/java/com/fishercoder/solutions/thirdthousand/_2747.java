package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;
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

    public static class Solution2 {
        /**
         * Sliding window solution.
         * Credit: Gemini
         */
        public int[] countServers(int n, int[][] logs, int x, int[] queries) {
            int queriesLength = queries.length;
            int[][] sortedQueries = new int[queriesLength][2];
            for (int i = 0; i < queriesLength; i++) {
                sortedQueries[i][0] = queries[i]; // this is the query time
                sortedQueries[i][1] = i; // this is its original index in queries array
            }
            Arrays.sort(sortedQueries, (a, b) -> a[0] - b[0]); //sort by its query time, not their original index

            //sort logs by their receival time
            Arrays.sort(logs, (a, b) -> a[1] - b[1]);

            int activeServers = 0; // number of servers in the current window that have received the request
            int[] ans = new int[queriesLength];
            int[] serverCounts = new int[n + 1]; // tracks the frequency of server requests in the current window

            int left = 0; // trailing pointer to drop old logs out of the current window
            int right = 0; // leading pointer to pull logs into current window
            for (int i = 0; i < queriesLength; i++) {
                int queryTime = sortedQueries[i][0];
                int queryIndex = sortedQueries[i][1];
                int windowStart = queryTime - x;
                int windowEnd = queryTime;

                //keep pulling logs into the current active window
                while (right < logs.length && logs[right][1] <= windowEnd) {
                    int serverId = logs[right][0];
                    if (serverCounts[serverId] == 0) {
                        activeServers++;
                    }
                    serverCounts[serverId]++;
                    right++;
                }

                //keep dropping logs out of the current active window
                while (left < logs.length && logs[left][1] < windowStart) {
                    int serverId = logs[left][0];
                    serverCounts[serverId]--;
                    if (serverCounts[serverId] == 0) {
                        activeServers--;
                    }
                    left++;
                }

                ans[queryIndex] = n - activeServers;
            }

            return ans;
        }
    }
}

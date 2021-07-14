package com.fishercoder.solutions;

import java.util.Arrays;

public class _1024 {
    public static class Solution1 {
        /**
         * Greedy
         * Time: O(nlogn) where n is the number of clips
         * Space: O(1)
         */
        public int videoStitching(int[][] clips, int time) {
            Arrays.sort(clips, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
            int count = 0;
            int covered = 0;
            for (int i = 0, start = 0; start < time; count++, start = covered) {
                for (; i < clips.length && clips[i][0] <= start; i++) {
                    covered = Math.max(covered, clips[i][1]);
                }
                if (start == covered) {
                    return -1;
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        /**
         * DP
         * Time: ?
         * Space: ?
         */
        public int videoStitching(int[][] clips, int time) {
            //TODO: implement it.
            return -1;
        }
    }
}

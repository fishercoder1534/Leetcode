package com.fishercoder.solutions;

public class _517 {
    public static class Solution1 {
        /**
         * Reference: https://discuss.leetcode.com/topic/79938/super-short-easy-java-o-n-solution
         */
        public int findMinMoves(int[] machines) {
            int total = 0;
            for (int i : machines) {
                total += i;
            }
            if (total % machines.length != 0) {
                return -1;
            }
            int avg = total / machines.length;
            int cnt = 0;
            int max = 0;
            for (int load : machines) {
                cnt += load - avg; //load-avg is "gain/lose"
                max = Math.max(Math.max(max, Math.abs(cnt)), load - avg);
            }
            return max;
        }
    }
}

package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _997 {
    public static class Solution1 {
        public int findJudge(int n, int[][] trust) {
            int[] trustPoints = new int[n];
            Set<Integer> trustOthers = new HashSet<>();
            for (int[] eachTrust : trust) {
                trustPoints[eachTrust[1] - 1]++;
                trustOthers.add(eachTrust[0]);
            }
            int judge = -1;
            for (int i = 0; i < trustPoints.length; i++) {
                if (trustPoints[i] == n - 1 && !trustOthers.contains(i + 1)) {
                    judge = i + 1;
                }
            }
            return judge;
        }
    }

    public static class Solution2 {
        /**
         * Credit: https://leetcode.com/problems/find-the-town-judge/solution/ solution 2
         * Also, note: is it possible to have more than one town judges?
         * No! It's impossible! If it's possible, suppose there are two town judges, then both of them have to be trusted by everyone else which includes the other judge.
         * Otherwise, we'ld have a town judge not trusted by everybody.
         */
        public int findJudge(int n, int[][] trust) {
            if (trust.length < n - 1) {
                return -1;
            }
            int[] trustScores = new int[n];
            for (int[] t : trust) {
                trustScores[t[1] - 1]++;
                trustScores[t[0] - 1]--;
            }
            for (int i = 0; i < n; i++) {
                if (trustScores[i] == n - 1) {
                    return i + 1;
                }
            }
            return -1;
        }
    }
}

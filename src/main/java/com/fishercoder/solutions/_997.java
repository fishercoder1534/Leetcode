package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _997 {
    public static class Solution1 {
        public int findJudge(int N, int[][] trust) {
            int[] trustPoints = new int[N];
            Set<Integer> trustOthers = new HashSet<>();
            for (int[] eachTrust : trust) {
                trustPoints[eachTrust[1] - 1]++;
                trustOthers.add(eachTrust[0]);
            }
            int judge = -1;
            for (int i = 0; i < trustPoints.length; i++) {
                if (trustPoints[i] == N - 1 && !trustOthers.contains(i + 1)) {
                    judge = i + 1;
                }
            }
            return judge;
        }
    }
}

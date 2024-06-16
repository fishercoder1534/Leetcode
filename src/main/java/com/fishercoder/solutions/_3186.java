package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _3186 {
    public static class Solution1 {
        public long maximumTotalDamage(int[] power) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int p : power) {
                treeMap.put(p, treeMap.getOrDefault(p, 0) + 1);
            }
            List<Integer> sortedList = new ArrayList<>(treeMap.keySet());
            long[] dp = new long[sortedList.size()];
            dp[0] = (long) sortedList.get(0) * treeMap.get(sortedList.get(0));
            for (int i = 1; i < sortedList.size(); i++) {
                int currentPower = sortedList.get(i);
                long currentDamage = (long) currentPower * treeMap.get(currentPower);
                //from i - 1, all the way to the left of this sorted list, check to find the nearest valid power
                //using this test case: new int[]{7, 1, 6, 3}, would easily illustrate this idea
                //dp[i] holds the maximum possible damage for up to sortedList[i]
                int j = i - 1;
                while (j >= 0 && sortedList.get(j) >= currentPower - 2) {
                    j--;
                }
                if (j >= 0) {
                    dp[i] = Math.max(dp[i - 1], currentDamage + dp[j]);
                } else {
                    dp[i] = Math.max(dp[i - 1], currentDamage);
                }
            }
            return dp[dp.length - 1];
        }
    }
}

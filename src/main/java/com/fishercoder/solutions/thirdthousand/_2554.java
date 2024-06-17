package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2554 {
    public static class Solution1 {
        public int maxCount(int[] banned, int n, int maxSum) {
            Set<Integer> set = new HashSet<>();
            for (int b : banned) {
                set.add(b);
            }
            int maxCnt = 0;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (!set.contains(i)) {
                    if (sum + i > maxSum) {
                        return maxCnt;
                    } else {
                        sum += i;
                        maxCnt++;
                    }
                }
            }
            return maxCnt;
        }
    }
}

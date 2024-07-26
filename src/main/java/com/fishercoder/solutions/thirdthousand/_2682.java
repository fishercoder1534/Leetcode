package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2682 {
    public static class Solution1 {
        public int[] circularGameLosers(int n, int k) {
            if (n == 1) {
                return new int[0];
            }
            Set<Integer> met = new HashSet<>();
            int i = 1;
            int ball = 1;
            while (met.add(ball)) {
                ball += (i * k) % n;
                if (ball > n) {
                    ball %= n;
                }
                i++;
            }
            if (n == met.size()) {
                return new int[0];
            }
            int[] ans = new int[n - met.size()];
            int q = 0;
            for (int j = 1; j <= n; j++) {
                if (!met.contains(j)) {
                    ans[q++] = j;
                }
            }
            return ans;
        }
    }
}

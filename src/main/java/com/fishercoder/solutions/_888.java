package com.fishercoder.solutions;

import java.util.HashSet;

public class _888 {
    public static class Solution1 {
        public int[] fairCandySwap(int[] A, int[] B) {
            int aSum = 0;
            int bSum = 0;
            int diff = 0;
            int[] ans = new int[2];
            for (int bar : A) {
                aSum += bar;
            }
            for (int bar : B) {
                bSum += bar;
            }
            diff = aSum - bSum;
            HashSet<Integer> set = new HashSet<>();
            for (int bar : A) {
                set.add(bar);
            }
            for (int bar : B) {
                if (set.contains(bar + diff / 2)) {
                    ans[0] = bar + diff / 2;
                    ans[1] = bar;
                    break;
                }
            }
            return ans;
        }
    }
}

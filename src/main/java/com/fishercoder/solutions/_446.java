package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _446 {
    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/67413/detailed-explanation-for-java-o-n-2-solution
         */
        public int numberOfArithmeticSlices(int[] A) {
            int res = 0;
            Map<Integer, Integer>[] map = new Map[A.length];

            for (int i = 0; i < A.length; i++) {
                map[i] = new HashMap<>(i);

                for (int j = 0; j < i; j++) {
                    long diff = (long) A[i] - A[j];
                    if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) {
                        continue;
                    }

                    int d = (int) diff;
                    int c1 = map[i].getOrDefault(d, 0);
                    int c2 = map[j].getOrDefault(d, 0);
                    res += c2;
                    map[i].put(d, c1 + c2 + 1);
                }
            }

            return res;
        }
    }
}

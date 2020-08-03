package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _970 {
    public static class Solution1 {
        /**
         * This approach results in Time Limit Exceeded since it's apparently doing
         * redundant checks.
         */
        public List<Integer> powerfulIntegers(int x, int y, int bound) {
            Set<Integer> result = new HashSet<>();
            int small = x;
            int big = y;
            if (x > y) {
                small = y;
                big = x;
            }
            int maxPower = bound / small;
            for (int i = 0; i <= maxPower + 1; i++) {
                for (int j = 0; j <= maxPower + 1; j++) {
                    int sum = (int) (Math.pow(small, i) + Math.pow(big, j));
                    if (sum <= bound) {
                        result.add(sum);
                    }
                }
            }
            List<Integer> list = new ArrayList<>(result);
            Collections.sort(list);
            return list;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/powerful-integers/discuss/214212/JavaC%2B%2BPython-Brute-Force
         */
        public List<Integer> powerfulIntegers(int x, int y, int bound) {
            Set<Integer> result = new HashSet<>();
            for (int i = 1; i < bound; i *= x > 1 ? x : bound + 1) {
                for (int j = 1; i + j <= bound; j *= y > 1 ? y : bound + 1) {
                    result.add(i + j);
                }
            }
            return new ArrayList<>(result);
        }
    }
}

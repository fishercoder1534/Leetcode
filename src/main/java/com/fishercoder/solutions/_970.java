package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _970 {
    public static class Solution1 {
        public List<Integer> powerfulIntegers(int x, int y, int bound) {
            int powerInteger;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i <= bound; i++) {
                for (int j = 0; j <= bound; j++) {
                    powerInteger = (int) (Math.pow(x, i) + Math.pow(y, j));
                    if (powerInteger <= bound) {
                        set.add(powerInteger);
                    } else {
                        break;
                    }
                    if (y == 1) {
                        break;
                    }
                }
                if (x == 1) {
                    break;
                }
            }
            return new ArrayList<>(set);
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

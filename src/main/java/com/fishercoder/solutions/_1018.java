package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1018 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/binary-prefix-divisible-by-5/discuss/266051/Java-beats-100
         */
        public List<Boolean> prefixesDivBy5(int[] A) {
            List<Boolean> result = new ArrayList<>(A.length);
            int remainder = 0;
            for (int a : A) {
                remainder = ((remainder << 1) + a) % 5;
                result.add(remainder == 0);
            }
            return result;
        }
    }
}

package com.fishercoder.solutions;

import java.math.BigInteger;

public class _483 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/82130/java-solution-with-hand-writing-explain
         */
        public String smallestGoodBase(String n) {
            long nn = Long.parseLong(n);
            long res = 0;
            for (int k = 60; k >= 2; k--) {
                long start = 2;
                long end = nn;
                while (start < end) {
                    long m = start + (end - start) / 2;

                    BigInteger left = BigInteger.valueOf(m);
                    left = left.pow(k).subtract(BigInteger.ONE);
                    BigInteger right = BigInteger.valueOf(nn).multiply(BigInteger.valueOf(m).subtract(BigInteger.ONE));
                    int cmr = left.compareTo(right);
                    if (cmr == 0) {
                        res = m;
                        break;
                    } else if (cmr < 0) {
                        start = m + 1;
                    } else {
                        end = m;
                    }
                }

                if (res != 0) {
                    break;
                }
            }
            return "" + res;
        }
    }

}

package com.fishercoder.solutions;

public class _458 {

    public static class Solution1 {
        public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
            if (buckets-- == 1) {
                return 0;
            }
            int base = minutesToTest / minutesToDie + 1;
            int count = 0;
            while (buckets > 0) {
                buckets /= base;
                count++;
            }
            return count;
        }
    }

}

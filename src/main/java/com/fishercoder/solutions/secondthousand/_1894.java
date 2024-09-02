package com.fishercoder.solutions.secondthousand;

public class _1894 {
    public static class Solution1 {
        public int chalkReplacer(int[] chalk, int k) {
            long sum = 0;
            for (int c : chalk) {
                sum += c;
            }
            if (k >= sum) {
                k %= (int) sum;
            }
            for (int i = 0; i < chalk.length; i++) {
                if (chalk[i] > k) {
                    return i;
                }
                k -= chalk[i];
            }
            return -1;
        }
    }
}

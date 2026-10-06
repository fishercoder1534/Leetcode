package com.fishercoder.solutions.fourththousand;

public class _3827 {
    public static class Solution1 {
        public int countMonobit(int n) {
            int count = 0;
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    count++;
                } else {
                    String bin = Integer.toBinaryString(i);
                    boolean valid = true;
                    for (char c : bin.toCharArray()) {
                        if (c != '1') {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        /**
         * If you draw a few numbers out, you'd see this pattern:
         * 0=0
         * 1=1
         * 2=10
         * 3=11
         * 4=100
         * 5=101
         * 6=110
         * 7=111
         * 8=1000
         * 9=1001
         * 10=1010
         * 11=1011
         * 12=1100
         * 13=1101
         * 14=1110
         * 15=1111
         * 16=10000
         * ....
         * <p>
         * <p>
         * so the pattern is:
         * 1. the only monobit pattern is all ones, not all zeroes, except the very first zero number
         * 2. this only happens when it's the perfect power of two
         *
         */
        public int countMonobit(int n) {
            int count = 1;
            int ones = 1;
            while (ones <= n) {
                ones += (int) Math.pow(2, count);
                count++;
            }
            return count;
        }
    }
}

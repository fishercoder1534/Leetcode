package com.fishercoder.solutions;

public class _191 {

    public static class Solution1 {
        /**
         * Doing bitwise AND operation between n and n-1 will always flip the least significant 1 bit in n to zero
         * example run for the above editorial solution: input 5, n will be 5&4 and becomes 4,
         * then in the next run, n will become 4&3 which is 0, thus exit the while loop.
         *
         * e.g. 5 in binary format: 101
         *      4 in binary format: 100
         *      so 5 AND 4 becomes 100, it's the least significant 1-bit in n always maps to a 0-bit in n - 1
         *      so n ANDs with n - 1, will just set the least significant 1-bit in n to be zero and all other bits remain unchanged
         */
        public int hammingWeight(int n) {
            int bits = 0;
            while (n != 0) {
                bits++;
                n &= (n - 1);
            }
            return bits;
        }
    }

    public static class Solution2 {
        public int hammingWeight(int n) {
            int bits = 0;
            int mask = 1;
            for (int i = 0; i < 32; i++) {
                if ((n & mask) != 0) {
                    bits++;
                }
                mask <<= 1;
            }
            return bits;
        }
    }

    public static class Solution3 {
        public int hammingWeight(int n) {
            int bits = 0;
            for (int i = 0; i < 32; i++) {
                if ((n & 1) == 1) {
                    bits++;
                }
                if (n == 0) {
                    return bits;
                }
                /**must use unsigned right shift operator since the problem says this is an unsigned value*/
                n >>>= 1;
            }
            return bits;
        }
    }

    public static class Solution4 {
        public int hammingWeight(int n) {
            int bits = 0;
            for (int i = 0; i < 32; i++) {
                bits += n & 1;
                n >>>= 1;
            }
            return bits;
        }
    }
}

package com.fishercoder.solutions;

public class _190 {
    /**delimiting the binary string into 4 bits array will make it easier to see/visualize:
     * original binary format:
     * 0000,0010,1001,0100,0001,1110,1001,1100,
     * after reversing, becomes:
     * 0011,1001,0111,1000,0010,1001,0100,0000
     * The most right side digit shifted to the most left side, the 2nd right side digit shifted to the 2nd left side, so forth..*/

    /**
     * This post: http://stackoverflow.com/questions/2811319/difference-between-and
     * gives a good explanation between logical right shift: ">>>" and arithmetic right shift: ">>".
     * Basically, ">>" preserves the most left bit and treats it as the sign for this number,
     * e.g. -2 represented in 8 bits is 11111110, thus -2 >> 1 will become 11111111, i.e. -1
     * notice its sign bit (the most left one bit) is preserved
     * However, logical right shift ">>>" doesn't care about the first bit on the most left,
     * it simply shifts every bit to the right.
     * e.g. -2 >>> 1 would become 1111111111111111111111111111111, i.e. 2147483647
     */

    public static class Solution1 {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int res = 0;
            for (int i = 0; i < 32; i++) {
                res += n & 1;//get the most right bit each time
                n >>>= 1;//do UN-signed right shift by 1 each time
                //n >>= 1;//this line works as well on LeetCode OJ, choosing either one works
                if (i < 31) {
                    res <<= 1;//shift this number to the left by 1 each time, so that eventually, this number is reversed
                }
            }
            return res;
        }
    }
}

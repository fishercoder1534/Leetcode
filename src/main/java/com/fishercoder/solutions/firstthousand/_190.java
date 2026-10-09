package com.fishercoder.solutions.firstthousand;

public class _190 {
    /**
     * delimiting the binary string into 4 bits array will make it easier to see/visualize:
     * original binary format:
     * 0000,0010,1001,0100,0001,1110,1001,1100,
     * after reversing, becomes:
     * 0011,1001,0111,1000,0010,1001,0100,0000
     * The most right side digit shifted to the most left side, the 2nd right side digit shifted to the 2nd left side, so forth...
     */

    /**
     * This post: http://stackoverflow.com/questions/2811319/difference-between-and
     * gives a good explanation between
     * logical right shift: ">>>"
     * and
     * arithmetic right shift: ">>":
     * <p>
     * Basically, ">>" preserves the most left bit and treats it as the sign for this number:
     * e.g. -2 represented in 8 bits is 11111110,
     * thus -2 >> 1 will become 11111111,
     * i.e. -1
     * notice its sign bit (the most left one bit) is preserved
     * <p>
     * However, logical right shift ">>>" doesn't care about the first bit on the most left,
     * it simply shifts every bit to the right.
     * e.g. -2 >>> 1 would become 1111111111111111111111111111111, i.e. 2147483647
     */

    public static class Solution1 {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int res = 0;
            for (int i = 0; i < 32; i++) {
                res += n & 1; // get the most right bit each time
                n >>>= 1; // do UN-signed right shift by 1 each time, i.e. logical right shift, fills with zeroes
                // n >>= 1;//this line also works on LeetCode OJ, choosing either one works, and the reason it works is because we are using a bounded loop up to 32 iterations
                if (i < 31) {
                    res <<= 1; // shift this number to the left by 1 each time, so that eventually this number is reversed
                }
            }
            return res;
        }
    }

    public static class Solution2 {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int reversed = 0;
            for (int i = 0; i < 32; i++) {
                //this is to get the least significant bit (rightmost) bit of n
                int lastBit = n & 1;

                //make room for reversed by shifting all bits to the left by one bit:
                reversed = reversed << 1;

                //insert the extracted last bit onto the empty spot on the rightmost bit: OR is used to combine bits, while AND is used to mask bits.
                reversed = reversed | lastBit;

                //move n to the right by one bit using logical shift >>>
                //this drops the rightmost bit we just processed and fills the left side with zeroes
                n = n >> 1;
            }
            return reversed;
        }
    }
}

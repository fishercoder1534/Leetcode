package com.fishercoder.solutions;

/**
 * 190. Reverse Bits
 * Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?
 */

public class _190 {
    /**delimiting the binary string into 4 bits array will make it easier to see/visualize:
     * original binary format:
     * 0000,0010,1001,0100,0001,1110,1001,1100,
     * after reversing, becomes:
     * 0011,1001,0111,1000,0010,1001,0100,0000
     * The most right side digit shifted to the most left side, the 2nd right side digit shifted to the 2nd left side, so forth..*/

    /**This post: http://stackoverflow.com/questions/2811319/difference-between-and
     * gives a good explanation between logical right shift: ">>>" and arithmetic right shift: ">>".
     * Basically, ">>" preserves the most left bit and treats it as the sign for this number,
     * e.g. -2 represented in 8 bits is 11111110, thus -2 >> 1 will become 11111111, i.e. -1
     * notice its sign bit (the most left one bit) is preserved   
     * However, logical right shift ">>>" doesn't care about the first bit on the most left, 
     * it simply shifts every bit to the right.
     * e.g. -2 >>> 1 would become 1111111111111111111111111111111, i.e. 2147483647*/
    
    
 // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += n & 1;//get the most right bit each time
            n >>>= 1;//do UN-signed right shift by 1 each time
            if (i < 31) {
                res <<= 1;//shift this number to the left by 1 each time, so that eventually, this number is reversed
            }
        }
        return res;
    }

    /**follow-up: if this function is called many times, how to improve it?
    Divide the integer into 4 bytes,
     reverse each byte and then combine them into one in the end,
     use cache to store the reversed results for reuse if possible.*/

    public static void main(String... strings) {
        _190 test = new _190();
//        int n = 43261596;
        int n = 4;
        System.out.println("original number : " + n);
        System.out.println("original number in binary format: " + Integer.toBinaryString(n));
        int result = test.reverseBits(n);
        System.out.println("reversed bit result: " + result);
        System.out.println("reversed bit result in binary format: " + Integer.toBinaryString(result));

        //        System.out.println(Integer.toBinaryString(4));
//        System.out.println(Integer.parseInt("11000", 2));
//        System.out.println(Integer.parseInt("00011", 2));
//        System.out.println(-2 >>> 1);
//        System.out.println(Integer.toBinaryString(-2 >>> 1));
//        System.out.println(Integer.toBinaryString(-2));
//        System.out.println(Integer.toBinaryString(-1));
//        System.out.println(Integer.toBinaryString(6));
    }
}

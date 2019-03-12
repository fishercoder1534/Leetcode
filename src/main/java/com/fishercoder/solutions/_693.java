package com.fishercoder.solutions;

/**
 * 693. Binary Number with Alternating Bits
 *
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

 Example 1:
 Input: 5
 Output: True
 Explanation:
 The binary representation of 5 is: 101

 Example 2:
 Input: 7
 Output: False
 Explanation:
 The binary representation of 7 is: 111.

 Example 3:
 Input: 11
 Output: False
 Explanation:
 The binary representation of 11 is: 1011.

 Example 4:
 Input: 10
 Output: True
 Explanation:
 The binary representation of 10 is: 1010.
 */

public class _693 {
    public static class Solution1 {
        public boolean hasAlternatingBits(int n) {
            String binaryStr = Integer.toBinaryString(n);
            for (int i = 1; i < binaryStr.length(); i++) {
                if (binaryStr.charAt(i - 1) == binaryStr.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        public boolean hasAlternatingBits(int n) {
            return Integer.bitCount(((n >> 1) ^ n) + 1) == 1;
        }
    }
}

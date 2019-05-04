package com.fishercoder.solutions;

/**
 * 476. Number Complement
 *
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

 Note:
 The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 You could assume no leading zero bit in the integer’s binary representation.
 Example 1:
 Input: 5
 Output: 2
 Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 Example 2:
 Input: 1
 Output: 0
 Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 */
public class _476 {

    public static class Solution1 {
        public int findComplement(int num) {
            return ~num & ((Integer.highestOneBit(num) << 1) - 1);
        }
    }

    public static class Solution2 {
        public int findComplement(int num) {
            String str = Integer.toBinaryString(num);
            StringBuilder sb = new StringBuilder();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '0') {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
            return Integer.parseInt(sb.toString(), 2);
        }
    }
}

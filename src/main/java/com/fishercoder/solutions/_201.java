package com.fishercoder.solutions;

public class _201 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/28538/java-python-easy-solution-with-explanation
         * Bitwise AND operation within range actually turns out to be doing some operations with just these two boundary numbers: m and n
         * e.g. 5 and 7, in binary, they are 101 and 111, the result for [5,7] is 5&6&7 which is 101&110&111
         * this we can understand it to be shifting the digits of m and n from left to right until they become the same, then we pad that number with zeroes on the right side
         * <p>
         * A more visual explanation here: https://leetcode.com/problems/bitwise-and-of-numbers-range/solution/
         */
        public int rangeBitwiseAnd(int left, int right) {
            int shift = 0;
            while (left != right) {
                left >>= 1;
                right >>= 1;
                shift++;
            }
            return right << shift;
        }
    }
}

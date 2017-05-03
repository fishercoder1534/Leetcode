package com.stevesun.solutions;

/**
 * 201. Bitwise AND of Numbers Range
 *
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

 For example, given the range [5, 7], you should return 4.

 */
public class _201 {

    //this naive approach works, but will result in TLE as expected for 8256/8266 test cases: (0, 2147483647)
    public int rangeBitwiseAnd_TLE(int m, int n) {
        if (m == 0) return m;
        int result = m;
        for (int i = m+1; i <= n; i++) {
            result &= i;
        }
        return result;
    }

    //credit: https://discuss.leetcode.com/topic/28538/java-python-easy-solution-with-explanation
    //Bitwise AND operation within range actually turns out to be doing some operations with just these two boundary numbers: m and n
    //e.g. 5 and 7, in binary, they are 101 and 111, the result for [5,7] is 5&6&7 which is 101&110&111
    //this we can understand it to be shifting the digits of m and n from left to right until they become the same, then we pad that number with zeroes on the right side
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            i++;
        }
        return (n << i);
    }
}

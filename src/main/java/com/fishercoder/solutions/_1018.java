package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1018. Binary Prefix Divisible By 5
 *
 * Given an array A of 0s and 1s, consider N_i: the i-th subarray from A[0] to A[i] interpreted as a binary number (from most-significant-bit to least-significant-bit.)
 *
 * Return a list of booleans answer, where answer[i] is true if and only if N_i is divisible by 5.
 *
 * Example 1:
 *
 * Input: [0,1,1]
 * Output: [true,false,false]
 * Explanation:
 * The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.  Only the first number is divisible by 5, so answer[0] is true.
 * Example 2:
 *
 * Input: [1,1,1]
 * Output: [false,false,false]
 * Example 3:
 *
 * Input: [0,1,1,1,1,1]
 * Output: [true,false,false,false,true,false]
 * Example 4:
 *
 * Input: [1,1,1,0,1]
 * Output: [false,false,false,false,false]
 *
 *
 * Note:
 *
 * 1 <= A.length <= 30000
 * A[i] is 0 or 1
 * */
public class _1018 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/binary-prefix-divisible-by-5/discuss/266051/Java-beats-100*/
        public List<Boolean> prefixesDivBy5(int[] A) {
            List<Boolean> result = new ArrayList<>(A.length);
            int remainder = 0;
            for (int a : A) {
                remainder = ((remainder << 1) + a) % 5;
                result.add(remainder == 0);
            }
            return result;
        }
    }
}

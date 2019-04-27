package com.fishercoder.solutions;

import java.util.HashSet;

/**
 * 888. Fair Candy Swap
 *
 * Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j]
 * is the size of the j-th bar of candy that Bob has.
 *
 * Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the
 * same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
 *
 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the
 * size of the candy bar that Bob must exchange.
 *
 * If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [1,1], B = [2,2]
 * Output: [1,2]
 * Example 2:
 *
 * Input: A = [1,2], B = [2,3]
 * Output: [1,2]
 * Example 3:
 *
 * Input: A = [2], B = [1,3]
 * Output: [2,3]
 * Example 4:
 *
 * Input: A = [1,2,5], B = [2,4]
 * Output: [5,4]
 */

public class _888 {
    public static class Solution1 {
        public int[] fairCandySwap(int[] A, int[] B) {
            int aSum = 0;
            int bSum = 0;
            int diff = 0;
            int[] ans = new int[2];
            for (int bar : A) {
                aSum += bar;
            }
            for (int bar : B) {
                bSum += bar;
            }
            diff = aSum - bSum;
            HashSet<Integer> set = new HashSet<>();
            for (int bar : A) {
                set.add(bar);
            }
            for (int bar : B) {
                if (set.contains(bar + diff / 2)) {
                    ans[0] = bar + diff / 2;
                    ans[1] = bar;
                    break;
                }
            }
            return ans;
        }
    }
}

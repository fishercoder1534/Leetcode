package com.fishercoder.solutions;

/**
 * 1304. Find N Unique Integers Sum up to Zero
 *
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 *
 * Example 1:
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
 *
 * Example 2:
 * Input: n = 3
 * Output: [-1,0,1]
 *
 * Example 3:
 * Input: n = 1
 * Output: [0]
 * */
public class _1304 {
    public static class Solution1 {
        public int[] sumZero(int n) {
            int[] result = new int[n];
            int start = -n / 2;
            for (int i = 0; i < n / 2; i++) {
                result[i] = start++;
            }
            if (n % 2 == 0) {
                start++;
            }
            for (int i = n / 2; i < n; i++) {
                result[i] = start++;
            }
            return result;
        }
    }
}

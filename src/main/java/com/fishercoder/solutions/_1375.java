package com.fishercoder.solutions;

/**
 * 1375. Bulb Switcher III
 *
 * There is a room with n bulbs, numbered from 1 to n, arranged in a row from left to right. Initially, all the bulbs are turned off.
 * At moment k (for k from 0 to n - 1), we turn on the light[k] bulb. A bulb change color to blue only if it is on and all the previous bulbs (to the left) are turned on too.
 * Return the number of moments in which all turned on bulbs are blue.
 *
 * Example 1:
 * Input: light = [2,1,3,5,4]
 * Output: 3
 * Explanation: All bulbs turned on, are blue at the moment 1, 2 and 4.
 *
 * Example 2:
 * Input: light = [3,2,4,1,5]
 * Output: 2
 * Explanation: All bulbs turned on, are blue at the moment 3, and 4 (index-0).
 *
 * Example 3:
 * Input: light = [4,1,2,3]
 * Output: 1
 * Explanation: All bulbs turned on, are blue at the moment 3 (index-0).
 * Bulb 4th changes to blue at the moment 3.
 *
 * Example 4:
 * Input: light = [2,1,4,3,6,5]
 * Output: 3
 *
 * Example 5:
 * Input: light = [1,2,3,4,5,6]
 * Output: 6
 *
 * Constraints:
 * n == light.length
 * 1 <= n <= 5 * 10^4
 * light is a permutation of  [1, 2, ..., n]
 * */
public class _1375 {
    public static class Solution1 {
        public int numTimesAllBlue(int[] light) {
            int blues = 0;
            int[] status = new int[light.length];//0 means off, 1 means on
            for (int i = 0; i < light.length; i++) {
                status[light[i] - 1] = 1;
                if (checkAllBlues(status, i)) {
                    blues++;
                }
            }
            return blues;
        }

        private boolean checkAllBlues(int[] status, int endIndex) {
            for (int i = 0; i <= endIndex; i++) {
                if (status[i] != 1) {
                    return false;
                }
            }
            return true;
        }
    }
}

package com.fishercoder.solutions;

/**
 * 1287. Element Appearing More Than 25% In Sorted Array
 *
 * Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time.
 * Return that integer.
 *
 * Example 1:
 * Input: arr = [1,2,2,6,6,6,6,7,10]
 * Output: 6
 *
 * Constraints:
 *
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^5
 * */
public class _1287 {
    public static class Solution1 {
        public int findSpecialInteger(int[] arr) {
            int quarter = arr.length / 4;
            for (int i = 0; i < arr.length - quarter; i++) {
                if (arr[i] == arr[i + quarter]) {
                    return arr[i];
                }
            }
            return -1;
        }
    }
}

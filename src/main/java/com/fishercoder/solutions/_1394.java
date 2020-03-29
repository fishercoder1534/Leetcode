package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1394. Find Lucky Integer in an Array
 *
 * Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.
 * Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.
 *
 * Example 1:
 * Input: arr = [2,2,3,4]
 * Output: 2
 * Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
 *
 * Example 2:
 * Input: arr = [1,2,2,3,3,3]
 * Output: 3
 * Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
 *
 * Example 3:
 * Input: arr = [2,2,2,3,3]
 * Output: -1
 * Explanation: There are no lucky numbers in the array.
 *
 * Example 4:
 * Input: arr = [5]
 * Output: -1
 *
 * Example 5:
 * Input: arr = [7,7,7,7,7,7,7]
 * Output: 7
 *
 * Constraints:
 * 1 <= arr.length <= 500
 * 1 <= arr[i] <= 500
 * */
public class _1394 {
    public static class Solution1 {
        public int findLucky(int[] arr) {
            int lucky = -1;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            for (int num : map.keySet()) {
                if (num == map.get(num) && num > lucky) {
                    lucky = num;
                }
            }
            return lucky;
        }
    }
}

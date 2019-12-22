package com.fishercoder.solutions;

import java.util.TreeMap;

/**
 * 1296. Divide Array in Sets of K Consecutive Numbers
 *
 * Given an array of integers nums and a positive integer k,
 * find whether it's possible to divide this array into sets of k consecutive numbers
 * Return True if its possible otherwise return False.
 *
 * Example 1:
 * Input: nums = [1,2,3,3,4,4,5,6], k = 4
 * Output: true
 * Explanation: Array can be divided into [1,2,3,4] and [3,4,5,6].
 *
 * Example 2:
 * Input: nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
 * Output: true
 * Explanation: Array can be divided into [1,2,3] , [2,3,4] , [3,4,5] and [9,10,11].
 *
 * Example 3:
 * Input: nums = [3,3,2,2,1,1], k = 3
 * Output: true
 *
 * Example 4:
 * Input: nums = [1,2,3,4], k = 3
 * Output: false
 * Explanation: Each array should be divided in subarrays of size 3.
 *
 * Constraints:
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^9
 * 1 <= k <= nums.length
 * */
public class _1296 {
    public static class Solution1 {
        public boolean isPossibleDivide(int[] nums, int k) {
            if (nums.length % k != 0) {
                return false;
            }
            TreeMap<Integer, Integer> treeMap = new TreeMap();
            int min = nums[0];
            for (int num : nums) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
                min = Math.min(min, num);
            }
            while (!treeMap.isEmpty()) {
                if (!isConsecutiveK(treeMap, min, k)) {
                    return false;
                }
                min = findNextMin(treeMap);
                if (min == Integer.MIN_VALUE) {
                    break;
                }
            }
            return true;
        }

        private int findNextMin(TreeMap<Integer, Integer> treeMap) {
            return treeMap.isEmpty() ? Integer.MIN_VALUE : treeMap.entrySet().iterator().next().getKey();
        }

        private boolean isConsecutiveK(TreeMap<Integer, Integer> treeMap, int min, int k) {
            int count = treeMap.get(min);
            treeMap.remove(min);
            for (int i = 1; i < k; i++) {
                int key = min + i;
                if (!treeMap.containsKey(key) || treeMap.get(key) < count) {
                    return false;
                } else if (treeMap.get(key) > count) {
                    treeMap.put(key, treeMap.get(key) - count);
                } else {
                    treeMap.remove(key);
                }
            }
            return true;
        }
    }
}

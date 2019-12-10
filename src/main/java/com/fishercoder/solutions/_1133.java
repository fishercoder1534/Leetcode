package com.fishercoder.solutions;

import java.util.TreeMap;

/**
 * 1133. Largest Unique Number
 *
 * Given an array of integers A, return the largest integer that only occurs once.
 * If no integer occurs once, return -1.
 *
 * Example 1:
 * Input: [5,7,3,9,4,9,8,3,1]
 * Output: 8
 * Explanation:
 * The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it's the answer.
 *
 * Example 2:
 * Input: [9,9,8,8]
 * Output: -1
 * Explanation:
 * There is no number that occurs only once.
 *
 * Note:
 * 1 <= A.length <= 2000
 * 0 <= A[i] <= 1000
 * */
public class _1133 {
    public static class Solution1 {
        public int largestUniqueNumber(int[] A) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>((a, b) -> b - a);
            for (int num : A) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
            }
            for (int key : treeMap.keySet()) {
                if (treeMap.get(key) == 1) {
                    return key;
                }
            }
            return -1;
        }
    }

    public static class Solution2 {
        public int largestUniqueNumber(int[] A) {
            int[] count = new int[1001];
            for (int num : A) {
                count[num]++;
            }
            for (int i = 1000; i >= 0; i--) {
                if (count[i] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}

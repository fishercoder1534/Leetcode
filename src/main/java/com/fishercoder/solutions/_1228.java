package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1228. Missing Number In Arithmetic Progression
 *
 * In some array arr, the values were in arithmetic progression: the values arr[i+1] - arr[i] are all equal for every 0 <= i < arr.length - 1.
 * Then, a value from arr was removed that was not the first or last value in the array.
 * Return the removed value.
 *
 * Example 1:
 * Input: arr = [5,7,11,13]
 * Output: 9
 * Explanation: The previous array was [5,7,9,11,13].
 *
 * Example 2:
 * Input: arr = [15,13,12]
 * Output: 14
 * Explanation: The previous array was [15,14,13,12].
 *
 * Constraints:
 * 3 <= arr.length <= 1000
 * 0 <= arr[i] <= 10^5
 * */
public class _1228 {
    public static class Solution1 {
        /**A super verbose and inefficient but working way...*/
        public int missingNumber(int[] arr) {
            Arrays.sort(arr);
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < arr.length - 1; i++) {
                int diff = arr[i + 1] - arr[i];
                List<Integer> list = map.getOrDefault(diff, new ArrayList<>());
                list.add(i);
                map.put(diff, list);
            }
            int smallDiff = arr[arr.length - 1];
            int bigDiff = 0;
            for (int key : map.keySet()) {
                smallDiff = Math.min(smallDiff, key);
                bigDiff = Math.max(bigDiff, key);
            }
            return arr[map.get(bigDiff).get(0)] + smallDiff;
        }
    }

    public static class Solution2 {
        /**credit: https://leetcode.com/problems/missing-number-in-arithmetic-progression/discuss/408474/JavaC%2B%2BPython-Arithmetic-Sum-and-Binary-Search*/
        public int missingNumber(int[] arr) {
            int min = arr[0];
            int max = arr[0];
            int sum = 0;
            for (int num : arr) {
                max = Math.max(max, num);
                min = Math.min(min, num);
                sum += num;
            }
            return (max + min) * (arr.length + 1) / 2 - sum;
        }
    }
}

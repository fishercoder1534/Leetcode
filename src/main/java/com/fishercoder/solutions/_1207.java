package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1207. Unique Number of Occurrences
 *
 * Given an array of integers arr,
 * write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 *
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 *
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 *
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 *
 * Constraints:
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 * */
public class _1207 {
    public static class Solution1 {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            Arrays.stream(arr).forEach(num -> {
                map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
            });
            Set<Integer> set = new HashSet<>();
            return map.keySet().stream().mapToInt(key -> key).allMatch(key -> set.add(map.get(key)));
        }
    }
}

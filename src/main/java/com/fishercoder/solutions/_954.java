package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 954. Array of Doubled Pairs
 *
 * Given an array of integers A with even length, return true if and only if it is possible to reorder it
 * such that A[2 * i + 1] = 2 * A[2 * i] for every 0 <= i < len(A) / 2.
 *
 * Example 1:
 * Input: [3,1,3,6]
 * Output: false
 *
 * Example 2:
 * Input: [2,1,2,6]
 * Output: false
 *
 * Example 3:
 * Input: [4,-2,2,-4]
 * Output: true
 * Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
 *
 * Example 4:
 * Input: [1,2,4,16,8,4]
 * Output: false
 *
 * Note:
 * 0 <= A.length <= 30000
 * A.length is even
 * -100000 <= A[i] <= 100000
 * */
public class _954 {
    public static class Solution1 {
        public boolean canReorderDoubled(int[] A) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] < 0) {
                    A[i] = -A[i];
                }
            }
            Arrays.sort(A);
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : A) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int num : A) {
                if (num != 0) {
                    if (map.get(num) < 0) {
                        return false;
                    } else if (map.get(num) == 0) {
                        continue;
                    } else {
                        int count = map.get(num);
                        map.put(num, 0);
                        int doubleNum = num * 2;
                        if (!map.containsKey(doubleNum)) {
                            return false;
                        } else {
                            map.put(doubleNum, map.get(doubleNum) - count);
                        }
                    }
                } else if (map.get(num) % 2 != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

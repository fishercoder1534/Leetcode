package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _697 {
    public static class Solution1 {
        public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
            int degree = -1;
            for (int key : map.keySet()) {
                degree = Math.max(degree, map.get(key));
            }
            List<Integer> candidateNums = new ArrayList();
            for (int key : map.keySet()) {
                if (map.get(key) == degree) {
                    candidateNums.add(key);
                }
            }
            int shortest = Integer.MAX_VALUE;
            for (int candidate : candidateNums) {
                shortest = Math.min(shortest, findLength(nums, candidate));
            }
            return shortest;
        }

        int findLength(int[] arr, int candidate) {
            int firstAppearance = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == candidate) {
                    firstAppearance = i;
                    break;
                }
            }
            int lastAppearance = arr.length - 1;
            for (int i = arr.length - 1; i > firstAppearance; i--) {
                if (arr[i] == candidate) {
                    lastAppearance = i;
                    break;
                }
            }
            return (lastAppearance - firstAppearance) + 1;
        }
    }

    public static class Solution2 {
        public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> count = new HashMap<>();
            Map<Integer, Integer> left = new HashMap<>();
            Map<Integer, Integer> right = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
                if (!left.containsKey(nums[i])) {
                    left.put(nums[i], i);
                }
                right.put(nums[i], i);
            }

            int result = nums.length;
            int degree = Collections.max(count.values());
            for (int num : count.keySet()) {
                if (count.get(num) == degree) {
                    result = Math.min(result, right.get(num) - left.get(num) + 1);
                }
            }
            return result;
        }
    }
}

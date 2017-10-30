package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 229. Majority Element II
 *
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * The algorithm should run in linear time and in O(1) space.

 Hint:
 How many majority elements could it possibly have?
 Do you have a better hint? Suggest it!
 */
public class _229 {

    public static class Solution1 {
        public List<Integer> majorityElement(int[] nums) {
            Map<Integer, Integer> counterMap = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if (counterMap.containsKey(nums[i])) {
                    counterMap.put(nums[i], counterMap.get(nums[i]) + 1);
                } else {
                    counterMap.put(nums[i], 1);
                }
            }
            int size = nums.length;
            List<Integer> result = new ArrayList<>();
            for (Integer i : counterMap.keySet()) {
                int threshold = size / 3;
                if (counterMap.get(i) > threshold) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**Moore Voting algorithm*/
        public List<Integer> majorityElement(int[] nums) {
            List<Integer> result = new ArrayList<>();
            if (nums == null || nums.length == 0) {
                return result;
            }
            int count1 = 0;
            int count2 = 0;
            int candidate1 = 0;
            int candidate2 = 1;
            for (int num : nums) {
                if (num == candidate1) {
                    count1++;
                } else if (num == candidate2) {
                    count2++;
                } else if (count1 == 0) {
                    candidate1 = num;
                    count1 = 1;
                } else if (count2 == 0) {
                    candidate2 = num;
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }
            count1 = 0;
            count2 = 0;
            for (int num : nums) {
                if (num == candidate1) {
                    count1 += 2;
                } else {
                    count1--;
                }
                if (num == candidate2) {
                    count2 += 2;
                } else {
                    count2--;
                }
            }
            if (count1 > 0) {
                result.add(candidate1);
            }
            if (count2 > 0) {
                result.add(candidate2);
            }
            return result;
        }
    }

}

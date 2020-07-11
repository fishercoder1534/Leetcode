package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _448 {

    public static class Solution1 {
        /**
         * O(n) space
         * O(n) time
         */
        public List<Integer> findDisappearedNumbers(int[] nums) {

            int max = Integer.MIN_VALUE;
            for (int i : nums) {
                max = Math.max(max, i);
            }
            max = Math.max(max, nums.length);

            Map<Integer, Integer> map = new HashMap();
            for (int i = 1; i <= max; i++) {
                map.put(i, 0);
            }

            for (int i : nums) {
                if (map.get(i) == 0) {
                    map.put(i, 1);
                } else {
                    map.put(i, map.get(i) + 1);
                }
            }

            List<Integer> result = new ArrayList();
            for (int i : map.keySet()) {
                if (map.get(i) == 0) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * O(1) space
         * O(n) time
         */
        public List<Integer> findDisappearedNumbers(int[] nums) {

            for (int i = 0; i < nums.length; i++) {
                int val = Math.abs(nums[i]) - 1;
                if (nums[val] > 0) {
                    nums[val] = -nums[val];
                }
            }

            List<Integer> result = new ArrayList();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    result.add(i + 1);
                }
            }
            return result;
        }
    }

}
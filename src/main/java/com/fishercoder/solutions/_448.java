package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 448. Find All Numbers Disappeared in an Array
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]

 */
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
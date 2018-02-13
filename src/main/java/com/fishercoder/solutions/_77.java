package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. Combinations
 *
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 For example,
 If n = 4 and k = 2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 */

public class _77 {

    public static class Solution1 {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result = new ArrayList();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = i + 1;
            }
            backtracking(k, 0, nums, new ArrayList(), result);
            return result;
        }

        void backtracking(int k, int start, int[] nums, List<Integer> curr, List<List<Integer>> result) {
            if (curr.size() == k) {
                result.add(new ArrayList(curr));
            } else if (curr.size() < k) {
                for (int i = start; i < nums.length; i++) {
                    curr.add(nums[i]);
                    backtracking(k, i + 1, nums, curr, result);
                    curr.remove(curr.size() - 1);
                }
            }
        }
    }
}

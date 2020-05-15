package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _216 {

    public static class Solution1 {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> result = new ArrayList();
            int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            backtracking(k, n, nums, 0, new ArrayList(), result);
            return result;
        }

        void backtracking(int k, int n, int[] nums, int start, List<Integer> curr, List<List<Integer>> result) {
            if (n > 0) {
                for (int i = start; i < nums.length; i++) {
                    curr.add(nums[i]);
                    backtracking(k, n - nums[i], nums, i + 1, curr, result);
                    curr.remove(curr.size() - 1);
                }
            } else if (n == 0 && curr.size() == k) {
                result.add(new ArrayList(curr));
            }
        }
    }
}

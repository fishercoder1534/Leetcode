package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _77 {

    public static class Solution1 {
        /**
         * I'm glad that I worked this one out completely on my own on 10/11/2021! Enjoy the beauty of backtracking!
         */
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            for (int num = 1; num <= n - k + 1; num++) {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                backtracking(list, k - 1, num + 1, n, ans);
            }
            return ans;
        }

        private void backtracking(List<Integer> list, int k, int start, int limit, List<List<Integer>> ans) {
            if (k == 0) {
                ans.add(new ArrayList<>(list));
                return;
            }
            for (int num = start; num <= limit; num++) {
                list.add(num);
                backtracking(list, k - 1, num + 1, limit, ans);
                list.remove(list.size() - 1);
            }
        }
    }

    public static class Solution2 {
        /**
         * My completely own solution on 1/24/2022.
         */
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            int[] nums = new int[n];
            for (int i = 1; i <= n; i++) {
                nums[i - 1] = i;
            }
            backtrack(ans, nums, k, new ArrayList<>(), 0);
            return ans;
        }

        private void backtrack(List<List<Integer>> ans, int[] nums, int k, List<Integer> curr, int start) {
            if (curr.size() == k) {
                ans.add(new ArrayList<>(curr));
            } else if (curr.size() < k) {
                for (int i = start; i < nums.length; i++) {
                    curr.add(nums[i]);
                    backtrack(ans, nums, k, curr, i + 1);
                    curr.remove(curr.size() - 1);
                }
            }
        }
    }
}

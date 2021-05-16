package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1863 {
    public static class Solution1 {
        public int subsetXORSum(int[] nums) {
            int sum = 0;
            List<List<Integer>> subsets = subsets(nums);
            for (List<Integer> subset : subsets) {
                int xor = 0;
                for (int i : subset) {
                    xor ^= i;
                }
                sum += xor;
            }
            return sum;
        }

        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            backtracking(result, new ArrayList(), nums, 0);
            return result;
        }

        void backtracking(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
            result.add(new ArrayList(list));
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]);
                backtracking(result, list, nums, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}

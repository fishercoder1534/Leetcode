package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _90 {

    public static class Solution1 {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            List<Integer> empty = new ArrayList();
            result.add(empty);
            if (nums == null) {
                return result;
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                Set<List<Integer>> temp = new HashSet();
                for (List<Integer> list : result) {
                    List<Integer> newList = new ArrayList(list);
                    newList.add(nums[i]);
                    temp.add(newList);
                }
                result.addAll(temp);
            }
            Set<List<Integer>> resultSet = new HashSet();
            resultSet.addAll(result);
            result.clear();
            result.addAll(resultSet);
            return result;
        }
    }

    public static class Solution2 {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            Arrays.sort(nums);
            backtrack(nums, 0, new ArrayList(), result);
            return result;
        }

        void backtrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> result) {
            result.add(new ArrayList(curr));
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                curr.add(nums[i]);
                backtrack(nums, i + 1, curr, result);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public static class Solution3 {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            result.add(list);
            Arrays.sort(nums);
            backtracking(nums, 0, result, list);
            return result;
        }

        private void backtracking(int[] nums, int start, List<List<Integer>> result, List<Integer> list) {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                list.add(nums[i]);
                result.add(new ArrayList<>(list));
                backtracking(nums, i + 1, result, list);
                list.remove(list.size() - 1);
            }
        }
    }
}

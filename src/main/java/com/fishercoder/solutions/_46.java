package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _46 {

    public static class Solution1 {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            result.add(new ArrayList<>());
            return recursion(nums, 0, result);
        }

        private List<List<Integer>> recursion(int[] nums, int index, List<List<Integer>> result) {
            if (index == nums.length) {
                return result;
            }
            List<List<Integer>> newResult = new ArrayList<>();
            for (List<Integer> eachList : result) {
                for (int i = 0; i <= eachList.size(); i++) {
                    List<Integer> newList = new ArrayList<>(eachList);
                    newList.add(i, nums[index]);
                    newResult.add(newList);
                }
            }
            result = newResult;
            return recursion(nums, index + 1, result);
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/11/2021, although a little verbose and super as efficient as the above one.
         * Basically, insert the next unused number into all possible positions in the currently formed list,
         * as soon as the size of this list equals nums.length, add this new permutation into the result;
         * I'll have to use a HashSet to filter out duplicates.
         */
        public List<List<Integer>> permute(int[] nums) {
            Set<List<Integer>> ans = new HashSet<>();
            boolean[] used = new boolean[nums.length];
            backtracking(new ArrayList<>(), nums, ans, used);
            List<List<Integer>> result = new ArrayList<>();
            for (List<Integer> list : ans) {
                result.add(list);
            }
            return result;
        }

        private void backtracking(List<Integer> list, int[] nums, Set<List<Integer>> ans, boolean[] used) {
            if (list.size() == nums.length) {
                ans.add(new ArrayList<>(list));
                return;
            }
            for (int i = 0; i <= list.size(); i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (!used[j]) {
                        used[j] = true;
                        list.add(i, nums[j]);
                        backtracking(list, nums, ans, used);
                        used[j] = false;
                        list.remove(i);
                    }
                }
            }
        }
    }

    public static class Solution3 {
        /**
         * A more efficient version of backtracking.
         */
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            boolean[] used = new boolean[nums.length];
            return backtracking(ans, used, new ArrayList<>(), nums);
        }

        private List<List<Integer>> backtracking(List<List<Integer>> ans, boolean[] used, List<Integer> list, int[] nums) {
            if (list.size() == nums.length) {
                ans.add(new ArrayList<>(list));
                return ans;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                list.add(nums[i]);
                backtracking(ans, used, list, nums);
                used[i] = false;
                list.remove(list.size() - 1);
            }
            return ans;
        }
    }

}

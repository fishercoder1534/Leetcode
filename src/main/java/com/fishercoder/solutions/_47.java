package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _47 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/31445/really-easy-java-solution-much-easier-than-the-solutions-with-very-high-vote
         */
        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            if (nums == null || nums.length == 0) {
                return result;
            }
            boolean[] used = new boolean[nums.length];
            Arrays.sort(nums);//this sorting is critical for the correctness of this backtracking algorithm as we compare the two adjancent neighbors to filter out possible duplicate permutations
            backtracking(nums, used, new ArrayList(), result);
            return result;
        }


        private void backtracking(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> result) {
            if (list.size() == nums.length) {
                result.add(new ArrayList(list));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                if (i > 0 && nums[i - 1] == nums[i] && used[i - 1]) {
                    /**
                     * For this line, both !used[i-1] and used[i-1] will AC.
                     * It is because the first one makes sure when duplicates are selected, the order is ascending (index from small to large).
                     * However, the second one means the descending order.
                     * But without this used[i - 1] or !used[i - 1] will not yield a correct result as the program will not yield a correct result.
                     */
                    continue;
                }
                used[i] = true;
                list.add(nums[i]);
                backtracking(nums, used, list, result);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

    public static class Solution2 {
        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            Set<List<Integer>> set = new HashSet<>();
            set.add(new ArrayList<>());
            set = recursion(nums, set, 0);
            List<List<Integer>> res = new ArrayList<>();
            for (List<Integer> list : set) {
                res.add(list);
            }
            return res;
        }

        private Set<List<Integer>> recursion(int[] nums, Set<List<Integer>> set, int pos) {
            if (pos == nums.length) {
                return set;
            }
            Set<List<Integer>> newSet = new HashSet<>();
            for (List<Integer> list : set) {
                for (int i = 0; i <= list.size(); i++) {
                    List<Integer> newList = new ArrayList<>(list);
                    newList.add(i, nums[pos]);
                    newSet.add(newList);
                }
            }
            set = newSet;
            return recursion(nums, set, pos + 1);
        }
    }
}

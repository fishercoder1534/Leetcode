package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. Permutations II
 * 
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

 For example,
 [1,1,2] have the following unique permutations:
 [
 [1,1,2],
 [1,2,1],
 [2,1,1]
 ]*/
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
            List<Integer> list = new ArrayList();
            Arrays.sort(nums);
            dfs(nums, used, list, result);
            return result;
        }


        private void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> result) {
            if (list.size() == nums.length) {
                result.add(new ArrayList(list));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) {
                    continue;
                }
                /**
                 * For this line, both !used[i-1] and used[i-1] will AC. It is because the first one makes sure when
                 * duplicates are selected, the order is ascending (index from small to large). However,
                 * the second one means the descending order.
                 */
                used[i] = true;
                list.add(nums[i]);
                dfs(nums, used, list, result);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}

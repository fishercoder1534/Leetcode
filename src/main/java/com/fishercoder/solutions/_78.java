package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 * Given a set of distinct integers, nums, return all possible subsets.
 * Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,3], a solution is:
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */

public class _78 {

    public static class IterativeSolution {

        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            List<Integer> empty = new ArrayList();
            result.add(empty);
            if (nums == null) {
                return result;
            }
            for (int i = 0; i < nums.length; i++) {
                List<List<Integer>> temp = new ArrayList();
                //you'll have to create a new one here, otherwise, it'll throw ConcurrentModificationException.
                for (List<Integer> list : result) {
                    List<Integer> newList = new ArrayList(list);
                    newList.add(nums[i]);
                    temp.add(newList);
                }
                result.addAll(temp);
            }
            return result;
        }

    }

    public static class BacktrackingSolution {

        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            backtracking(result, new ArrayList(), nums, 0);
            return result;
        }

        void backtracking(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
            result.add(new ArrayList(temp));
            for (int i = start; i < nums.length; i++) {
                temp.add(nums[i]);
                backtracking(result, temp, nums, i + 1);
                temp.remove(temp.size() - 1);
            }
        }

    }
}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 *
 * Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]

 */

public class _46 {

    public static class Solution1 {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            result.add(new ArrayList<>());
            return backtracking(nums, 0, result);
        }

        private List<List<Integer>> backtracking(int[] nums, int index, List<List<Integer>> result) {
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
            return backtracking(nums, index + 1, result);
        }
    }

}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 40. Combination Sum II
 *
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * Each number in C may only be used once in the combination.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 A solution set is:
 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]
 */
public class _40 {

    public static class Solution1 {
      public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(candidates);
        backtracking(candidates, 0, result, target, new ArrayList());
        return result;
      }

      void backtracking(int[] candidates, int start, List<List<Integer>> result, int target,
          List<Integer> curr) {
        if (target > 0) {
          for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target || (i > start && candidates[i - 1] == candidates[i])) {
              continue;
            }
            curr.add(candidates[i]);
            backtracking(candidates, i + 1, result, target - candidates[i], curr);
            curr.remove(curr.size() - 1);
          }
        } else if (target == 0) {
          result.add(new ArrayList(curr));
        }
      }
    }
}

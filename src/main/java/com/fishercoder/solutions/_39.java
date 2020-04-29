package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _39 {

    public static class Solution1 {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList();
            Arrays.sort(candidates);
            backtracking(candidates, target, 0, new ArrayList(), result);
            return result;
        }

        void backtracking(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> result) {
            if (target > 0) {
                for (int i = start; i < candidates.length; i++) {
                    if (candidates[i] > target) {
                        continue;//pruning
                    }
                    curr.add(candidates[i]);
                    backtracking(candidates, target - candidates[i], i, curr, result);
                    curr.remove(curr.size() - 1);
                }
            } else if (target == 0) {
                result.add(new ArrayList(curr));
            }
        }
    }
}

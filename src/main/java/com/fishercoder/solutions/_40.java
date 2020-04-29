package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

package com.stevesun.solutions;

import com.stevesun.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]*/
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, new ArrayList(), result);
        return result;
    }
    
    private void backtracking(int[] candidates, int target, int startIndex, List<Integer> curr, List<List<Integer>> result){
        if(target > 0){
            int prev = -1;
            for(int i = startIndex; i < candidates.length; i++){
                if (candidates[i] > target) return;//this is one very important step to optimize this algorithm: pruning
                if (prev != -1 && prev == candidates[i]) continue;
                curr.add(candidates[i]);
                backtracking(candidates, target-candidates[i], i, curr, result);
                curr.remove(curr.size()-1);
            }
        } else if(target == 0){
            List<Integer> list = new ArrayList(curr);
            result.add(list);
        }
    }

    
    public static void main(String...args){
        CombinationSum test = new CombinationSum();
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        List<List<Integer>> result = test.combinationSum(candidates, target);
        CommonUtils.printIntegerList(result);
    }

}

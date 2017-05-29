package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/***Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 Each number in C may only be used once in the combination.

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
 ]*/
public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(candidates);
        helper(candidates, target, 0, new ArrayList(), result);
        return result;
    }
    
    void helper(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> result){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;//skip duplicates, this is one difference from Combination Sum I
                curr.add(candidates[i]);
                helper(candidates, target - candidates[i], i+1, curr, result);//i+1 is the other difference from Combination Sum I
                curr.remove(curr.size()-1);
            }
        } else if(target == 0){
            List<Integer> temp = new ArrayList(curr);
            result.add(temp);
        }
    }

    public static void main(String...args){
        CombinationSumII test = new CombinationSumII();
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = test.combinationSum2(candidates, target);
        CommonUtils.printIntegerList(result);
    }


}

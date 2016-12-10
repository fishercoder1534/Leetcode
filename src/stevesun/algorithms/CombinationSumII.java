package stevesun.algorithms;

import stevesun.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

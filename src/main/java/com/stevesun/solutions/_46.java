package com.stevesun.solutions;
import java.util.ArrayList;
import java.util.List;

/**Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]*/
public class _46 {
    static class AcceptedSolution {
        //this solution has a backtracking function that has a return type
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            List<Integer> init = new ArrayList<>();
            result.add(init);
            return backtracking(result, nums, 0);
        }

        private static List<List<Integer>> backtracking(List<List<Integer>> result, int[] nums, int pos) {
            if (pos == nums.length) {
                return result;
            }
            List<List<Integer>> newResult = new ArrayList();
            for (List<Integer> eachList : result) {
                for (int i = 0; i <= eachList.size(); i++) {
                    List<Integer> newList = new ArrayList(eachList);
                    newList.add(i, nums[pos]);
                    newResult.add(newList);
                }
            }
            result = newResult;
            return backtracking(result, nums, pos + 1);
        }
    }
    
    static class AcceptedSolutionWithVoidType {
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            List<Integer> init = new ArrayList<>();
            result.add(init);
            recursive(result, nums, 0);
            return result;
        }

        private static void recursive(List<List<Integer>> result, int[] nums, int pos) {
            if(pos == nums.length) return;
            List<List<Integer>> newResult = new ArrayList();
            for(List<Integer> eachList : result){
                for(int i = 0; i <= eachList.size(); i++){
                    List<Integer> newList = new ArrayList(eachList);
                    newList.add(i, nums[pos]);
                    newResult.add(newList);
                }
            }
            /**You'll have to use the two lines, instead of this line: result = newResult; otherwise, it won't work!!!*/
            result.clear();
            result.addAll(newResult);
            
            //then recursion
            recursive(result, nums, pos+1);
        }
    }
    
    public static void main(String...args){
        int[] nums = new int[]{1,2,2};
        
    }

}

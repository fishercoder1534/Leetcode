package com.fishercoder.solutions;


import java.util.ArrayList;
import java.util.List;

/**Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 For example,
 If n = 4 and k = 2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]*/
public class _77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = i+1;
        }
        backtracking(k, 0, nums, new ArrayList(), result);
        return result;
    }
    
    void backtracking(int k, int start, int[] nums, List<Integer> temp, List<List<Integer>> result){
        if(temp.size() == k){
            List<Integer> newTemp = new ArrayList(temp);
            result.add(newTemp);
        } else if(temp.size() < k){
            for(int i = start; i < nums.length; i++){
                temp.add(nums[i]);
                backtracking(k, i+1, nums, temp, result);
                temp.remove(temp.size()-1);
            }
        }
    }

}

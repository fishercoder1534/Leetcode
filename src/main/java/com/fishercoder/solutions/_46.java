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
        //this solution has a backtracking function that its return type is not void
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            result.add(new ArrayList<>());
            return backtracking(result, nums, 0);
        }

        private List<List<Integer>> backtracking(List<List<Integer>> result, int[] nums, int pos) {
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

    public static class Solution2 {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            result.add(new ArrayList<>());
            recursive(result, nums, 0);
            return result;
        }

        private void recursive(List<List<Integer>> result, int[] nums, int pos) {
            if (pos == nums.length) {
                return;
            }
            List<List<Integer>> newResult = new ArrayList();
            for (List<Integer> eachList : result) {
                for (int i = 0; i <= eachList.size(); i++) {
                    List<Integer> newList = new ArrayList(eachList);
                    newList.add(i, nums[pos]);
                    newResult.add(newList);
                }
            }
            /**You'll have to use the two lines, instead of this line: result = newResult; otherwise, it won't work!!!*/
            result.clear();
            result.addAll(newResult);

            //then recursion
            recursive(result, nums, pos + 1);
        }
    }

}

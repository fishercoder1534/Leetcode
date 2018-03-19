package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 491. Increasing Subsequences
 *
 * Given an integer array, your task is to find all the different possible increasing subsequences of the given array,
 * and the length of an increasing subsequence should be at least 2 .

 Example:
 Input: [4, 6, 7, 7]
 Output: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]

 Note:
 The length of the given array will not exceed 15.
 The range of integer in the given array is [-100,100].
 The given array may contain duplicates, and two equal integers should also be considered as a special case of increasing sequence.
 */
public class _491 {

    public static class Solution1 {
        public List<List<Integer>> findSubsequences(int[] nums) {
            if (nums == null || nums.length == 1) {
                return new ArrayList<>();
            }
            Set<List<Integer>> answer = new HashSet<>();
            List<Integer> list = new ArrayList<>();
            return new ArrayList<>(backtracking(nums, 0, list, answer));
        }

        private Set<List<Integer>> backtracking(int[] nums, int start, List<Integer> currList,
            Set<List<Integer>> answer) {
            if (currList.size() >= 2) {
                answer.add(new ArrayList<>(currList));
            }
            for (int i = start; i < nums.length; i++) {
                if (currList.size() == 0 || currList.get(currList.size() - 1) <= nums[i]) {
                    currList.add(nums[i]);
                    backtracking(nums, i + 1, currList, answer);
                    currList.remove(currList.size() - 1);
                }
            }
            return answer;
        }
    }
}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

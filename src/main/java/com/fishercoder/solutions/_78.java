package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _78 {

    public static class Solution1 {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            if (nums == null) {
                return result;
            }
            result.add(new ArrayList());
            for (int i = 0; i < nums.length; i++) {
                List<List<Integer>> temp = new ArrayList();
                //you'll have to create a new one here, otherwise, it'll throw ConcurrentModificationException.
                for (List<Integer> list : result) {
                    List<Integer> newList = new ArrayList(list);
                    newList.add(nums[i]);
                    temp.add(newList);
                }
                result.addAll(temp);
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * This is the most straightforward solution and easy to follow.
         */
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            backtracking(result, new ArrayList(), nums, 0);
            return result;
        }

        void backtracking(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
            result.add(new ArrayList(list));
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]);
                backtracking(result, list, nums, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public static class Solution3 {
        /**
         * This is just a slight modification of Solution2, pay close to attention to notice the difference between them.
         */
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            result.add(list);
            backtracking(result, list, nums, 0);
            return result;
        }

        private void backtracking(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]);
                result.add(new ArrayList<>(list));
                backtracking(result, list, nums, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}

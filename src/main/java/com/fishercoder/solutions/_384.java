package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class _384 {

    public static class Solution1 {
        //Note as of 7/20/2021: This solution ends in TLE on LeetCode now.
        //Note: the problem states that this is a set without duplicates which makes building all combinations easier

        private List<List<Integer>> combinations;
        private int[] original;
        private Random random;

        public Solution1(int[] nums) {
            original = nums;
            random = new Random();
            combinations = buildAllComb(nums);
        }

        //insert next value into all possible positions, I wrote this method myself, of course it could be simplified to not use a queue
        //but it just naturally came into my mind that I used a queue
        private List<List<Integer>> buildAllComb(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            if (nums == null || nums.length == 0) {
                return result;
            }

            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[0]);
            Queue<List<Integer>> q = new LinkedList();
            q.offer(list);
            for (int i = 1; i < nums.length; i++) {
                int qSize = q.size();
                for (int k = 0; k < qSize; k++) {
                    List<Integer> currList = q.poll();
                    for (int j = 0; j <= currList.size(); j++) {
                        List<Integer> newL = new ArrayList<Integer>(currList);
                        newL.add(j, nums[i]);
                        q.offer(newL);
                    }
                }
            }
            while (!q.isEmpty()) {
                result.add(q.poll());
            }
            return result;
        }

        /**
         * Resets the array to its original configuration and return it.
         */
        public int[] reset() {
            return original;
        }

        /**
         * Returns a random shuffling of the array.
         */
        public int[] shuffle() {
            if (original == null || original.length == 0) {
                return original;
            }
            int randomIndex = random.nextInt(combinations.size());
            List<Integer> list = combinations.get(randomIndex);
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/shuffle-an-array/discuss/85958/First-Accepted-Solution-Java
         */
        private int[] nums;
        private Random random;

        public Solution2(int[] nums) {
            this.nums = nums;
            this.random = new Random();
        }

        /**
         * Resets the array to its original configuration and return it.
         */
        public int[] reset() {
            return this.nums;
        }

        /**
         * Returns a random shuffling of the array.
         */
        public int[] shuffle() {
            int[] shuffled = this.nums.clone();
            for (int i = 1; i < nums.length; i++) {
                int j = random.nextInt(i + 1);
                swap(shuffled, i, j);
            }
            return shuffled;
        }

        private void swap(int[] shuffled, int i, int j) {
            int tmp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = tmp;
        }
    }
}


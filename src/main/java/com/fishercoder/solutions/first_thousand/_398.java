package com.fishercoder.solutions.first_thousand;

import java.util.*;

public class _398 {

    //TODO: use reservoir sampling to solve it again
    //reservoir sampling: the size of the dataset is unknow before hand

    public static class Solution {
        Map<Integer, List<Integer>> map;
        Random random;

        public Solution(int[] nums) {
            map = new HashMap<>();
            random = new Random();
            for (int i = 0; i < nums.length; i++) {
                List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
                list.add(i);
                map.put(nums[i], list);
            }
        }

        public int pick(int target) {
            List<Integer> list = map.get(target);
            return list.get(random.nextInt(list.size()));
        }
    }
}

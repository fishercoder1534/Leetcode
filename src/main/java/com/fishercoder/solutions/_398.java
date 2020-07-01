package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _398 {

    //TODO: use reservoir sampling to solve it again

    public static class Solution {
        //brute force
        int[] input;
        java.util.Random rand = new java.util.Random();

        public Solution(int[] nums) {
            input = nums;
        }

        public int pick(int target) {
            List<Integer> list = new ArrayList();
            for (int i = 0; i < input.length; i++) {
                if (input[i] == target) {
                    list.add(i);
                }
            }
            if (list.size() == 1) {
                return list.get(0);
            }
            int randomIndex = rand.nextInt(list.size());
            return list.get(randomIndex);
        }
    }
}

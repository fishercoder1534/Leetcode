package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2848 {
    public static class Solution1 {
        public int numberOfPoints(List<List<Integer>> nums) {
            Set<Integer> set = new HashSet<>();
            for (List<Integer> num : nums) {
                for (int i = num.get(0); i <= num.get(1); i++) {
                    set.add(i);
                }
            }
            return set.size();
        }
    }
}

package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _403 {

    public static class Solution1 {
        /**
         * Reference: https://discuss.leetcode.com/topic/59903/very-easy-to-understand-java-solution-with-explanations/2
         * and https://leetcode.com/articles/frog-jump/#approach-5-using-dynamic-programmingaccepted
         */
        public boolean canCross(int[] stones) {
            if (stones.length == 0) {
                return true;
            }
            Map<Integer, Set<Integer>> map = new HashMap<>(stones.length);
            map.put(0, new HashSet<>());
            map.get(0).add(1);
            for (int i = 1; i < stones.length; i++) {
                map.put(stones[i], new HashSet<>());
            }

            for (int i = 0; i < stones.length; i++) {
                int stone = stones[i];
                for (int step : map.get(stone)) {
                    int reach = step + stone;
                    if (reach == stones[stones.length - 1]) {
                        return true;
                    }
                    Set<Integer> set = map.get(reach);
                    if (set != null) {
                        set.add(step);
                        if (step - 1 > 0) {
                            set.add(step - 1);
                        }
                        set.add(step + 1);
                    }
                }
            }
            return false;
        }
    }
}

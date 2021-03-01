package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _575 {
    public static class Solution1 {
        public int distributeCandies(int[] candyType) {
            Set<Integer> map = new HashSet<>();
            for (int candy : candyType) {
                map.add(candy);
            }
            return Math.min(map.size(), candyType.length / 2);
        }
    }
}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1431 {
    public static class Solution1 {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = 0;
            for (int i : candies) {
                max = Math.max(max, i);
            }
            List<Boolean> result = new ArrayList<>();
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies >= max) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }
            return result;
        }
    }
}

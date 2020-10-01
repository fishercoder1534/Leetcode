package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _624 {

    public static class Solution1 {
        public int maxDistance(List<List<Integer>> arrays) {
            List<Integer> max = new ArrayList<>();
            for (List<Integer> array : arrays) {
                max.add(array.get(array.size() - 1));
            }
            Collections.sort(max);
            int ans = Integer.MIN_VALUE;
            for (List<Integer> array : arrays) {
                int big = array.get(array.size() - 1) == max.get(max.size() - 1) ? max.get(max.size() - 2) : max.get(max.size() - 1);
                ans = Math.max(ans, big - array.get(0));
            }
            return ans;
        }
    }
}

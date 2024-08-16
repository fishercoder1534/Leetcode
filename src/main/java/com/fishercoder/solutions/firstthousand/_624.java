package com.fishercoder.solutions.firstthousand;

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

    public static class Solution2 {
        public int maxDistance(List<List<Integer>> arrays) {
            int min = arrays.get(0).get(0);
            int max = arrays.get(0).get(arrays.get(0).size() - 1);
            int ans = 0;
            for (int i = 1; i < arrays.size(); i++) {
                List<Integer> curr = arrays.get(i);
                ans = Math.max(ans, Math.abs(max - curr.get(0)));
                ans = Math.max(ans, Math.abs(curr.get(curr.size() - 1) - min));
                max = Math.max(max, curr.get(curr.size() - 1));
                min = Math.min(min, curr.get(0));
            }
            return ans;
        }
    }
}

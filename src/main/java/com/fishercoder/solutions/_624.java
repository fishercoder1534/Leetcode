package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _624 {

    public static class Solution1 {
        public int maxDistance(int[][] arrays) {
            List<Integer> max = new ArrayList<>();
            for (int[] array : arrays) {
                max.add(array[array.length - 1]);
            }
            Collections.sort(max);
            int ans = Integer.MIN_VALUE;
            for (int[] array : arrays) {
                int big = array[array.length - 1] == max.get(max.size() - 1) ? max.get(max.size() - 2) : max.get(max.size() - 1);
                ans = Math.max(ans, big - array[0]);
            }
            return ans;
        }
    }
}

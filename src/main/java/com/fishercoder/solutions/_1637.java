package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class _1637 {
    public static class Solution1 {
        public int maxWidthOfVerticalArea(int[][] points) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int[] point : points) {
                treeSet.add(point[0]);
            }
            int ans = 0;
            List<Integer> list = new ArrayList<>();
            for (int x : treeSet) {
                list.add(x);
            }
            for (int i = 0; i < list.size() - 1; i++) {
                ans = Math.max(ans, list.get(i + 1) - list.get(i));
            }
            return ans;
        }
    }
}

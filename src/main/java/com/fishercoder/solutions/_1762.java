package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1762 {
    public static class Solution1 {
        public int[] findBuildings(int[] heights) {
            int len = heights.length;
            int tallestBuildingOnTheRight = heights[len - 1];
            List<Integer> list = new ArrayList<>();
            list.add(len - 1);
            for (int i = len - 2; i >= 0; i--) {
                if (heights[i] > tallestBuildingOnTheRight) {
                    list.add(0, i);
                    tallestBuildingOnTheRight = heights[i];
                }
            }
            int[] num = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                num[i] = list.get(i);
            }
            return num;
        }
    }
}

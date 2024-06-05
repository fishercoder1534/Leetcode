package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1762 {
    public static class Solution1 {
        public int[] findBuildings(int[] heights) {
            List<Integer> list = new ArrayList();
            int len = heights.length;
            int higher = heights[len - 1];
            list.add(len - 1);
            for (int i = len - 2; i >= 0; i--) {
                if (heights[i] > higher) {
                    higher = heights[i];
                    list.add(i);
                }
            }
            int[] res = new int[list.size()];
            for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
                res[j] = list.get(i);
            }
            return res;
        }
    }
}

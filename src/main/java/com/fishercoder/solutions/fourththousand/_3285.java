package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3285 {
    public static class Solution1 {
        public List<Integer> stableMountains(int[] height, int threshold) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 1; i < height.length; i++) {
                if (height[i - 1] > threshold) {
                    ans.add(i);
                }
            }
            return ans;
        }
    }
}

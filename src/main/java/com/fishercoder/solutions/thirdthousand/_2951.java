package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2951 {
    public static class Solution1 {
        public List<Integer> findPeaks(int[] mountain) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 1; i < mountain.length - 1; i++) {
                if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                    ans.add(i);
                }
            }
            return ans;
        }
    }
}

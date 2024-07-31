package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2899 {
    public static class Solution1 {
        public List<Integer> lastVisitedIntegers(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            List<Integer> seen = new ArrayList<>();
            int k = 1;
            for (int num : nums) {
                if (num != -1) {
                    seen.add(num);
                    k = 1;
                } else {
                    if (k <= seen.size()) {
                        ans.add(seen.get(seen.size() - k));
                    } else {
                        ans.add(-1);
                    }
                    k++;
                }
            }
            return ans;
        }
    }
}

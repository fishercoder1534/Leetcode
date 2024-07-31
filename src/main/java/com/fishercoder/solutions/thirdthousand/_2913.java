package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2913 {
    public static class Solution1 {
        public int sumCounts(List<Integer> nums) {
            int ans = 0;
            int subArraySize = 1;
            while (subArraySize <= nums.size()) {
                for (int i = 0; i < nums.size(); i++) {
                    Set<Integer> set = new HashSet<>();
                    set.add(nums.get(i));
                    int j = i + 1;
                    for (; j < Math.min(i + subArraySize, nums.size()); j++) {
                        set.add(nums.get(j));
                    }
                    if (j - i == subArraySize) {
                        ans += set.size() * set.size();
                    }
                }
                subArraySize++;
            }
            return ans;
        }
    }
}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _228 {

    public static class Solution1 {
        public List<String> summaryRanges(int[] nums) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                String start = String.valueOf(nums[i]);
                int tmpI = i;
                while ((i + 1) < nums.length && (nums[i] + 1) == nums[i + 1]) {
                    i++;
                }
                if (tmpI == i) {
                    result.add(start);
                } else {
                    result.add(start + "->" + String.valueOf(nums[i]));
                }
            }
            return result;
        }
    }

}

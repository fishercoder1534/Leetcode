package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _506 {

    public static class Solution1 {
        public String[] findRelativeRanks(int[] nums) {
            int[] tmp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                tmp[i] = nums[i];
            }
            Arrays.sort(tmp);
            Map<Integer, String> rankMap = new HashMap();
            int len = nums.length;
            for (int i = len - 1; i >= 0; i--) {
                if (i == len - 1) {
                    rankMap.put(tmp[i], "Gold Medal");
                } else if (i == len - 2) {
                    rankMap.put(tmp[i], "Silver Medal");
                } else if (i == len - 3) {
                    rankMap.put(tmp[i], "Bronze Medal");
                } else {
                    rankMap.put(tmp[i], String.valueOf(len - i));
                }
            }
            String[] result = new String[len];
            for (int i = 0; i < len; i++) {
                result[i] = rankMap.get(nums[i]);
            }
            return result;
        }
    }

}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2200 {
    public static class Solution1 {
        public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
            List<Integer> ans = new ArrayList<>();
            List<Integer> keyIndices = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == key) {
                    keyIndices.add(i);
                }
            }
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < keyIndices.size(); j++) {
                    if (Math.abs(i - keyIndices.get(j)) <= k) {
                        ans.add(i);
                        break;
                    }
                }
            }
            Collections.sort(ans);
            return ans;
        }
    }
}

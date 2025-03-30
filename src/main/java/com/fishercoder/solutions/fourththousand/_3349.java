package com.fishercoder.solutions.fourththousand;

import java.util.List;

public class _3349 {
    public static class Solution1 {
        public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
            for (int i = 0; i < nums.size(); i++) {
                int count = 1;
                int j = i;
                boolean possible = true;
                for (; j + 1 < nums.size() && count++ < k; j++) {
                    if (nums.get(j + 1) <= nums.get(j)) {
                        possible = false;
                        break;
                    }
                }
                boolean possibleAgain = true;
                j++;
                if (possible) {
                    count = 1;
                    for (; j + 1 < nums.size() && count++ < k; j++) {
                        if (nums.get(j + 1) <= nums.get(j)) {
                            possibleAgain = false;
                            break;
                        }
                    }
                    if (count < k) {
                        possibleAgain = false;
                    }
                    if (possibleAgain) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

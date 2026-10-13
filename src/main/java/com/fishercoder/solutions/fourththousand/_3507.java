package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3507 {
    public static class Solution1 {
        public int minimumPairRemoval(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            int ans = 0;
            while (!isNonDecreasing(list)) {
                int minSum = Integer.MAX_VALUE;
                int minIndex = -1;
                for (int i = 0; i < list.size() - 1; i++) {
                    int sum = list.get(i) + list.get(i + 1);
                    if (sum < minSum) {
                        minSum = sum;
                        minIndex = i;
                    }
                }
                list.set(minIndex, minSum);
                list.remove(minIndex + 1);
                ans++;
            }
            return ans;
        }

        private boolean isNonDecreasing(List<Integer> list) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) {
                    return false;
                }
            }
            return true;
        }

    }
}

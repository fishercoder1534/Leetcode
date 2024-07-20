package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _3224 {
    public static class Solution1 {
        /**
         * My completely original solution during the contest.
         */
        public int minChanges(int[] nums, int k) {
            //compute the frequency of each diff
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length / 2; i++) {
                int diff = Math.abs(nums[nums.length - i - 1] - nums[i]);
                map.put(diff, map.getOrDefault(diff, 0) + 1);
            }
            List<int[]> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                list.add(new int[]{entry.getKey(), entry.getValue()});
            }
            //sort them by their frequency
            Collections.sort(list, (a, b) -> b[1] - a[1]);
            List<int[]> modes = new ArrayList<>();
            modes.add(list.get(0));
            int i = 1;
            //in case there are ties (same frequency, different mode values)
            while (i < list.size() && list.get(i)[1] == list.get(0)[1]) {
                modes.add(list.get(i++));
            }
            //we'll take the second most frequent mode as well, otherwise, test case 4 won't pass
            if (i < list.size()) {
                modes.add(list.get(i));
            }
            int minChanges = nums.length;
            for (int[] mode : modes) {
                minChanges = Math.min(minChanges, computeChanges(mode[0], nums, k));
            }
            return minChanges;
        }

        private int computeChanges(int mode, int[] nums, int k) {
            int changes = 0;
            for (int i = 0; i < nums.length / 2; i++) {
                int diff = Math.abs(nums[nums.length - i - 1] - nums[i]);
                if (diff != mode) {
                    if (nums[nums.length - i - 1] > nums[i]) {
                        if (k - nums[i] >= mode || nums[nums.length - i - 1] >= mode) {
                            changes++;
                        } else {
                            changes += 2;
                        }
                    } else {
                        if (k - nums[nums.length - i - 1] >= mode || nums[i] >= mode) {
                            changes++;
                        } else {
                            changes += 2;
                        }
                    }
                }
            }
            return changes;
        }
    }
}

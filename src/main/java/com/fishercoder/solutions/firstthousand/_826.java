package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _826 {
    public static class Solution1 {
        public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
            List<int[]> jobs = new ArrayList<>();
            for (int i = 0; i < difficulty.length; i++) {
                jobs.add(new int[] {difficulty[i], profit[i]});
            }
            // sort by difficulty level
            Collections.sort(jobs, (a, b) -> a[0] - b[0]);

            // update the profit values: because a later (with more difficult) job must be able to
            // handle a prior job, so we take the more profitable one
            // this makes this jobs list in non-decreasing order in both dimensions
            for (int i = 0; i < jobs.size() - 1; i++) {
                jobs.get(i + 1)[1] = Math.max(jobs.get(i)[1], jobs.get(i + 1)[1]);
            }

            int maxProfit = 0;
            for (int ability : worker) {
                maxProfit += binarySearch(ability, jobs);
            }
            return maxProfit;
        }

        private int binarySearch(int ability, List<int[]> jobs) {
            int left = 0;
            int right = jobs.size() - 1;
            int maxProfit = 0;
            // it's important to use <= here so we don't miss a possible element
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (ability >= jobs.get(mid)[0]) {
                    maxProfit = Math.max(jobs.get(mid)[1], maxProfit);
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return maxProfit;
        }
    }
}

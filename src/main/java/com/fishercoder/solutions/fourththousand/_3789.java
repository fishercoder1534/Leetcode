package com.fishercoder.solutions.fourththousand;

public class _3789 {
    public static class Solution1 {
        /**
         * There are only three options to compare.
         * Credit: Gemini
         */
        public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
            long allBoth = (long) Math.max(need1, need2) * costBoth;
            long allIndividual = (long) need1 * cost1 + (long) need2 * cost2;
            int overlappingCount = Math.min(need1, need2);
            long overlappingIndividual = (long) overlappingCount * costBoth + (long) (need1 - overlappingCount) * cost1 + (long) (need2 - overlappingCount) * cost2;
            return Math.min(allBoth, Math.min(allIndividual, overlappingIndividual));
        }
    }
}

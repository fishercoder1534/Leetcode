package com.fishercoder.solutions;

public class _1774 {
    public static class Solution1 {
        int result = 0;

        public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
            result = baseCosts[0];
            for (int i = 0; i < baseCosts.length; i++) {
                recursion(baseCosts[i], toppingCosts, 0, target);
            }
            return result;
        }

        private void recursion(int currentCost, int[] toppingCosts, int index, int target) {
            if (Math.abs(currentCost - target) < Math.abs(result - target) || (Math.abs(currentCost - target) < Math.abs(result - target) && currentCost == result)) {
                result = currentCost;
            }
            if (index == toppingCosts.length || currentCost == target) {
                return;
            }
            recursion(currentCost, toppingCosts, index + 1, target);
            recursion(currentCost + toppingCosts[index], toppingCosts, index + 1, target);
            recursion(currentCost + toppingCosts[index] * 2, toppingCosts, index + 1, target);
        }
    }
}

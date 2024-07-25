package com.fishercoder.solutions.thirdthousand;

public class _2600 {
    public static class Solution1 {
        public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
            if (k <= numOnes) {
                return k;
            } else if (k <= (numOnes + numZeros)) {
                return numOnes;
            } else {
                k -= numOnes;
                k -= numZeros;
                if (k > 0) {
                    return numOnes - k;
                }
                return numOnes;
            }
        }
    }
}

package com.fishercoder.solutions;

public class _1570 {
    public static class Solution1 {
        /**This is a brute force but accepted solution.
         * More optimal solution:
         *  use a map to store only non-zero values and use the smaller vector to do multiplication to reduce space and save time.*/
        class SparseVector {
            int[] vector;

            SparseVector(int[] nums) {
                this.vector = nums;
            }

            // Return the dotProduct of two sparse vectors
            public int dotProduct(SparseVector vec) {
                int[] incoming = vec.vector;
                int dotProduct = 0;
                for (int i = 0; i < vector.length; i++) {
                    dotProduct += incoming[i] * this.vector[i];
                }
                return dotProduct;
            }
        }
    }
}

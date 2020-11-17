package com.fishercoder.solutions;

public class _1570 {
    public static class Solution1 {
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

package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1570 {
    public static class Solution1 {
        /*
         * This is a brute force but accepted solution.
         */
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

    public static class Solution2 {
        /*
         * More optimal solution:
         * 1. use a map to store only non-zero values to save space;
         * 2. loop through the smaller list;
         * 3. use binary search to find the corresponding index in the bigger list if it exists;
         */
        class SparseVector {
            private List<int[]> indexAndNumList;

            SparseVector(int[] nums) {
                this.indexAndNumList = new ArrayList<>();
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        this.indexAndNumList.add(new int[] {i, nums[i]});
                    }
                }
            }

            // Return the dotProduct of two sparse vectors
            public int dotProduct(SparseVector vec) {
                List<int[]> incoming = vec.indexAndNumList;
                if (incoming.size() < this.indexAndNumList.size()) {
                    return dotProduct(incoming, this.indexAndNumList);
                } else {
                    return dotProduct(this.indexAndNumList, incoming);
                }
            }

            private int dotProduct(List<int[]> smaller, List<int[]> bigger) {
                int product = 0;
                for (int[] indexAndNum : smaller) {
                    int[] exists = binarySearch(bigger, indexAndNum[0]);
                    if (indexAndNum[0] == exists[0]) {
                        product += indexAndNum[1] * exists[1];
                    }
                }
                return product;
            }

            private int[] binarySearch(List<int[]> indexAndNumList, int target) {
                int left = 0;
                int right = indexAndNumList.size() - 1;
                int[] result = new int[] {-1, 0};
                if (indexAndNumList.get(right)[0] < target
                        || indexAndNumList.get(left)[0] > target) {
                    return result;
                }
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (indexAndNumList.get(mid)[0] == target) {
                        return indexAndNumList.get(mid);
                    } else if (indexAndNumList.get(mid)[0] > target) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                return new int[] {-1, 0};
            }
        }
    }
}

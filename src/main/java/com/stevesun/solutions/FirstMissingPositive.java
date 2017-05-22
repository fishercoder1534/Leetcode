package com.stevesun.solutions;

/**
 * Given an unsorted integer array, find the first missing positive integer.

 For example,
 Given [1,2,0] return 3,
 and [3,4,-1,1] return 2.

 Your algorithm should run in O(n) time and uses constant space.

 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] > 0 && A[i] != i + 1 && A[i] - 1 < A.length
                    && A[i] != A[A[i] - 1]) {
                swap(A, i, A[i] - 1);
            } else {
                i++;
            }
        }
        for (int j = 0; j < A.length; j++) {
            if (A[j] != j + 1) {
                return j + 1;
            }
        }
        return A.length + 1;// if all values are in the correct position, then
        // we return the last one + 1
    }

    public void swap(int[] A, int i, int j) {// i and j are indices in array A
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}

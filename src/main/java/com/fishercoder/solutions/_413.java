package com.fishercoder.solutions;

/**
 * 413. Arithmetic Slices
 *
 * A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

 For example, these are arithmetic sequence:

 1, 3, 5, 7, 9
 7, 7, 7, 7
 3, -1, -5, -9

 The following sequence is not arithmetic.

 1, 1, 2, 5, 7

 A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

 A slice (P, Q) of array A is called arithmetic if the sequence:
 A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

 The function should return the number of arithmetic slices in the array A.

 Example:

 A = [1, 2, 3, 4]

 return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
 */
public class _413 {

    public static class Solution1 {
        //credit: https://discuss.leetcode.com/topic/62884/2ms-java-o-n-time-o-1-space-solution
        public int numberOfArithmeticSlices(int[] A) {
            int sum = 0;
            int len = 2;
            for (int i = 2; i < A.length; i++) {
                if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                    len++;
                } else {
                    if (len > 2) {
                        sum += calculateSlices(len);
                    }
                    len = 2;//reset it to 2
                }
            }
            if (len > 2) {
                sum += calculateSlices(len);
            }
            return sum;
        }

        int calculateSlices(int len) {
            return (len - 1) * (len - 2) / 2;
        }
    }

    class Solution2 {
        //credit: https://discuss.leetcode.com/topic/63302/simple-java-solution-9-lines-2ms
        public int numberOfArithmeticSlices(int[] A) {
            int sum = 0;
            int curr = 0;
            for (int i = 2; i < A.length; i++) {
                if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                    curr++;
                    sum += curr;
                } else {
                    curr = 0;
                }
            }
            return sum;
        }
    }

}

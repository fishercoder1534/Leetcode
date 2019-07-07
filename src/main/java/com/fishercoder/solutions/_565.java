package com.fishercoder.solutions;

/**
 * 565. Array Nesting
 *
 A zero-indexed array A consisting of N different integers is given. The array contains all integers in the range [0, N - 1].

 Sets S[K] for 0 <= K < N are defined as follows:

 S[K] = { A[K], A[A[K]], A[A[A[K]]], ... }.

 Sets S[K] are finite for each K and should NOT contain duplicates.

 Write a function that given an array A consisting of N integers, return the size of the largest set S[K] for this array.

 Example 1:
 Input: A = [5,4,0,3,1,6,2]
 Output: 4
 Explanation:
 A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.

 One of the longest S[K]:
 S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 Note:
 N is an integer within the range [1, 20,000].
 The elements of A are all distinct.
 Each element of array A is an integer within the range [0, N-1].
 */
public class _565 {

    public static class Solution1 {
        public int arrayNesting(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            boolean[] visited = new boolean[nums.length];
            int answer = 0;
            for (int i : nums) {
                int count = 0;
                int j = i;
                while (j >= 0 && j < nums.length && !visited[j]) {
                    count++;
                    visited[j] = true;
                    j = nums[j];
                }
                answer = Math.max(answer, count);
            }
            return answer;
        }
    }

}

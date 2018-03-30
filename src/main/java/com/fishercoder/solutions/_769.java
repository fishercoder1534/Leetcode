package com.fishercoder.solutions;

/**
 * 769. Max Chunks To Make Sorted

 Given an array arr that is a permutation of [0, 1, ..., arr.length - 1], we split the array into some number of "chunks" (partitions), and individually sort each chunk.
 After concatenating them, the result equals the sorted array.

 What is the most number of chunks we could have made?

 Example 1:

 Input: arr = [4,3,2,1,0]
 Output: 1
 Explanation:
 Splitting into two or more chunks will not return the required result.
 For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.

 Example 2:

 Input: arr = [1,0,2,3,4]
 Output: 4
 Explanation:
 We can split into two chunks, such as [1, 0], [2, 3, 4].
 However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.

 Note:

 arr will have length in range [1, 10].
 arr[i] will be a permutation of [0, 1, ..., arr.length - 1].

 */
public class _769 {
  public static class Solution1 {
    /**credit: https://leetcode.com/problems/max-chunks-to-make-sorted/discuss/113520/Java-solution-left-max-and-right-min.*/
    public int maxChunksToSorted(int[] arr) {
      int len = arr.length;

      int[] maxOfLeft = new int[len];
      maxOfLeft[0] = arr[0];
      for (int i = 1; i < len; i++) {
        maxOfLeft[i] = Math.max(arr[i], maxOfLeft[i - 1]);
      }

      int[] minOfRight = new int[len];
      minOfRight[len - 1] = arr[len - 1];
      for (int i = len - 2; i >= 0; i--) {
        minOfRight[i] = Math.min(minOfRight[i + 1], arr[i]);
      }

      int result = 0;
      for (int i = 0; i < len - 1; i++) {
        if (maxOfLeft[i] <= minOfRight[i + 1]) {
          result++;
        }
      }
      return result + 1;
    }
  }

  public static class Solution2 {
    /**credit: https://leetcode.com/articles/max-chunks-to-make-sorted-i/*/
    public int maxChunksToSorted(int[] arr) {
      int ans = 0;
      int max = 0;
      for (int i = 0; i < arr.length; ++i) {
        max = Math.max(max, arr[i]);
        if (max == i) {
          ans++;
        }
      }
      return ans;
    }
  }
}

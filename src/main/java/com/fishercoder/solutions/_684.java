package com.fishercoder.solutions;

/**
 * 684. Redundant Connection
 *
 *  We are given a "tree" in the form of a 2D-array, with distinct values for each node.
 *  In the given 2D-array, each element pair [u, v] represents that v is a child of u in the tree.
 *  We can remove exactly one redundant pair in this "tree" to make the result a (rooted) tree.
 *  You need to find and output such a pair. If there are multiple answers for this question, output the one appearing last in the 2D-array. There is always at least one answer.

 Example 1:
 Input: [[1,2], [1,3], [2,3]]
 Output: [2,3]
 Explanation: Original tree will be like this:
   1
  / \
 2 - 3


 Example 2:
 Input: [[1,2], [1,3], [3,1]]
 Output: [3,1]
 Explanation: Original tree will be like this:
   1
  / \\
 2   3

 Note:
 The size of the input 2D-array will be between 1 and 1000.
 Every integer represented in the 2D-array will be between 1 and 2000.
 */
public class _684 {

    public int[] findRedundantConnection(int[][] edges) {
        int[] result = new int[]{};
        return result;
    }

}

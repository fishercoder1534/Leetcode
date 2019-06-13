package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 530. Minimum Absolute Difference in BST
 *
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

 Example:

 Input:

  1
   \
   3
  /
 2

 Output:
 1

 Explanation:
 The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 Note: There are at least two nodes in this BST.
 */
public class _530 {

    public static class Solution1 {
        public int getMinimumDifference(TreeNode root) {
            TreeSet<Integer> treeset = new TreeSet<>();
            treeset.add(root.val);
            dfs(root, treeset);
            int diff = Integer.MAX_VALUE;
            Iterator<Integer> iterator = treeset.iterator();
            int prev = iterator.next();
            while (iterator.hasNext()) {
                int current = iterator.next();
                diff = Math.min(diff, Math.abs(current - prev));
                prev = current;
            }
            return diff;
        }

        private void dfs(TreeNode root, TreeSet<Integer> treeset) {
            if (root.left != null) {
                treeset.add(root.left.val);
                dfs(root.left, treeset);
            }
            if (root.right != null) {
                treeset.add(root.right.val);
                dfs(root.right, treeset);
            }
        }
    }
}

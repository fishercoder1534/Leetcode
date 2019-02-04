package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 366. Find Leaves of Binary Tree
 *
 * Given a binary tree, collect a tree's nodes as if you were doing this:
 * Collect and remove all leaves, repeat until the tree is empty.

 Example:
 Given binary tree
     1
    / \
   2   3
  / \
 4  5
 Returns [4, 5, 3], [2], [1].

 Explanation:
 1. Removing the leaves [4, 5, 3] would result in this tree:

   1
  /
 2
 2. Now removing the leaf [2] would result in this tree:

 1
 3. Now removing the leaf [1] would result in the empty tree:

 []
 Returns [4, 5, 3], [2], [1].

 */
public class _366 {

    public static class Solution1 {
        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> findLeaves(TreeNode root) {
            dfs(root);
            return result;
        }

        int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int level = Math.max(dfs(root.left), dfs(root.right)) + 1;
            if (result.size() < level) {
                result.add(new ArrayList<>());
            }
            result.get(level - 1).add(root.val);
            return level;
        }
    }
}

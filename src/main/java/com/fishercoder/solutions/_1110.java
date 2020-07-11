package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.TreeUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * 1110. Delete Nodes And Return Forest
 *
 * Given the root of a binary tree, each node in the tree has a distinct value.
 * After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
 * Return the roots of the trees in the remaining forest.  You may return the result in any order.
 *
 * Example 1:
 * Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
 * Output: [[1,2,null,4],[6],[7]]
 *
 * Constraints:
 * The number of nodes in the given tree is at most 1000.
 * Each node has a distinct value between 1 and 1000.
 * to_delete.length <= 1000
 * to_delete contains distinct values between 1 and 1000.
 * */
public class _1110 {
    public static class Solution1 {
        public List<TreeNode> delNodes(TreeNode root, int[] toDelete) {
            List<TreeNode> result = new ArrayList<>();
            result.add(root);
            for (int i = 0; i < toDelete.length; i++) {
                List<TreeNode> newResult = new ArrayList<>();
                for (int j = 0; j < result.size(); j++) {
                    List<TreeNode> newResultAfterDeletingThisNode = new ArrayList<>();
                    if (dfs(result.get(j), toDelete[i], newResultAfterDeletingThisNode)) {
                        newResult.addAll(newResultAfterDeletingThisNode);
                    } else {
                        newResult.add(result.get(j));
                    }
                }
                result = newResult;
            }
            return result;
        }

        private boolean dfs(TreeNode root, int delete, List<TreeNode> result) {
            if (root == null) {
                return false;
            }
            if (root.val == delete) {
                if (root.left != null) {
                    result.add(root.left);
                }
                if (root.right != null) {
                    result.add(root.right);
                }
                return true;
            }
            boolean left = dfs(root.left, delete, result);
            if (left) {
                if (root.left != null && root.left.val == delete) {
                    root.left = null;
                    result.add(root);
                }
                return true;
            }
            boolean right = dfs(root.right, delete, result);
            if (right) {
                if (root.right != null && root.right.val == delete) {
                    root.right = null;
                    result.add(root);
                }
                return true;
            }
            return false;
        }
    }
}

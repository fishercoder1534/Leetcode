package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**257. Binary Tree Paths
 *
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
*/

public class _257 {
    public static class Solution1 {
        //a very typical/good question to test your recursion/dfs understanding.
        public List<String> binaryTreePaths_more_concise(TreeNode root) {
            List<String> paths = new ArrayList<String>();
            if (root == null) {
                return paths;
            }
            dfs(root, paths, "");
            return paths;
        }

        private void dfs(TreeNode root, List<String> paths, String path) {
            if (root.left == null && root.right == null) {
                paths.add(path + root.val);
                return;
            }
            path += root.val + "->";
            if (root.left != null) {
                dfs(root.left, paths, path);
            }
            if (root.right != null) {
                dfs(root.right, paths, path);
            }
        }
    }
    
    public static class Solution2 {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> paths = new ArrayList<String>();
            dfs(root, paths, new StringBuilder());
            return paths;
        }

        private void dfs(TreeNode root, List<String> paths, StringBuilder sb) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                sb.append(root.val);
                paths.add(sb.toString());
                return;
            }
            sb.append(root.val + "->");
            String curr = sb.toString();
            if (root.left != null) {
                dfs(root.left, paths, sb);
            }
            sb.setLength(0);
            sb.append(curr);
            if (root.right != null) {
                dfs(root.right, paths, sb);
            }
        }
    }
}

package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.Notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 653. Two Sum IV - Input is a BST
 *
 * Given a Binary Search Tree and a target number,
 * return true if there exist two elements in the BST such that their sum is equal to the given target.

 Example 1:
 Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9
Output: True

Example 2:
Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28
Output: False

 */
public class _653 {

    public static class ListSolution {
        public boolean findTarget(TreeNode root, int k) {
            if (root == null) {
                return false;
            }
            List<Integer> list = new ArrayList<>();
            dfs(root, list);
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) + list.get(j) == k) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void dfs(TreeNode root, List<Integer> list) {
            list.add(root.val);
            if (root.left != null) {
                dfs(root.left, list);
            }
            if (root.right != null) {
                dfs(root.right, list);
            }
        }
    }

    @Notes(todo = "This solution fails by _653Test.test6(), need to fix it.")
    public static class MapSolution {
        public boolean findTarget(TreeNode root, int k) {
            if (root == null) {
                return false;
            }
            Map<Integer, Integer> map = new HashMap();//value is index
            int index = 0;
            preorder(root, map, index);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (map.containsKey(k - entry.getKey()) && map.get(k - entry.getKey()) != entry.getValue()) {
                    return true;
                }
            }
            return false;
        }

        private void preorder(TreeNode root, Map<Integer, Integer> map, int index) {
            if (root == null) {
                return;
            }
            map.put(root.val, index++);
            if (root.left != null) {
                preorder(root.left, map, ++index);
            }
            if (root.right != null) {
                preorder(root.right, map, ++index);
            }
        }

    }
}

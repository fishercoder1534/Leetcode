package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1367. Linked List in Binary Tree
 *
 * Given a binary tree root and a linked list with head as the first node.
 * Return True if all the elements in the linked list starting from the head correspond to some downward path
 * connected in the binary tree otherwise return False.
 * In this context downward path means a path that starts at some node and goes downwards.
 *
 * Example 1:
 * Input: head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: true
 * Explanation: Nodes in blue form a subpath in the binary Tree.
 *
 * Example 2:
 * Input: head = [1,4,2,6], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: true
 *
 * Example 3:
 * Input: head = [1,4,2,6,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: false
 * Explanation: There is no path in the binary tree that contains all the elements of the linked list from head.
 *
 * Constraints:
 * 1 <= node.val <= 100 for each node in the linked list and binary tree.
 * The given linked list will contain between 1 and 100 nodes.
 * The given binary tree will contain between 1 and 2500 nodes.
 * */
public class _1367 {
    public static class Solution1 {
        List<List<Integer>> paths = new ArrayList<>();

        public boolean isSubPath(ListNode head, TreeNode root) {
            List<Integer> list = getList(head);
            findAllPaths(root, new ArrayList<>());
            for (List<Integer> path : paths) {
                if (path.size() >= list.size()) {
                    if (find(list, path)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean find(List<Integer> list, List<Integer> path) {
            int i = 0;
            int j = 0;
            for (; i <= path.size() - list.size(); i++) {
                j = 0;
                int tmpI = i;
                while (j < list.size() && tmpI < path.size() && list.get(j) == path.get(tmpI)) {
                    tmpI++;
                    j++;
                }
                if (j >= list.size()) {
                    return true;
                }
            }
            return j >= list.size();
        }

        private void findAllPaths(TreeNode root, List<Integer> path) {
            if (root == null) {
                return;
            }
            path.add(root.val);
            if (root.left == null && root.right == null) {
                paths.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
                return;
            }
            findAllPaths(root.left, path);
            findAllPaths(root.right, path);
            path.remove(path.size() - 1);
        }

        private List<Integer> getList(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            return list;
        }
    }
}

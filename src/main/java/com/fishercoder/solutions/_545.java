package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _545 {
    public static class Solution1 {
        public List<Integer> boundaryOfBinaryTree(TreeNode root) {
            List<Integer> nodes = new ArrayList<>();
            if (root == null) {
                return nodes;
            }

            nodes.add(root.val);
            leftBoundary(root.left, nodes);
            addLeaves(root.left, nodes);
            addLeaves(root.right, nodes);
            rightBoundary(root.right, nodes);
            return nodes;
        }

        public void leftBoundary(TreeNode root, List<Integer> nodes) {
            if (root == null || (root.left == null && root.right == null)) {
                /**we don't want to add any LEAVES in leftBoundary and rightBoundary functions either,
                 * that's why we have the later condition in the if branch.*/
                return;
            }
            nodes.add(root.val);// add BEFORE child visit
            if (root.left == null) {
                leftBoundary(root.right, nodes);
            } else {
                leftBoundary(root.left, nodes);
            }
        }

        public void rightBoundary(TreeNode root, List<Integer> nodes) {
            if (root == null || (root.right == null && root.left == null)) {
                return;
            }
            if (root.right == null) {
                rightBoundary(root.left, nodes);
            } else {
                rightBoundary(root.right, nodes);
            }
            nodes.add(root.val); // add AFTER child visit(reverse)
        }

        public void addLeaves(TreeNode root, List<Integer> nodes) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                nodes.add(root.val);
                return;
            }
            addLeaves(root.left, nodes);
            addLeaves(root.right, nodes);
        }
    }

}

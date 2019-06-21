package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 545. Boundary of Binary Tree
 *
 * Given a binary tree, return the values of its boundary in anti-clockwise direction starting from root.
 * Boundary includes left boundary, addLeaves, and right boundary in order without duplicate nodes.
 * Left boundary is defined as the path from root to the left-most node.
 * Right boundary is defined as the path from root to the right-most node.
 * If the root doesn't have left subtree or right subtree,
 * then the root itself is left boundary or right boundary.
 * Note this definition only applies to the input binary tree, and not applies to any subtrees.
 * The left-most node is defined as a leaf node you could reach when you always firstly travel
 * to the left subtree if exists. If not, travel to the right subtree.
 * Repeat until you reach a leaf node.
 * The right-most node is also defined by the same way with left and right exchanged.

 Example 1
 Input:
  1
   \
   2
  / \
 3   4

 Ouput:
 [1, 3, 4, 2]

 Explanation:
 The root doesn't have left subtree, so the root itself is left boundary.
 The addLeaves are node 3 and 4.
 The right boundary are node 1,2,4. Note the anti-clockwise direction means you should output reversed right boundary.
 So order them in anti-clockwise without duplicates and we have [1,3,4,2].


 Example 2
 Input:
    ____1_____
   /          \
  2           3
 / \          /
4   5        6
   / \      / \
  7  8     9  10

 Ouput:
 [1,2,4,7,8,9,10,6,3]

 Explanation:
 The left boundary are node 1,2,4. (4 is the left-most node according to definition)
 The addLeaves are node 4,7,8,9,10.
 The right boundary are node 1,3,6,10. (10 is the right-most node).
 So order them in anti-clockwise without duplicate nodes we have [1,2,4,7,8,9,10,6,3].

 */
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

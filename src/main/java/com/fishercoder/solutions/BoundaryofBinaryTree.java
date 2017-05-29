package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a binary tree, return the values of its boundary in anti-clockwise direction starting from root. Boundary includes left boundary, leaves, and right boundary in order without duplicate nodes.

 Left boundary is defined as the path from root to the left-most node. Right boundary is defined as the path from root to the right-most node. If the root doesn't have left subtree or right subtree, then the root itself is left boundary or right boundary. Note this definition only applies to the input binary tree, and not applies to any subtrees.

 The left-most node is defined as a leaf node you could reach when you always firstly travel to the left subtree if exists. If not, travel to the right subtree. Repeat until you reach a leaf node.

 The right-most node is also defined by the same way with left and right exchanged.

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
 The leaves are node 3 and 4.
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
 The leaves are node 4,7,8,9,10.
 The right boundary are node 1,3,6,10. (10 is the right-most node).
 So order them in anti-clockwise without duplicate nodes we have [1,2,4,7,8,9,10,6,3].

 */
public class BoundaryofBinaryTree {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> nodes = new ArrayList<>(1000);
        if(root == null) return nodes;

        nodes.add(root.val);
        leftBoundary(root.left, nodes);
        leaves(root.left, nodes);
        leaves(root.right, nodes);
        rightBoundary(root.right, nodes);
        return nodes;
    }
    public void leftBoundary(TreeNode root, List<Integer> nodes) {
        if(root == null || (root.left == null && root.right == null)) return;
        nodes.add(root.val);
        if(root.left == null) leftBoundary(root.right, nodes);
        else leftBoundary(root.left, nodes);
    }
    public void rightBoundary(TreeNode root, List<Integer> nodes) {
        if(root == null || (root.right == null && root.left == null)) return;
        if(root.right == null)rightBoundary(root.left, nodes);
        else rightBoundary(root.right, nodes);
        nodes.add(root.val); // add after child visit(reverse)
    }
    public void leaves(TreeNode root, List<Integer> nodes) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            nodes.add(root.val);
            return;
        }
        leaves(root.left, nodes);
        leaves(root.right, nodes);
    }


    //assume the tree has no duplicate values
    public List<Integer> boundaryOfBinaryTree_failed_attempt(TreeNode root) {
        //this my original naive attemp failed by 79/117 test cases, specifically by {@link BoundaryofBinaryTreeTest.test5}.
        List<Integer> leftBoundary = new ArrayList<>();
        leftBoundary = findLeftBoundary(root, leftBoundary);
        List<Integer> leaves = new ArrayList<>();
        leaves = findLeaves(root, leaves);
        List<Integer> rightBoundary = new ArrayList<>();
        rightBoundary = findRightBoundary(root, rightBoundary);
        List<Integer> boundary = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < leftBoundary.size(); i++) {
            boundary.add(leftBoundary.get(i));
            set.add(leftBoundary.get(i));
        }
        for (int i = 0; i < leaves.size(); i++) {
            if (!set.add(leaves.get(i))) continue;
            boundary.add(leaves.get(i));
        }
        for (int i = rightBoundary.size()-1; i >= 0; i--) {
            if (!set.add(rightBoundary.get(i))) continue;
            boundary.add(rightBoundary.get(i));
        }
        return boundary;
    }

    private List<Integer> findRightBoundary(TreeNode root, List<Integer> rightBoundary) {
        if (root == null) return rightBoundary;
        if (root.right != null) {
            rightBoundary.add(root.right.val);
            findRightBoundary(root.right, rightBoundary);
        } else if (root.left != null) {
            rightBoundary.add(root.left.val);
            findRightBoundary(root.left, rightBoundary);
        } else if (root.left == null && root.right == null) {
            return rightBoundary;
        }
        return rightBoundary;
    }

    private List<Integer> findLeaves(TreeNode root, List<Integer> leaves) {
        if (root == null) return leaves;
        if (root.left != null) {
            findLeaves(root.left, leaves);
        }
        if (root.right != null) {
            findLeaves(root.right, leaves);
        }
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        }
        return leaves;
    }

    private List<Integer> findLeftBoundary(TreeNode root, List<Integer> leftBoundary) {
        if (root == null) {
            return leftBoundary;
        }
        if (root != null) {
            leftBoundary.add(root.val);
            findLeftBoundary(root.left, leftBoundary);
        }
        return leftBoundary;
    }

}

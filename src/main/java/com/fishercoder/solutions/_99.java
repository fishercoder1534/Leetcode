package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
/**
 * 99. Recover Binary Search Tree
 *
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * Recover the tree without changing its structure.

 Example 1:

 Input: [1,3,null,null,2]

    1
   /
  3
  \
  2

 Output: [3,1,null,null,2]

   3
  /
 1
  \
  2
 Example 2:

 Input: [3,1,4,null,null,2]

    3
   / \
  1   4
 /
2

 Output: [2,1,4,null,null,3]

    2
   / \
  1   4
 /
3

 Follow up:
 A solution using O(n) space is pretty straight forward.
 Could you devise a constant space solution?
 */

public class _99 {
  public static class Solution1 {
    TreeNode firstElement = null;
    TreeNode secondElement = null;

    TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
      traverseTree(root);

      //swap the two elements
      int temp = firstElement.val;
      firstElement.val = secondElement.val;
      secondElement.val = temp;
    }

    private void traverseTree(TreeNode root) {
      if (root == null) {
        return;
      }

      traverseTree(root.left);

      //prevElement means the one previous to the current root, refer to in-order traversal, previous element must be smaller than the current root
      //if it's bigger, then we find the first element, thus we store it in the variable called firstElement
      if (firstElement == null && prevElement.val >= root.val) {
        firstElement = prevElement;
      }

      if (firstElement != null && prevElement.val >= root.val) {
        secondElement = root;
      }

      //this is the last step in the "do some business logic", so we'll always to have update the previous node to be the current root before it traverses the right subtree
      //since the current root will be the new previous node for the right subtree.
      prevElement = root;

      traverseTree(root.right);
    }

  }
}

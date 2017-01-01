package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

/**
 * Given a binary tree, flatten it to a linked list in-place.

 For example,
 Given

   1
  / \
 2  5
/ \  \
3 4  6
 The flattened tree should look like:
  1
   \
   2
    \
    3
     \
     4
      \
      5
       \
       6

 Hints:
 If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order traversal.
 */
public class FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                TreeNode previousNode = root.left;
                while (previousNode.right != null) {
                    previousNode = previousNode.right;
                }
                previousNode.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }

}

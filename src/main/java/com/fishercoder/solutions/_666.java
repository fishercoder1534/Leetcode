package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 666. Path Sum IV
 * If the depth of a tree is smaller than 5, then this tree can be represented by a list of three-digits integers.

 For each integer in this list:

 The hundreds digit represents the depth D of this node, 1 <= D <= 4.

 The tens digit represents the position P of this node in the level it belongs to, 1 <= P <= 8.
 The position is the same as that in a full binary tree.

 The units digit represents the value V of this node, 0 <= V <= 9.

 Given a list of ascending three-digits integers representing a binary with the depth smaller than 5.
 You need to return the sum of all paths from the root towards the leaves.

 Example 1:

 Input: [113, 215, 221]
 Output: 12
 Explanation:
 The tree that the list represents is:
   3
  / \
 5   1

 The path sum is (3 + 5) + (3 + 1) = 12.

 Example 2:

 Input: [113, 221]
 Output: 4
 Explanation:
 The tree that the list represents is:
 3
  \
  1

 The path sum is (3 + 1) = 4.

 */
public class _666 {
    public static class Solution1 {
        /**OMG, since it's no larger than depth 5, I've got a hardcoded solution here....
         * By "harcoded", I mean the constructTree() method.*/
        public int totalSum = 0;

        public int pathSum(int[] nums) {
            TreeNode root = constructTree(nums);
            if (root == null) {
                return 0;
            }
            computePathSum(root, 0);
            return totalSum;
        }

        private void computePathSum(TreeNode root, int pathSum) {
            pathSum += root.val;
            if (root.left != null) {
                computePathSum(root.left, pathSum);
            }
            if (root.right != null) {
                computePathSum(root.right, pathSum);
            }
            if (root.left == null && root.right == null) {
                totalSum += pathSum;
            }
//            pathSum -= root.val;
            /**this line is not necessary as I'm passing pathSum as a local variable around, so it's always updated
             it's AC'ed with or without this line*/
        }

        private TreeNode constructTree(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(Integer.toString(nums[0]).substring(2, 3)));
            //depth 2
            for (int i = 1; i < nums.length; i++) {
                if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 2 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 1) {
                    root.left = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 2 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 2) {
                    root.right = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                }
            }

            //depth 3
            for (int i = 2; i < nums.length; i++) {
                if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 3 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 1) {
                    root.left.left = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 3 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 2) {
                    root.left.right = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 3 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 3) {
                    root.right.left = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 3 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 4) {
                    root.right.right = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                }
            }

            //depth 4
            for (int i = 3; i < nums.length; i++) {
                if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 4 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 1) {
                    root.left.left.left = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 4 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 2) {
                    root.left.left.right = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 4 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 3) {
                    root.left.right.left = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 4 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 4) {
                    root.left.right.right = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 4 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 5) {
                    root.right.left.left = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 4 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 6) {
                    root.right.left.right = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 4 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 7) {
                    root.right.right.left = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                } else if (Integer.parseInt(Integer.toString(nums[i]).substring(0, 1)) == 4 && Integer.parseInt(Integer.toString(nums[i]).substring(1, 2)) == 8) {
                    root.right.right.right = new TreeNode(Integer.parseInt(Integer.toString(nums[i]).substring(2, 3)));
                }
            }

            return root;
        }
    }
}

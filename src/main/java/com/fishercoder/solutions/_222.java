package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _222 {

    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/21317/accepted-easy-understand-java-solution/2
         */
        public int countNodes(TreeNode root) {
            int leftH = getLeftHeight(root);
            int rightH = getRightHeight(root);
            if (leftH == rightH) {
                return (1 << leftH) - 1;
            } else {
                return 1 + countNodes(root.left) + countNodes(root.right);
            }
        }

        private int getRightHeight(TreeNode root) {
            int height = 0;
            while (root != null) {
                root = root.right;
                height++;
            }
            return height;
        }

        private int getLeftHeight(TreeNode root) {
            int height = 0;
            while (root != null) {
                root = root.left;
                height++;
            }
            return height;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/count-complete-tree-nodes/solution/
         */
        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int depth = getDepth(root);
            if (depth == 0) {
                return 1;
            }
            int left = 0;
            int right = (int) Math.pow(2, depth) - 1;
            //here the condition needs to be not bigger than right, instead of the typical strictly smaller than right.
            while (left <= right) {
                int mid = left + (right - left) / 2;
                //this is to suppose the elements on the last level are numbered from 1 to Math.pow(2, d) - 1, we are using
                //binary search here to find the right-most number
                if (exists(root, mid, depth)) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            //number of all nodes equals all nodes in the previous level + all the nodes on the last level indicated by variable "left"
            return (int) Math.pow(2, depth) - 1 + left;
        }

        private boolean exists(TreeNode root, int target, int depth) {
            /**An example complete tree in this algorithm:
             *         1
             *        /  \
             *       2    3
             *      / \  /
             *     1  2  3     (we use 1, 2, 3 at this level to indicate how this program runs instead of 4, 5, 6)
             *
             *     first, target is 1, we found 1 <= 1 (root), so we go to root.left, after going down to the last level (depth),
             *     we found this target exists: node != null, we return true from this function
             * */
            int left = 0;
            int right = (int) Math.pow(2, depth) - 1;
            for (int i = 0; i < depth; i++) {
                int mid = left + (right - left) / 2;
                if (target <= mid) {
                    root = root.left;
                    right = mid;
                } else {
                    root = root.right;
                    left = mid + 1;
                }
            }
            return root != null;
        }

        private int getDepth(TreeNode root) {
            int depth = 0;
            while (root.left != null) {
                root = root.left;
                depth++;
            }
            return depth;
        }
    }

}

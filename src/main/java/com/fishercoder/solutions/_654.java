package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _654 {

    public static class Solution1 {
        /**
         * Completely my original solution:
         * <p>
         * As the problem states, I always broke the array into two halves and make notes
         * of current max node, then in the recursive call, we can recursively search
         * from its left part to construct its left subtree and its right part to construct its
         * right subtree.
         */
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    maxIndex = i;
                }
            }
            TreeNode root = new TreeNode(max);
            return constructMaxTree(root, maxIndex, nums, 0, nums.length - 1);
        }

        private TreeNode constructMaxTree(TreeNode root, int rootIndex, int[] nums, int start, int end) {
            if (rootIndex > start) {
                int max = Integer.MIN_VALUE;
                int maxIndex = -1;
                for (int i = start; i < rootIndex; i++) {
                    if (max < nums[i]) {
                        max = nums[i];
                        maxIndex = i;
                    }
                }
                root.left = constructMaxTree(new TreeNode(max), maxIndex, nums, start, rootIndex - 1);
            }
            if (rootIndex < end) {
                int max = Integer.MIN_VALUE;
                int maxIndex = -1;
                for (int i = rootIndex + 1; i <= end; i++) {
                    if (max < nums[i]) {
                        max = nums[i];
                        maxIndex = i;
                    }
                }
                root.right = constructMaxTree(new TreeNode(max), maxIndex, nums, rootIndex + 1, end);
            }
            return root;
        }
    }

    public static class Solution2 {
        /**
         * Completely my original solution as well, but more concise.
         */
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            return construct(nums, 0, nums.length - 1);
        }

        TreeNode construct(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }
            int[] maxArray = findMax(nums, start, end);
            TreeNode root = new TreeNode(maxArray[0]);
            root.left = construct(nums, start, maxArray[1] - 1);
            root.right = construct(nums, maxArray[1] + 1, end);
            return root;
        }

        int[] findMax(int[] nums, int start, int end) {
            int max = nums[start];
            int maxIndex = start;
            for (int i = start + 1; i <= end; i++) {
                if (max < nums[i]) {
                    maxIndex = i;
                    max = nums[i];
                }
            }
            return new int[]{max, maxIndex};
        }
    }
}

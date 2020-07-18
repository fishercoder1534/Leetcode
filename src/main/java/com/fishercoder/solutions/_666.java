package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class _666 {
    public static class Solution1 {
        /**
         * OMG, since it's no larger than depth 5, I've got a hardcoded solution here....
         * By "harcoded", I mean the constructTree() method.
         */
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

    public static class Solution2 {
        public int totalSum = 0;

        public int pathSum(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int key = nums[i] / 10;
                int value = nums[i] % 10;
                map.put(key, value);
            }
            dfs(nums[0] / 10, 0, map);
            return totalSum;
        }

        private void dfs(int node, int preSum, Map<Integer, Integer> map) {
            int level = node / 10;
            int pos = node % 10;
            int leftChild = (level + 1) * 10 + pos * 2 - 1;
            int rightChild = (level + 1) * 10 + pos * 2;
            int currSum = preSum + map.get(node);
            if (!map.containsKey(leftChild) && !map.containsKey(rightChild)) {
                totalSum += currSum;
                return;
            }

            if (map.containsKey(leftChild)) {
                dfs(leftChild, currSum, map);
            }
            if (map.containsKey(rightChild)) {
                dfs(rightChild, currSum, map);
            }
        }
    }
}

package com.fishercoder.solutions.thirdthousand;

public class _2673 {
    public static class Solution1 {
        /*
         * My completely original solution, although verbose and could be further optimized.
         * Practice makes perfect!
         */
        class TreeNodeWithCost {
            int val;
            int cost;
            int costSumFromRootToThisNode;
            int maxCostFromThisNodeToAllPossibleLeafNodes;
            TreeNodeWithCost left;
            TreeNodeWithCost right;

            public TreeNodeWithCost(int val, int cost) {
                this.val = val;
                this.cost = cost;
                this.costSumFromRootToThisNode = cost;
            }
        }

        int maxCostFromRootToLeaf = 0;
        int minIncs = 0;

        public int minIncrements(int n, int[] cost) {
            TreeNodeWithCost root = new TreeNodeWithCost(1, cost[0]);
            preOrderBuildTree(root, n, cost, 1);
            inOrderFindMaxCostPath(root);
            // in order to do the minimum increments, we want to increment as many times as possible
            // on the nodes as close to the root as possible
            // but to how many?
            // then we need to know the maximum cost of all paths from each node to all of its
            // possible leaf nodes
            // the difference is the number of increments we can do on this node
            postOrderFindMaxCostForEachNode(root);
            preOrderToIncrementCost(root);
            return minIncs;
        }

        private void preOrderToIncrementCost(TreeNodeWithCost root) {
            if (root == null) {
                return;
            }
            int incsNeeded = maxCostFromRootToLeaf - root.maxCostFromThisNodeToAllPossibleLeafNodes;
            minIncs += incsNeeded;
            if (incsNeeded > 0) {
                root.costSumFromRootToThisNode += incsNeeded;
                preOrderToUpdateCostSums(root, incsNeeded);
            }
            preOrderToIncrementCost(root.left);
            preOrderToIncrementCost(root.right);
        }

        private void preOrderToUpdateCostSums(TreeNodeWithCost root, int incsNeeded) {
            if (root == null) {
                return;
            }
            root.costSumFromRootToThisNode += incsNeeded;
            root.maxCostFromThisNodeToAllPossibleLeafNodes += incsNeeded;
            preOrderToUpdateCostSums(root.left, incsNeeded);
            preOrderToUpdateCostSums(root.right, incsNeeded);
        }

        private int postOrderFindMaxCostForEachNode(TreeNodeWithCost node) {
            if (node == null) {
                return 0;
            }
            int leftMaxCost = postOrderFindMaxCostForEachNode(node.left);
            int rightMaxCost = postOrderFindMaxCostForEachNode(node.right);
            if (leftMaxCost == 0 && rightMaxCost == 0) {
                // this means this node is a leaf node
                node.maxCostFromThisNodeToAllPossibleLeafNodes = node.costSumFromRootToThisNode;
            } else {
                // if it's not leaf node, then we take the bigger one from left and right
                node.maxCostFromThisNodeToAllPossibleLeafNodes =
                        Math.max(leftMaxCost, rightMaxCost);
            }
            return node.maxCostFromThisNodeToAllPossibleLeafNodes;
        }

        private void inOrderFindMaxCostPath(TreeNodeWithCost root) {
            if (root == null) {
                return;
            }
            inOrderFindMaxCostPath(root.left);
            if (root.left == null && root.right == null) {
                maxCostFromRootToLeaf =
                        Math.max(maxCostFromRootToLeaf, root.costSumFromRootToThisNode);
            }
            inOrderFindMaxCostPath(root.right);
        }

        private int preOrderBuildTree(TreeNodeWithCost root, int n, int[] cost, int base) {
            if (root == null || base * 2 >= n) {
                return 0;
            }

            root.left = new TreeNodeWithCost(base * 2, cost[base * 2 - 1]);
            root.left.costSumFromRootToThisNode = root.left.cost + root.costSumFromRootToThisNode;
            root.right = new TreeNodeWithCost(base * 2 + 1, cost[base * 2]);
            root.right.costSumFromRootToThisNode = root.right.cost + root.costSumFromRootToThisNode;

            preOrderBuildTree(root.left, n, cost, base * 2);
            preOrderBuildTree(root.right, n, cost, base * 2 + 1);
            return root.costSumFromRootToThisNode;
        }
    }
}

package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1993 {
    public static class Solution1 {
        /**
         * My completely original solution:
         * 1. use hashmap1 to store num to node mapping;
         * 2. use hashmap2 to store num to user lock mapping;
         * 3. use hashmap3 to store child to parent mapping;
         * 4. build the tree: make sure to retrieve the node from map if it exists, otherwise, the tree might be disconnected, i.e. leading to wrong ansers.
         */
        public static class LockingTree {
            class TreeNode {
                List<TreeNode> children;
                int val;

                public TreeNode(int val) {
                    this.val = val;
                    this.children = new ArrayList<>();
                }
            }

            Map<Integer, TreeNode> map;
            Map<TreeNode, TreeNode> childToParentMap;
            Map<Integer, Integer> lockMap;
            TreeNode root;

            public LockingTree(int[] parent) {
                this.map = new HashMap<>();
                this.root = new TreeNode(0);
                this.map.put(0, root);
                this.childToParentMap = new HashMap<>();
                constructTree(parent, map, childToParentMap);
                this.lockMap = new HashMap<>();
            }

            private void constructTree(int[] parent, Map<Integer, TreeNode> map, Map<TreeNode, TreeNode> childToParentMap) {
                for (int i = 1; i < parent.length; i++) {
                    TreeNode parentNode = map.getOrDefault(parent[i], new TreeNode(parent[i]));
                    TreeNode childNode = map.getOrDefault(i, new TreeNode(i));
                    parentNode.children.add(childNode);
                    map.put(parent[i], parentNode);
                    map.put(i, childNode);
                    childToParentMap.put(childNode, parentNode);
                }
            }

            public boolean lock(int num, int user) {
                if (lockMap.containsKey(num)) {
                    return false;
                } else {
                    lockMap.put(num, user);
                    return true;
                }
            }

            public boolean unlock(int num, int user) {
                if (!lockMap.containsKey(num)) {
                    return false;
                } else if (lockMap.get(num) == user || user == -1) {
                    lockMap.remove(num);
                    return true;
                } else {
                    return false;
                }
            }

            public boolean upgrade(int num, int user) {
                if (hasLockedAncestor(num) || !hasOneLockedChild(num) || lockMap.containsKey(num)) {
                    return false;
                }
                lock(num, user);
                List<TreeNode> children = map.get(num).children;
                for (TreeNode child : children) {
                    unlockRegardlessUser(child);
                }
                return true;
            }

            private boolean hasOneLockedChild(int num) {
                if (lockMap.containsKey(num)) {
                    return true;
                }
                TreeNode node = map.get(num);
                for (TreeNode child : node.children) {
                    if (hasOneLockedChild(child.val)) {
                        return true;
                    }
                }
                return false;
            }

            private boolean hasLockedAncestor(int num) {
                TreeNode node = map.get(num);
                while (childToParentMap.containsKey(node)) {
                    TreeNode parent = childToParentMap.get(node);
                    if (lockMap.containsKey(parent.val)) {
                        return true;
                    }
                    node = parent;
                }
                return false;
            }

            private void unlockRegardlessUser(TreeNode treeNode) {
                unlock(treeNode.val, -1);
                for (TreeNode child : treeNode.children) {
                    unlockRegardlessUser(child);
                }
            }
        }
    }
}

package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

public class _2764 {
    public static class Solution1 {
        public boolean isPreorder(List<List<Integer>> nodes) {
            TreeNode root = buildTree(nodes);
            List<Integer> list = new ArrayList<>();
            preorderDfs(root, list);
            if (nodes.size() != list.size()) {
                return false;
            }
            for (int i = 0; i < nodes.size(); i++) {
                if (!Objects.equals(list.get(i), nodes.get(i).get(0))) {
                    return false;
                }
            }
            return true;
        }

        private TreeNode buildTree(List<List<Integer>> nodes) {
            TreeNode root = buildRoot(nodes);
            Map<Integer, TreeNode> map = new HashMap<>();
            map.put(root.val, root);
            for (int i = 0; i < nodes.size(); i++) {
                if (nodes.get(i).get(1) != -1) {
                    List<Integer> list = nodes.get(i);
                    int child = list.get(0);
                    int parent = list.get(1);
                    TreeNode childNode = map.getOrDefault(child, new TreeNode(child));
                    TreeNode parentNode = map.getOrDefault(parent, new TreeNode(parent));
                    if (parentNode.left == null) {
                        parentNode.left = childNode;
                    } else {
                        parentNode.right = childNode;
                    }
                    // need to put the nodes back into the map
                    map.put(child, childNode);
                    map.put(parent, parentNode);
                }
            }
            return map.get(root.val);
        }

        private TreeNode buildRoot(List<List<Integer>> nodes) {
            for (List<Integer> list : nodes) {
                if (list.get(1) == -1) {
                    return new TreeNode(list.get(0));
                }
            }
            return null;
        }

        private List<Integer> preorderDfs(TreeNode root, List<Integer> result) {
            if (root == null) {
                return result;
            }
            result.add(root.val);
            preorderDfs(root.left, result);
            preorderDfs(root.right, result);
            return result;
        }
    }

    public static class Solution2 {
        /**
         * The only difference between this solution and the one above is:
         * map.computeIfAbsent()
         * computeIfAbsent automatically performs the missing map.put(parent, parentNode) step internally the exact moment it creates the node, ensuring the parent is immediately tracked for any future children.
         */
        public boolean isPreorder(List<List<Integer>> nodes) {
            TreeNode root = buildTree(nodes);
            List<Integer> list = new ArrayList<>();
            preorderDfs(root, list);
            if (nodes.size() != list.size()) {
                return false;
            }
            for (int i = 0; i < nodes.size(); i++) {
                if (!Objects.equals(list.get(i), nodes.get(i).get(0))) {
                    return false;
                }
            }
            return true;
        }

        private TreeNode buildTree(List<List<Integer>> nodes) {
            TreeNode root = buildRoot(nodes);
            Map<Integer, TreeNode> map = new HashMap<>();
            map.put(root.val, root);
            for (int i = 0; i < nodes.size(); i++) {
                if (nodes.get(i).get(1) != -1) {
                    List<Integer> list = nodes.get(i);
                    int child = list.get(0);
                    int parent = list.get(1);
                    TreeNode childNode = map.computeIfAbsent(child, k -> new TreeNode(k));
                    TreeNode parentNode = map.computeIfAbsent(parent, k -> new TreeNode(k));
                    if (parentNode.left == null) {
                        parentNode.left = childNode;
                    } else {
                        parentNode.right = childNode;
                    }
                }
            }
            return map.get(root.val);
        }

        private TreeNode buildRoot(List<List<Integer>> nodes) {
            for (List<Integer> list : nodes) {
                if (list.get(1) == -1) {
                    return new TreeNode(list.get(0));
                }
            }
            return null;
        }

        private List<Integer> preorderDfs(TreeNode root, List<Integer> result) {
            if (root == null) {
                return result;
            }
            result.add(root.val);
            preorderDfs(root.left, result);
            preorderDfs(root.right, result);
            return result;
        }
    }
}

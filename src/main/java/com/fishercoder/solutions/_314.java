package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class _314 {
    public static class Solution1 {
        public List<List<Integer>> verticalOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList();
            if (root == null) {
                return result;
            }
            Queue<TreeNode> bfsQ = new LinkedList();
            Queue<Integer> indexQ = new LinkedList();
            TreeMap<Integer, List<Integer>> map = new TreeMap();
            bfsQ.offer(root);
            indexQ.offer(
                    0);//we set the root as index 0, left will be negative, right will be positive
            while (!bfsQ.isEmpty()) {
                int qSize = bfsQ.size();
                for (int i = 0; i < qSize; i++) {
                    TreeNode curr = bfsQ.poll();
                    int index = indexQ.poll();
                    if (map.containsKey(index)) {
                        map.get(index).add(curr.val);
                    } else if (!map.containsKey(index)) {
                        List<Integer> list = new ArrayList();
                        list.add(curr.val);
                        map.put(index, list);
                    }
                    if (curr.left != null) {
                        bfsQ.offer(curr.left);
                        indexQ.offer(index - 1);
                    }
                    if (curr.right != null) {
                        bfsQ.offer(curr.right);
                        indexQ.offer(index + 1);
                    }
                }
            }
            for (int i : map.keySet()) {
                result.add(map.get(i));
            }
            return result;
        }
    }

    public static class Solution2 {
        public List<List<Integer>> verticalOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList();
            if (root == null) {
                return result;
            }
            Queue<TreeNode> bfsQ = new LinkedList();
            Queue<Integer> indexQ = new LinkedList();
            HashMap<Integer, List<Integer>> map = new HashMap();
            bfsQ.offer(root);
            indexQ.offer(
                    0);//we set the root as index 0, left will be negative, right will be positive
            int min = 0;
            int max = 0;
            while (!bfsQ.isEmpty()) {
                int qSize = bfsQ.size();
                for (int i = 0; i < qSize; i++) {
                    TreeNode curr = bfsQ.poll();
                    int index = indexQ.poll();
                    if (map.containsKey(index)) {
                        map.get(index).add(curr.val);
                    } else if (!map.containsKey(index)) {
                        List<Integer> list = new ArrayList();
                        list.add(curr.val);
                        map.put(index, list);
                    }
                    if (curr.left != null) {
                        bfsQ.offer(curr.left);
                        indexQ.offer(index - 1);
                        min = Math.min(min, index - 1);
                    }
                    if (curr.right != null) {
                        bfsQ.offer(curr.right);
                        indexQ.offer(index + 1);
                        max = Math.max(max, index + 1);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                result.add(map.get(i));
            }
            return result;
        }
    }

    public static class Solution3 {
        public List<List<Integer>> verticalOrder(TreeNode root) {
            if (root == null) {
                return new ArrayList<>();
            }
            TreeMap<Integer, List<Integer>> map = new TreeMap<>();
            Queue<NodeWithIndex> queue = new LinkedList<>();
            queue.offer(new NodeWithIndex(root, 0));
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    NodeWithIndex nodeWithIndex = queue.poll();
                    List<Integer> thisList = map.getOrDefault(nodeWithIndex.index, new ArrayList<>());
                    thisList.add(nodeWithIndex.node.val);
                    map.put(nodeWithIndex.index, thisList);
                    if (nodeWithIndex.node.left != null) {
                        queue.offer(new NodeWithIndex(nodeWithIndex.node.left, nodeWithIndex.index - 1));
                    }
                    if (nodeWithIndex.node.right != null) {
                        queue.offer(new NodeWithIndex(nodeWithIndex.node.right, nodeWithIndex.index + 1));
                    }
                }
            }
            List<List<Integer>> result = new ArrayList<>();
            for (int index : map.keySet()) {
                result.add(map.get(index));
            }
            return result;
        }

        class NodeWithIndex {
            TreeNode node;
            int index;

            public NodeWithIndex(TreeNode node, int index) {
                this.node = node;
                this.index = index;
            }
        }
    }

}

package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _429 {
    public static class Solution1 {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> level = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
                    if (node != null) {
                        level.add(node.val);
                        for (Node child : node.children) {
                            queue.offer(child);
                        }
                    }
                }
                result.add(level);
            }
            return result;
        }
    }
}

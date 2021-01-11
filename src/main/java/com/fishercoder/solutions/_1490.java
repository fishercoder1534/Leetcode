package com.fishercoder.solutions;

import com.fishercoder.common.classes.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _1490 {
    public static class Solution1 {
        public Node cloneTree(Node root) {
            if (root == null) {
                return root;
            }
            Map<Node, Node> map = new HashMap<>();
            map.put(root, new Node(root.val));
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                Node curr = queue.poll();
                for (Node child : curr.children) {
                    Node childCopy = new Node(child.val);
                    if (!map.containsKey(child)) {
                        map.put(child, childCopy);
                        queue.offer(child);
                    }
                    map.get(curr).children.add(childCopy);
                }
            }
            return map.get(root);
        }
    }
}

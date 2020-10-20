package com.fishercoder.solutions;

import com.fishercoder.common.classes.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _133 {

    public static class Solution1 {
        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
            if (node == null) {
                return node;
            }

            Map<Integer, UndirectedGraphNode> map = new HashMap();
            Queue<UndirectedGraphNode> queue = new LinkedList();
            UndirectedGraphNode root = new UndirectedGraphNode(node.val);
            map.put(root.val, root);
            queue.offer(node);
            //remember to offer the original input node into the queue which contains all the information
            while (!queue.isEmpty()) {
                UndirectedGraphNode curr = queue.poll();
                for (UndirectedGraphNode eachNode : curr.neighbors) {
                    if (!map.containsKey(eachNode.val)) {
                        map.put(eachNode.val, new UndirectedGraphNode(eachNode.val));
                        queue.offer(eachNode);
                    }
                    map.get(curr.val).neighbors.add(map.get(eachNode.val));
                }
            }
            return root;
        }
    }
}

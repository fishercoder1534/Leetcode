package com.fishercoder.solutions;

import com.fishercoder.common.classes.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 133. Clone Graph

 Clone an undirected graph.
 Each node in the graph contains a label and a list of its neighbors.


 OJ's undirected graph serialization:
 Nodes are labeled uniquely.

 We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 As an example, consider the serialized graph {0,1,2#1,2#2,2}.

 The graph has a total of three nodes, and therefore contains three parts as separated by #.

 First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 Second node is labeled as 1. Connect node 1 to node 2.
 Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 Visually, the graph looks like the following:

    1
   / \
  /   \
 0 --- 2
      / \
      \_/

 */
public class _133 {

  public static class Solution1 {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
      if (node == null) {
        return node;
      }

      Map<Integer, UndirectedGraphNode> map = new HashMap();
      Queue<UndirectedGraphNode> queue = new LinkedList();
      UndirectedGraphNode root = new UndirectedGraphNode(node.label);
      map.put(root.label, root);
      queue.offer(node);
      //remember to offer the original input node into the queue which contains all the information
      while (!queue.isEmpty()) {
        UndirectedGraphNode curr = queue.poll();
        for (UndirectedGraphNode eachNode : curr.neighbors) {
          if (!map.containsKey(eachNode.label)) {
            map.put(eachNode.label, new UndirectedGraphNode(eachNode.label));
            queue.offer(eachNode);
          }
          map.get(curr.label).neighbors.add(map.get(eachNode.label));
        }
      }
      return root;
    }
  }
}

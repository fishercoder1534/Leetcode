package stevesun.algorithms;

import stevesun.common.classes.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by fishercoder1534 on 9/30/16.
 */
public class CloneGraph {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return node;

        Map<Integer, UndirectedGraphNode> map = new HashMap();
        Queue<UndirectedGraphNode> queue = new LinkedList();
        UndirectedGraphNode root = new UndirectedGraphNode(node.label);
        map.put(root.label, root);
        queue.offer(node);//remember to offer the original input node into the queue which contains all the information
        while(!queue.isEmpty()){
            UndirectedGraphNode curr = queue.poll();
            for(UndirectedGraphNode eachNode : curr.neighbors){
                if(!map.containsKey(eachNode.label)){
                    map.put(eachNode.label, new UndirectedGraphNode(eachNode.label));
                    queue.offer(eachNode);
                }
                map.get(curr.label).neighbors.add(map.get(eachNode.label));
            }
        }
        return root;
    }

}

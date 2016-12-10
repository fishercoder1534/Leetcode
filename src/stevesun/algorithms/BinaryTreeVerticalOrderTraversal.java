package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

import java.util.*;

public class BinaryTreeVerticalOrderTraversal {
    public List<List<Integer>> verticalOrder_using_treemap(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;
        Queue<TreeNode> bfsQ = new LinkedList();
        Queue<Integer> indexQ = new LinkedList();
        TreeMap<Integer, List<Integer>> map = new TreeMap();
        bfsQ.offer(root);
        indexQ.offer(0);//we set the root as index 0, left will be negative, right will be positive
        while(!bfsQ.isEmpty()){
            int qSize = bfsQ.size();
            for(int i = 0; i < qSize; i++){
                TreeNode curr = bfsQ.poll();
                int index = indexQ.poll();
                if(map.containsKey(index)){
                    map.get(index).add(curr.val);
                } else if(!map.containsKey(index)){
                    List<Integer> list = new ArrayList();
                    list.add(curr.val);
                    map.put(index, list);
                }
                if(curr.left != null){
                    bfsQ.offer(curr.left);
                    indexQ.offer(index-1);
                }
                if(curr.right != null){
                    bfsQ.offer(curr.right);
                    indexQ.offer(index+1);
                }
            }
        }
        for(int i : map.keySet()){
            result.add(map.get(i));
        }
        return result;
    }

    public List<List<Integer>> verticalOrder_using_hashmap(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;
        Queue<TreeNode> bfsQ = new LinkedList();
        Queue<Integer> indexQ = new LinkedList();
        HashMap<Integer, List<Integer>> map = new HashMap();
        bfsQ.offer(root);
        indexQ.offer(0);//we set the root as index 0, left will be negative, right will be positive
        int min = 0, max = 0;
        while(!bfsQ.isEmpty()){
            int qSize = bfsQ.size();
            for(int i = 0; i < qSize; i++){
                TreeNode curr = bfsQ.poll();
                int index = indexQ.poll();
                if(map.containsKey(index)){
                    map.get(index).add(curr.val);
                } else if(!map.containsKey(index)){
                    List<Integer> list = new ArrayList();
                    list.add(curr.val);
                    map.put(index, list);
                }
                if(curr.left != null){
                    bfsQ.offer(curr.left);
                    indexQ.offer(index-1);
                    min  = Math.min(min, index-1);
                }
                if(curr.right != null){
                    bfsQ.offer(curr.right);
                    indexQ.offer(index+1);
                    max = Math.max(max, index+1);
                }
            }
        }
        for(int i = min; i <= max; i++){
            result.add(map.get(i));
        }
        return result;
    }

}

package com.stevesun.solutions;

import com.stevesun.common.classes.TreeNode;

import java.util.*;

/**
 Given a binary search tree with duplicates. You have to find all the mode(s) in given binary tree.

 For example:
 Given binary tree [1,null,2,2],
 1
  \
   2
  /
 2
 return [2].

 Note: If a tree has more than one mode, you can return them in any order.

 */
public class FindModeinBinaryTree {

    public int[] findMode(TreeNode root) {
        int[] result = new int[]{};
        Map<Integer, Integer> map = new HashMap();
        if (root == null) return result;
        List<Integer> list = bfs(root, map);
        result = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    private List<Integer> bfs(TreeNode root, Map<Integer, Integer> map) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode treeNode = queue.poll();
                if (treeNode.left != null) queue.offer(treeNode.left);
                if (treeNode.right != null) queue.offer(treeNode.right);
                map.put(treeNode.val, map.getOrDefault(treeNode.val, 0) + 1);
            }
        }

        int highestFrequency = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > highestFrequency){
                highestFrequency = entry.getValue();
                list.clear();
                list.add(entry.getKey());
            } else if (entry.getValue() == highestFrequency){
                list.add(entry.getKey());
            }
        }

        return list;
    }

}

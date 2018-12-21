package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

/**
 * 314. Binary Tree Vertical Order Traversal
 *
 * Given a binary tree, return the vertical order traversal of its nodes' values. (ie, from top to bottom, column by column).

 If two nodes are in the same row and column, the order should be from left to right.

 Examples:

 Given binary tree [3,9,20,null,null,15,7],
    3
   /\
  /  \
 9  20
    /\
   /  \
  15   7
 return its vertical order traversal as:
 [
 [9],
 [3,15],
 [20],
 [7]
 ]

 Given binary tree [3,9,8,4,0,1,7],
    3
   /\
  /  \
 9   8
/\   /\
/  \/  \
4  01   7
 return its vertical order traversal as:
 [
 [4],
 [9],
 [3,0,1],
 [8],
 [7]
 ]

 Given binary tree [3,9,8,4,0,1,7,null,null,null,2,5] (0's right child is 2 and 1's left child is 5),
      3
     /\
    /  \
   9   8
  /\  /\
 /  \/  \
4  01   7
   /\
  /  \
 5   2
 return its vertical order traversal as:
 [
 [4],
 [9,5],
 [3,0,1],
 [8,2],
 [7]
 ]
 */
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

}

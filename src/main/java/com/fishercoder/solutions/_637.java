package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 637. Average of Levels in Binary Tree
 *
 Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

 Example 1:
 Input:
  3
 / \
9  20
  /  \
 15   7

 Output: [3, 14.5, 11]
 Explanation:

 The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 Note:
 The range of node's value is in the range of 32-bit signed integer.
 */
public class _637 {

    public static class Solution1 {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                double sum = 0.0;
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (curr != null) {
                        sum += curr.val;
                    }
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
                result.add(sum / size);
            }
            return result;
        }
    }

}

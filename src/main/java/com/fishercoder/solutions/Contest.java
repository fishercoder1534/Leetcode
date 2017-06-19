package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by stevesun on 6/17/17.
 */
public class Contest {


    public TreeNode addOneRow(TreeNode root, int v, int d) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> prevQueue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null && depth == (d-1)) {
                    prevQueue.offer(curr.left);
                    queue.offer(curr.left);
                } else if (curr.left == null && depth == d) {
                    queue.offer(new TreeNode(Integer.MIN_VALUE));
                } else if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null && depth == (d-1)) {
                    prevQueue.offer(curr.right);
                    queue.offer(curr.right);
                } else if (curr.right == null && depth == d) {
                    queue.offer(new TreeNode(Integer.MIN_VALUE));
                } else if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            if (depth == d) {
                break;
            }
            depth++;
        }
        Queue<TreeNode> secondQueue = new LinkedList<>();
        secondQueue.offer(root);
        depth = 0;
        while (!secondQueue.isEmpty()) {
            depth++;
            int size = secondQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
            }
        }
        return root;
    }


    public static void main(String... args) {
        Contest contest = new Contest();
        System.out.println("hello world!");
//        int[][] arrays = new int[][]{
//                {1,2,3},
//                {4,5},
//                {1,2,3},
//        };
    }
}

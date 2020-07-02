package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _107 {
    public static class Solution1 {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> result = new ArrayList();
            if (root == null) {
                return result;
            }
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while (!q.isEmpty()) {
                List<Integer> thisLevel = new ArrayList<>();
                int qSize = q.size();
                for (int i = 0; i < qSize; i++) {
                    TreeNode curr = q.poll();
                    thisLevel.add(curr.val);
                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
                result.add(thisLevel);
            }
            Collections.reverse(result);
            return result;
        }
    }
}

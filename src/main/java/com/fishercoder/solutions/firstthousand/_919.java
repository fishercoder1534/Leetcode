package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _919 {
    public static class Solution1 {
        /*
         * My completely original solution.
         * Beats 98.11% submissions.
         */
        public static class CBTInserter {
            private Map<Integer, TreeNode> indexMap;
            private int index;
            private TreeNode root;

            public CBTInserter(TreeNode root) {
                this.indexMap = new HashMap<>();
                this.index = 1;
                this.root = root;
                Queue<TreeNode> q = new LinkedList<>();
                q.offer(root);
                while (!q.isEmpty()) {
                    int size = q.size();
                    for (int i = 0; i < size; i++) {
                        TreeNode curr = q.poll();
                        indexMap.put(index++, curr);
                        if (curr.left != null) {
                            q.offer(curr.left);
                        }
                        if (curr.right != null) {
                            q.offer(curr.right);
                        }
                    }
                }
            }

            public int insert(int val) {
                int parentIndex = index / 2;
                TreeNode parentNode = indexMap.get(parentIndex);
                TreeNode childNode = new TreeNode(val);
                if (index % 2 == 0) {
                    parentNode.left = childNode;
                } else {
                    parentNode.right = childNode;
                }
                indexMap.put(index++, childNode);
                indexMap.put(parentIndex, parentNode);
                return parentNode.val;
            }

            public TreeNode get_root() {
                return root;
            }
        }
    }
}

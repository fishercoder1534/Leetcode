package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


/**
 * 652. Find Duplicate Subtrees
 *
 * Given a binary tree, return all duplicate subtrees. For each kind of duplicate subtrees, you only need to return the root node of any one of them.

 Two trees are duplicate if they have the same structure with same node values.

 Example 1:
     1
    / \
   2   3
  /   / \
 4   2   4
    /
   4
 The following are two duplicate subtrees:
     2
    /
   4
 and
 4

 Therefore, you need to return above trees' root in the form of a list.
 */
public class _652 {

    /**credit: https://discuss.leetcode.com/topic/97584/java-concise-postorder-traversal-solution*/

    /**You don't actually need to check if every other tree is a duplicate of current node,
     * just when you go through each node, you'll see whether there's already one in the map,
     * since map.containsKey() checks this TreeNode.*/
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new LinkedList<>();
        postorder(root, new HashMap<>(), res);
        return res;
    }

    private String postorder(TreeNode curr, HashMap<String, Integer> map, List<TreeNode> res) {
        if (curr == null) {
            return "#";
        }
        String serial = curr.val + "," + postorder(curr.left, map, res) + "," + postorder(curr.right, map, res);
        if (map.getOrDefault(serial, 0) == 1) {
            res.add(curr);
        }
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        return serial;
    }


    public class MyOriginalSolution {
        /**This solution is blocked at [2,1,1] test case and I've asked a question here:
         * https://discuss.leetcode.com/topic/97746/oj-bug-for-test-case-2-1-1-or-somewhere-my-code-is-wrong*/

        /**
         * Use BFS to traverse each node, at this time, put each node into Map as key (except root node since root won't have duplicates),
         * then use DFS to visit all of its siblings to find possible duplite subtrees,
         * because duplicate could only possibly be found in siblings or sibling's children.
         */
        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            List<TreeNode> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Map<TreeNode, List<TreeNode>> map = new HashMap<>();
            Queue<TreeNode> oldQueue = new LinkedList<>();
            Queue<TreeNode> newQueue = new LinkedList<>();
            oldQueue.offer(root);
            while (!oldQueue.isEmpty()) {
                int size = oldQueue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = oldQueue.poll();
                    if (curr.left != null) {
                        newQueue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        newQueue.offer(curr.right);
                    }
                    if (curr != root) {
                        if (!map.containsKey(curr)) {
                            map.put(curr, new ArrayList<>());
                        }
                    }
                }
                for (TreeNode treeNode : newQueue) {
                    findDuplicateSubtrees(treeNode, newQueue, map);
                }
                oldQueue = newQueue;
            }
            Set<TreeNode> set = new HashSet<>();
            for (Map.Entry<TreeNode, List<TreeNode>> entry : map.entrySet()) {
                if (entry.getValue().size() > 0) {
                    set.add(entry.getKey());
                }
            }
            result.addAll(set);
            return result;
        }

        private void findDuplicateSubtrees(TreeNode treeNode, Queue<TreeNode> newQueue, Map<TreeNode, List<TreeNode>> map) {
            for (TreeNode tn : newQueue) {
                if (treeNode != tn) {
                    if (isSubtree(tn, treeNode)) {
                        List<TreeNode> list = map.getOrDefault(treeNode, new ArrayList<>());
                        list.add(tn);
                        map.put(treeNode, list);
                        return;
                    }
                }
            }
        }

        private boolean isSubtree(TreeNode s, TreeNode t) {
            if (s == null && t == null) {
                return true;
            }
            boolean isSubTree = false;
            if (s != null && t != null && s.val == t.val) {
                isSubTree = isSameTree(s, t);
            }
            if (isSubTree) {
                return true;
            }
            boolean isSubTreeLeft = false;
            if (s.left != null) {
                isSubTreeLeft = isSubtree(s.left, t);
            }
            if (isSubTreeLeft) {
                return true;
            }
            boolean isSubTreeRight = false;
            if (s.right != null) {
                isSubTreeRight = isSubtree(s.right, t);
            }
            if (isSubTreeRight) {
                return true;
            }
            return false;
        }

        private boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null || q == null) {
                return p == q;
            }
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}

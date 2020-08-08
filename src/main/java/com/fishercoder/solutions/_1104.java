package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.TreeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _1104 {
    public static class Solution1 {
        /**
         * This brute force solution is correct but results in TLE on LeetCode.
         */
        public List<Integer> pathInZigZagTree(int label) {
            Deque<Integer> deque = buildZigZagOrderList(label);
            CommonUtils.printDeque(deque);
            TreeNode root = buildZigZagOrderTree(deque);
            TreeUtils.printBinaryTree(root);
            return dfs(root, label, new ArrayList<>());
        }

        private List<Integer> dfs(TreeNode root, int label, List<Integer> list) {
            if (root == null) {
                return list;
            }
            list.add(root.val);
            if (root.val == label) {
                return list;
            }
            dfs(root.left, label, list);
            dfs(root.right, label, list);
            if (list.get(list.size() - 1) == label) {
                return list;
            }
            list.remove(list.size() - 1);
            return list;
        }

        private TreeNode buildZigZagOrderTree(Deque<Integer> deque) {
            TreeNode root = new TreeNode(deque.pollFirst());
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!deque.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    curr.left = new TreeNode(deque.pollFirst());
                    curr.right = new TreeNode(deque.pollFirst());
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            return root;
        }

        private Deque<Integer> buildZigZagOrderList(int label) {
            Deque<Integer> deque = new LinkedList<>();
            int num = 1;
            int level = 2;
            deque.add(num);
            do {
                num++;
                List<Integer> newLevel = new ArrayList<>();
                for (; num < Math.pow(2, level); num++) {
                    newLevel.add(num);
                }
                num--;
                if (level % 2 == 0) {
                    Collections.reverse(newLevel);
                }
                deque.addAll(newLevel);
                newLevel.clear();
                level++;
            } while (deque.getLast() < label);
            return deque;
        }
    }

    public static class Solution2 {
        /**
         * We'll directly compute the index of its parent, it'll be much faster this way.
         */
        public List<Integer> pathInZigZagTree(int label) {
            List<List<Integer>> lists = buildZigZagOrderList(label);
            List<Integer> result = new ArrayList<>();
            int index = findIndex(lists.get(lists.size() - 1), label);
            result.add(label);
            for (int i = lists.size() - 2; i >= 0; i--) {
                index /= 2;
                result.add(lists.get(i).get(index));
            }
            Collections.sort(result);
            return result;
        }

        private int findIndex(List<Integer> level, int label) {
            for (int i = 0; i < level.size(); i++) {
                if (level.get(i) == label) {
                    return i;
                }
            }
            return -1;
        }

        private List<List<Integer>> buildZigZagOrderList(int label) {
            List<List<Integer>> lists = new ArrayList<>();
            int num = 1;
            int level = 2;
            lists.add(Arrays.asList(num));
            if (label == 1) {
                return lists;
            }
            List<Integer> newLevel = new ArrayList<>();
            do {
                newLevel.clear();
                num++;
                for (; num < Math.pow(2, level); num++) {
                    newLevel.add(num);
                }
                num--;
                if (level % 2 == 0) {
                    Collections.reverse(newLevel);
                }
                lists.add(new ArrayList<>(newLevel));
                level++;
            } while (newLevel.get(0) < label && newLevel.get(newLevel.size() - 1) < label);
            return lists;
        }
    }
}

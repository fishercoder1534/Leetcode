package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _1367 {
    public static class Solution1 {
        List<List<Integer>> paths = new ArrayList<>();

        public boolean isSubPath(ListNode head, TreeNode root) {
            List<Integer> list = getList(head);
            findAllPaths(root, new ArrayList<>());
            for (List<Integer> path : paths) {
                if (path.size() >= list.size()) {
                    if (find(list, path)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean find(List<Integer> list, List<Integer> path) {
            int i = 0;
            int j = 0;
            for (; i <= path.size() - list.size(); i++) {
                j = 0;
                int tmpI = i;
                while (j < list.size() && tmpI < path.size() && list.get(j) == path.get(tmpI)) {
                    tmpI++;
                    j++;
                }
                if (j >= list.size()) {
                    return true;
                }
            }
            return j >= list.size();
        }

        private void findAllPaths(TreeNode root, List<Integer> path) {
            if (root == null) {
                return;
            }
            path.add(root.val);
            if (root.left == null && root.right == null) {
                paths.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
                return;
            }
            findAllPaths(root.left, path);
            findAllPaths(root.right, path);
            path.remove(path.size() - 1);
        }

        private List<Integer> getList(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            return list;
        }
    }
}

package com.fishercoder.solutions;

import com.fishercoder.common.classes.Node;

import java.util.ArrayList;
import java.util.List;

public class _589 {
    public static class Solution1 {
        public List<Integer> preorder(Node root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            dfs(root, result);
            return result;
        }

        private void dfs(Node root, List<Integer> result) {
            if (root == null) {
                return;
            }
            result.add(root.val);
            if (root.children.size() > 0) {
                for (Node child : root.children) {
                    dfs(child, result);
                }
            }
        }
    }
}

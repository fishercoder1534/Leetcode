package com.fishercoder.solutions;

import com.fishercoder.common.classes.Node;

import java.util.ArrayList;
import java.util.List;

public class _590 {
    public static class Solution1 {
        public List<Integer> postorder(Node root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            dfs(root, result);
            result.add(root.val);
            return result;
        }

        private void dfs(Node root, List<Integer> result) {
            if (root == null) {
                return;
            }
            if (root.children.size() > 0) {
                for (Node child : root.children) {
                    dfs(child, result);
                    result.add(child.val);
                }
            }
        }
    }
}

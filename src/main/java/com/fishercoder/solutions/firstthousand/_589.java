package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.Node;

import java.util.ArrayList;
import java.util.List;

public class _589 {
    public static class Solution1 {
        public List<Integer> preorder(Node root) {
            return preorder(root, new ArrayList<>());
        }

        private List<Integer> preorder(Node root, List<Integer> list) {
            if (root == null) {
                return list;
            }
            list.add(root.val);
            for (Node child : root.children) {
                preorder(child, list);
            }
            return list;
        }
    }
}

package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.Node;

import java.util.ArrayList;
import java.util.List;

public class _590 {
    public static class Solution1 {
        public List<Integer> postorder(Node root) {
            return postorder(root, new ArrayList<>());
        }

        private List<Integer> postorder(Node root, List<Integer> list) {
            if (root == null) {
                return list;
            }
            for (Node child : root.children) {
                postorder(child, list);
            }
            list.add(root.val);
            return list;
        }
    }
}

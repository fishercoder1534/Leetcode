package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.Node;

public class _1522 {
    public static class Solution1 {
        int maxDiameter;

        public int diameter(Node root) {
            maxDiameter = 0;
            dfs(root);
            return maxDiameter;
        }

        private int dfs(Node root) {
            if (root == null) {
                return 0;
            }
            int longest = 0;
            int secondLongest = 0;
            for (Node child : root.children) {
                int depth = dfs(child);
                if (depth > longest) {
                    secondLongest = longest; // save this one first into secondLongest
                    longest = depth;
                } else if (depth > secondLongest) {
                    secondLongest = depth;
                }
            }
            maxDiameter = Math.max(maxDiameter, longest + secondLongest);
            return longest + 1;
        }
    }
}

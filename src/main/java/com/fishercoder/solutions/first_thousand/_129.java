package com.fishercoder.solutions.first_thousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _129 {
    public static class Solution1 {
        public int sumNumbers(TreeNode root) {
            if (root == null) {
                return 0;
            }
            List<Integer> allNumbers = new ArrayList();
            dfs(root, new StringBuilder(), allNumbers);
            return allNumbers.stream().mapToInt(i -> i).sum();
        }

        private void dfs(TreeNode root, StringBuilder sb, List<Integer> allNumbers) {
            sb.append(root.val);
            if (root.left != null) {
                dfs(root.left, sb, allNumbers);
            }
            if (root.right != null) {
                dfs(root.right, sb, allNumbers);
            }
            if (root.left == null && root.right == null) {
                allNumbers.add(Integer.parseInt(sb.toString()));
            }
            //this is to delete the last value. since it's guaranteed that the value is between [0,9], so only one char needs to be deleted.
            //however if the value is >= 10 then this approach needs to be adjusted
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static class Solution2 {
        public int sumNumbers(TreeNode root) {
            return dfs(root, 0);
        }

        private int dfs(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return sum * 10 + root.val;
            }
            int left = dfs(root.left, sum * 10 + root.val);
            int right = dfs(root.right, sum * 10 + root.val);
            return left + right;
        }
    }

}

package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _655 {

    public static class Solution1 {

        /**
         * Reference: https://discuss.leetcode.com/topic/98381/java-recursive-solution
         * and https://leetcode.com/articles/print-binary-tree/
         */
        public List<List<String>> printTree(TreeNode root) {
            List<List<String>> result = new LinkedList<>();
            int height = root == null ? 1 : getHeight(root);
            int rows = height;
            int columns = (int) (Math.pow(2, height) - 1);
            List<String> row = new ArrayList<>();
            for (int i = 0; i < columns; i++) {
                row.add("");
            }
            for (int i = 0; i < rows; i++) {
                result.add(new ArrayList<>(row));
            }
            populateResult(root, result, 0, rows, 0, columns - 1);
            return result;
        }

        private void populateResult(TreeNode root, List<List<String>> result, int row, int totalRows, int i, int j) {
            if (row == totalRows || root == null) {
                return;
            }
            result.get(row).set((i + j) / 2, Integer.toString(root.val));
            populateResult(root.left, result, row + 1, totalRows, i, (i + j) / 2 - 1);
            populateResult(root.right, result, row + 1, totalRows, (i + j) / 2 + 1, j);
        }

        private int getHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }
}

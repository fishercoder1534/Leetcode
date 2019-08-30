package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 655. Print Binary Tree
 *
 * Print a binary tree in an m*n 2D string array following these rules:
 * 1. The row number m should be equal to the height of the given binary tree.
 * 2. The column number n should always be an odd number.
 * 3. The root node's value (in string format) should be put in the exactly middle of the first row it can be put.
 *    The column and the row where the root node belongs will separate the rest space into two parts (left-bottom part and right-bottom part).
 *    You should print the left subtree in the left-bottom part and print the right subtree in the right-bottom part.
 *    The left-bottom part and the right-bottom part should have the same size.
 *    Even if one subtree is none while the other is not,
 *    you don't need to print anything for the none subtree but
 *    still need to leave the space as large as that for the other subtree.
 *    However, if two subtrees are none, then you don't need to leave space for both of them.
 * 4. Each unused space should contain an empty string "".
 * 5. Print the subtrees following the same rules.

 Example 1:
 Input:
   1
  /
 2
 Output:
 [["", "1", ""],
 ["2", "", ""]]

 Example 2:
 Input:
   1
  / \
 2   3
  \
  4
 Output:
 [["", "", "", "1", "", "", ""],
 ["", "2", "", "", "", "3", ""],
 ["", "", "4", "", "", "", ""]]

 Example 3:
 Input:
       1
      / \
     2   5
    /
   3
  /
 4
 Output:

 [["",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""]
 ["",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""]
 ["",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]
 ["4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]]

 Note: The height of binary tree is in the range of [1, 10]
 */
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

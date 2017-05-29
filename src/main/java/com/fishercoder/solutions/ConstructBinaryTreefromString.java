package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * You need to construct a binary tree from a string consisting of parenthesis and integers.
 The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis.
 The integer represents the root's value and a pair of parenthesis contains a child binary tree with the same structure.
 You always start to construct the left child node of the parent first if it exists.

 Example:
 Input: "4(2(3)(1))(6(5))"
 Output: return the tree root node representing the following tree:

       4
     /   \
    2     6
   / \   /
  3   1 5

 Note:
 There will only be '(', ')', '-' and '0' ~ '9' in the input string.
 An empty tree is represented by "" instead of "()".
 */
public class ConstructBinaryTreefromString {

    public TreeNode str2tree(String s) {
        if (s.equals("")) return null;
        int firstParen = s.indexOf("(");
        int val = firstParen == -1 ? Integer.parseInt(s) : Integer.parseInt(s.substring(0, firstParen));
        TreeNode cur = new TreeNode(val);
        if (firstParen == -1) return cur;
        int start = firstParen;
        int leftParenCount = 0;
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) == '(') leftParenCount++;
            else if (s.charAt(i) == ')') leftParenCount--;
            if (leftParenCount == 0 && start == firstParen) {
                cur.left = str2tree(s.substring(start + 1, i));
                start = i + 1;
            } else if (leftParenCount == 0) {
                cur.right = str2tree(s.substring(start + 1, i));
            }
        }
        return cur;
    }

}

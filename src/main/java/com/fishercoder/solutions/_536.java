package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _536 {

    public static class Solution1 {
        /**
         * recursive solution
         */
        public TreeNode str2tree(String s) {
            if (s.equals("")) {
                return null;
            }
            int firstParen = s.indexOf("(");
            int val = firstParen == -1 ? Integer.parseInt(s) : Integer.parseInt(s.substring(0, firstParen));
            TreeNode cur = new TreeNode(val);
            if (firstParen == -1) {
                return cur;
            }
            int start = firstParen;
            int leftParenCount = 0;
            for (int i = start; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    leftParenCount++;
                } else if (s.charAt(i) == ')') {
                    leftParenCount--;
                }
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

    public static class Solution2 {
        /**
         * iterative solution
         */
        public TreeNode str2tree(String s) {
            Deque<TreeNode> stack = new ArrayDeque<>();
            for (int i = 0, j = i; i < s.length(); i++, j = i) {
                char c = s.charAt(i);
                if (c == ')') {
                    stack.pop();
                } else if (c >= '0' && c <= '9' || c == '-') {
                    while (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                        i++;
                    }
                    TreeNode curr = new TreeNode(Integer.valueOf(s.substring(j, i + 1)));
                    if (!stack.isEmpty()) {
                        TreeNode parent = stack.peek();
                        if (parent.left != null) {
                            parent.right = curr;
                        } else {
                            parent.left = curr;
                        }
                    }
                    stack.push(curr);
                }
            }
            return stack.isEmpty() ? null : stack.peek();
        }
    }

}

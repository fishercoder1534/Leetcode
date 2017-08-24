package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 606. Construct String from Binary Tree
 *
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
 The null node needs to be represented by empty parenthesis pair "()".
 And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string
 and the original binary tree.

 Example 1:
 Input: Binary tree: [1,2,3,4]
     1
   /   \
  2     3
 /
4

 Output: "1(2(4))(3)"

 Explanation: Originallay it needs to be "1(2(4)())(3()())",
 but you need to omit all the unnecessary empty parenthesis pairs.
 And it will be "1(2(4))(3)".

 Example 2:
 Input: Binary tree: [1,2,3,null,4]
    1
  /   \
 2     3
  \
  4

 Output: "1(2()(4))(3)"

 Explanation: Almost the same as the first example,
 except we can't omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
 */
public class _606 {

    public static class Solution1 {
        public String tree2str(TreeNode t) {
            if (t == null) {
                return "";
            }
            String result = "" + t.val;
            String left = tree2str(t.left);
            String right = tree2str(t.right);
            if (left.equals("") && right.equals("")) {
                return result;
            }
            if (left.equals("")) {
                return result + "()(" + right + ")";
            }
            if (right.equals("")) {
                return result + "(" + left + ")";
            }
            return result + "(" + left + ")(" + right + ")";
        }
    }

    public static class Solution2 {
        public String tree2str(TreeNode t) {
            if (t == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            preorder(t, sb);
            return sb.toString();
        }

        private void preorder(TreeNode root, StringBuilder sb) {
            if (root == null) {
                return;
            }
            sb.append(root.val);
            if (root.left != null) {
                sb.append("(");
                preorder(root.left, sb);
                sb.append(")");
            }
            if (root.right != null) {
                if (root.left == null) {
                    sb.append("()");
                }
                sb.append("(");
                preorder(root.right, sb);
                sb.append(")");
            }
        }
    }

}

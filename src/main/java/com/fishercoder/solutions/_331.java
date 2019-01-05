package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 331. Verify Preorder Serialization of a Binary Tree
 *
 * One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as #.

       _9_
      /    \
     3     2
    / \   / \
   4  1  #  6
  / \ / \  / \
  # # # #  # #

 For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.

 Given a string of comma separated values, verify whether it is a correct preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.

 Each comma separated value in the string must be either an integer or a character '#' representing null pointer.

 You may assume that the input format is always valid, for example it could never contain two consecutive commas such as "1,,3".

 Example 1:
 "9,3,4,#,#,1,#,#,2,#,6,#,#"
 Return true

 Example 2:
 "1,#"
 Return false

 Example 3:
 "9,#,#,1"
 Return false


 */
public class _331 {

    public static class Solution1 {
        public boolean isValidSerialization(String preorder) {
            /**Idea: we keep inserting the string into the stack, if it's a number, we just push it onto the stack;
             * if it's a "#", we see if the top of the stack is a "#" or not,
             * 1. if it's a "#", we pop it and keep popping numbers from the stack,
             * 2. if it's not a "#", we push the "#" onto the stack*/
            if (preorder == null || preorder.length() == 0) {
                return false;
            }
            String[] pre = preorder.split(",");
            Deque<String> stack = new ArrayDeque<>();
            for (int i = 0; i < pre.length; i++) {
                while (pre[i].equals("#") && !stack.isEmpty() && stack.peekLast().equals("#")) {
                    stack.pollLast();
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pollLast();
                }
                stack.addLast(pre[i]);
            }
            return stack.size() == 1 && stack.peekLast().equals("#");
        }
    }

}

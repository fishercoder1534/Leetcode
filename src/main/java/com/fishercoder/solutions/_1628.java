package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _1628 {
    public static class Solution1 {
        /**
         * Being able to think of resorting to Stack data structure is the key here to a straightforward solution.
         */

        public abstract static class Node {
            public abstract int evaluate();

            public abstract List<String> print(Node node, List<String> list);

            // define your fields here
            Node left;
            Node right;
            String val;
        }

        static class NodeImpl extends Node {

            @Override
            public int evaluate() {
                return dfs(this);
            }

            private int dfs(Node node) {
                if (node == null) {
                    return 0;
                }
                if (node.left == null && node.right == null) {
                    return Integer.parseInt(node.val);
                }
                String op = node.val;
                int left = dfs(node.left);
                int right = dfs(node.right);
                if (op.equals("+")) {
                    return left + right;
                } else if (op.equals("-")) {
                    return left - right;
                } else if (op.equals("*")) {
                    return left * right;
                } else {
                    return left / right;
                }
            }

            public NodeImpl(String val) {
                this.val = val;
            }

            @Override
            public List<String> print(Node node, List<String> list) {
                if (node == null) {
                    return list;
                }
                print(node.left, list);
                list.add(node.val);
                print(node.right, list);
                return list;
            }

        }

        public static class TreeBuilder {
            public Node buildTree(String[] postfix) {
                Deque<Node> stack = new LinkedList<>();
                for (String str : postfix) {
                    Node node = new NodeImpl(str);
                    if (!Character.isDigit(str.charAt(0))) {
                        node.right = stack.pollLast();
                        node.left = stack.pollLast();
                    }
                    stack.addLast(node);
                }
                return stack.pop();
            }

        }
    }
}

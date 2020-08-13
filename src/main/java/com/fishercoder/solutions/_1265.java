package com.fishercoder.solutions;

import java.util.Stack;

public class _1265 {

    interface ImmutableListNode {
        ImmutableListNode getNext();

        void printValue();
    }

    public static class Solution1 {
        public void printLinkedListInReverse(ImmutableListNode head) {
            Stack<ImmutableListNode> stack = new Stack();
            while (head != null) {
                stack.add(head);
                head = head.getNext();
            }
            while (!stack.isEmpty()) {
                head = stack.pop();
                head.printValue();
            }
        }
    }
}

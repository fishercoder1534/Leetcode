package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class _716 {
    public static class Solution1 {
        /**
         * This is O(n) for popMax() and pop() while O(1) for the other three operations which is UN-acceptable during an interview!
         * We need to do better than O(n) time complexity in order to ace the interview!
         * But O(1) is impossible, so let's aim for O(logn).
         */
        public static class MaxStack {

            private int max;
            private Stack<Integer> stack;

            /**
             * initialize your data structure here.
             */
            public MaxStack() {
                max = Integer.MIN_VALUE;
                stack = new Stack<>();
            }

            public void push(int x) {
                if (x > max) {
                    max = x;
                }
                stack.push(x);
            }

            public int pop() {
                if (stack.peek() == max) {
                    int result = stack.pop();
                    max = findMax();
                    return result;
                } else {
                    return stack.pop();
                }
            }

            private int findMax() {
                if (!stack.isEmpty()) {
                    Iterator<Integer> iterator = stack.iterator();
                    int max = stack.peek();
                    while (iterator.hasNext()) {
                        max = Math.max(max, iterator.next());
                    }
                    return max;
                } else {
                    max = Integer.MIN_VALUE;
                    return max;
                }
            }

            public int top() {
                return stack.peek();
            }

            public int peekMax() {
                return max;
            }

            public int popMax() {
                Stack<Integer> tmp = new Stack<>();
                int result = 0;
                while (!stack.isEmpty()) {
                    if (stack.peek() != max) {
                        tmp.push(stack.pop());
                    } else {
                        result = stack.pop();
                        break;
                    }
                }
                while (!tmp.isEmpty()) {
                    stack.push(tmp.pop());
                }
                max = findMax();
                return result;
            }
        }
    }

    public static class Solution2 {
        /**
         * Use a treemap and a doubly linked list to achieve O(logn) time complexity.
         */

        static class Node {
            int val;
            Node prev;
            Node next;

            public Node(int val) {
                this.val = val;
            }
        }

        static class DoublyLinkedList {
            Node head;
            Node tail;

            public DoublyLinkedList() {
                head = new Node(0);
                tail = new Node(0);
                head.next = tail;
                tail.prev = head;
            }

            public Node add(int val) {
                /**For this doubly linked list, we always add it to the end of the list*/
                Node x = new Node(val);
                x.next = tail;
                x.prev = tail.prev;
                tail.prev.next = x;
                tail.prev = tail.prev.next;
                return x;
            }

            public int pop() {
                /**for pop(), we always pop one from the tail of the doubly linked list*/
                return unlink(tail.prev).val;
            }

            public Node unlink(Node node) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                return node;
            }

            public int peek() {
                return tail.prev.val;
            }
        }

        public static class MaxStack {
            TreeMap<Integer, List<Node>> treeMap;
            /**
             * the reason we have a list of nodes as treemap's value is because one value could be pushed
             * multiple times into this MaxStack and we want to keep track of all of them.
             */
            DoublyLinkedList doublyLinkedList;

            /**
             * initialize your data structure here.
             */
            public MaxStack() {
                treeMap = new TreeMap();
                doublyLinkedList = new DoublyLinkedList();
            }

            public void push(int x) {
                Node node = doublyLinkedList.add(x);
                if (!treeMap.containsKey(x)) {
                    treeMap.put(x, new ArrayList<>());
                }
                treeMap.get(x).add(node);
            }

            public int pop() {
                int val = doublyLinkedList.pop();
                List<Node> nodes = treeMap.get(val);
                nodes.remove(nodes.size() - 1);
                if (nodes.isEmpty()) {
                    treeMap.remove(val);
                }
                return val;
            }

            public int top() {
                return doublyLinkedList.peek();
            }

            public int peekMax() {
                return treeMap.lastKey();
            }

            public int popMax() {
                int max = treeMap.lastKey();
                List<Node> nodes = treeMap.get(max);
                Node node = nodes.remove(nodes.size() - 1);
                doublyLinkedList.unlink(node);
                if (nodes.isEmpty()) {
                    treeMap.remove(max);
                }
                return max;
            }
        }
    }

    public static class Solution3 {
        /**
         * My completely original solution on 10/25/2021.
         * popMax() takes O(n) time, all other operations take O(1) time.
         */

        public static class MaxStack {

            Deque<int[]> stack;
            Deque<int[]> tmp;

            public MaxStack() {
                stack = new LinkedList<>();
                tmp = new LinkedList<>();
            }

            public void push(int x) {
                if (stack.isEmpty()) {
                    stack.addLast(new int[]{x, x});
                } else {
                    int[] last = stack.peekLast();
                    stack.addLast(new int[]{x, Math.max(last[1], x)});
                }
            }

            public int pop() {
                return stack.pollLast()[0];
            }

            public int top() {
                return stack.peekLast()[0];
            }

            public int peekMax() {
                return stack.peekLast()[1];
            }

            public int popMax() {
                tmp.clear();
                while (stack.peekLast()[0] != stack.peekLast()[1]) {
                    tmp.addLast(stack.pollLast());
                }
                int[] max = stack.pollLast();
                while (!tmp.isEmpty()) {
                    int[] curr = tmp.pollLast();
                    if (!stack.isEmpty()) {
                        stack.addLast(new int[]{curr[0], Math.max(curr[0], stack.peekLast()[1])});
                    } else {
                        stack.addLast(new int[]{curr[0], curr[0]});
                    }
                }
                return max[0];
            }
        }
    }
}

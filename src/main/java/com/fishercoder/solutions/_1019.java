package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1019 {
    public static class Solution1 {
        public int[] nextLargerNodes(ListNode head) {
            int len = findLength(head);
            int[] result = new int[len];
            ListNode tmp = head;
            int i = 0;
            while (tmp != null) {
                result[i++] = findNextLarger(tmp.val, tmp);
                tmp = tmp.next;
            }
            return result;
        }

        private int findNextLarger(int val, ListNode head) {
            ListNode tmp = head.next;
            while (tmp != null) {
                if (tmp.val > val) {
                    return tmp.val;
                }
                tmp = tmp.next;
            }
            return 0;
        }

        private int findLength(ListNode head) {
            ListNode tmp = head;
            int count = 0;
            while (tmp != null) {
                tmp = tmp.next;
                count++;
            }
            return count;
        }
    }
    public static class Solution2 {
        // Store the nodes of linked list into an array list
        // Create a stack that stores indexes, which would be needed to find the next greater element of
        // element at index i
        public int[] nextLargerNodes(ListNode head) {
            List<Integer> numList = new ArrayList<>();

            for (ListNode temp = head; temp != null; temp = temp.next) {
                numList.add(temp.val);
            }
            Stack<Integer> stack = new Stack<>();
            int result[] = new int[numList.size()];
            for (int i = 0; i < numList.size(); i++) {

                while (!stack.isEmpty() && numList.get(stack.peek()) < numList.get(i)) {
                    result[stack.pop()] = numList.get(i);
                }
                stack.push(i);
            }
            return result;
        }
    }
}

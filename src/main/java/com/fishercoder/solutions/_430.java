package com.fishercoder.solutions;

import com.fishercoder.common.classes.DoublyLinkedNode;

/**
 * Idea is to implement a recursive strategy by calling the recursiveFlatten() method, recursively on the child node of the parent Node
 *
 */
public class _430 {
    public static class Solution{
        private DoublyLinkedNode recursiveFlatten(DoublyLinkedNode head){
            DoublyLinkedNode current = head, tail = head;
            while(current != null){
                DoublyLinkedNode child = current.child;
                DoublyLinkedNode next = current.next;
                if(child != null){
                    DoublyLinkedNode output = recursiveFlatten(child);
                    output.next = next;
                    if(next != null)
                        next.prev = output;
                    current.next = child;
                    child.prev = current;
                    current.child = null;
                }
                else{
                    current = next;
                }
                if(current != null){
                    tail = current;
                }
            }
            return tail;
        }
        public DoublyLinkedNode flatten(DoublyLinkedNode head) {
            if(head != null)
                recursiveFlatten(head);
            return head;
        }
    }
}

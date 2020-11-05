package com.fishercoder.common.classes;

public class DoublyLinkedNode {
    public int val;
    public DoublyLinkedNode next;
    public DoublyLinkedNode prev;
    public DoublyLinkedNode child;
    public DoublyLinkedNode(int i) {
        this.val = i;
    }

    public int val() {
        return val;
    }
}

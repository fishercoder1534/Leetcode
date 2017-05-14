package com.stevesun.solutions;

import java.util.HashMap;
import java.util.Map;

/**Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

 For example, given the following matrix:

 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0
 Return 4.
 */
public class _146_use_DoublyLinkedList_plus_HashMap {
    private class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            this.key = k;
            this.value = v;
        }

        Node() {
            this.key = 0;
            this.value = 0;
        }
    }

    private int capacity;
    private int count;
    private Node head, tail;
    private Map<Integer, Node> map;// ATTN: the value should be Node type! This is the whole point
                                   // of having a class called Node!

    public _146_use_DoublyLinkedList_plus_HashMap(int capacity) {
        this.capacity = capacity;
        this.count = 0;// we need a count to keep track of the number of elements in the cache so
                       // that we know when to evict the LRU one from the cache
        this.map = new HashMap();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);// HashMap allows value to be null, this is superior than
                                 // HashTable!
        if (node == null) {
            return -1;
        } else {
            update(node);
            return node.value;
        }
    }

    public void set(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node(key, value);
            map.put(key, node);
            add(node);
            count++;

            if (count > capacity) {
                // ATTN: It's tail.prev, not tail, because tail is always an invalid node, it
                // doesn't contain anything, it's always the tail.prev that is the last node in the
                // cache
                Node toDelete = tail.prev;
                map.remove(toDelete.key);
                remove(toDelete);
                count--;
            }
        } else {
            remove(node);
            node.value = value;
            add(node);
        }
    }

    private void update(Node node) {
        // this simplifies the process, just do two operations, remove the old node first, and then
        // just add the node again
        // this will guarantee that this node will be at the latest position: the most recently used
        // position.
        remove(node);
        add(node);
    }

    private void remove(Node node) {
        Node next = node.next, prev = node.prev;
        prev.next = next;
        next.prev = prev;
    }

    private void add(Node node) {// ATTN: we'll always add the node into the first position:
                                 // head.next!!!!
        Node next = head.next;
        head.next = node;
        node.next = next;
        node.prev = head;
        next.prev = node;
    }

}

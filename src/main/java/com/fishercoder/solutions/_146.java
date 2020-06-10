package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU Cache
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

 get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 put(key, value) - Set or insert the value if the key is not already present.
 When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

 Follow up:
 Could you do both operations in O(1) time complexity?

 Example:

 LRUCache cache = new LRUCache(2);//capacity

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4
        */

public class _146 {

    public class Solution1 {
        public class LRUCache {
            /**
             * The shortest implementation is to use LinkedHashMap:
             * specify a size of the LinkedHashMap;
             * override the removeEldestEntry method when its size exceeds max size:
             * https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#removeEldestEntry-java.util.Map.Entry-
             * in the constructor, set the last boolean variable to be true: it means the ordering mode,
             * if we set it to be true, it means in access order, false, means it's in insertion order:
             * https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#LinkedHashMap-int-float-boolean-
             */

            private Map<Integer, Integer> cache;
            private final int max;

            public LRUCache(int capacity) {
                max = capacity;
                cache = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true) {
                    public boolean removeEldestEntry(Map.Entry eldest) {
                        return cache.size() > max;
                    }
                };
            }

            public int get(int key) {
                return cache.getOrDefault(key, -1);
            }

            public void put(int key, int value) {
                cache.put(key, value);
            }
        }
    }

    public class Solution2 {
        public class LRUCache {
            /**
             * The more verbose solution is to write a doubly linked list plus a map.
             */
            private class Node {
                int key;
                int value;

                LRUCache.Node prev;
                LRUCache.Node next;

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
            private LRUCache.Node head;
            private LRUCache.Node tail;
            private Map<Integer, LRUCache.Node> map;
            // ATTN: the value should be Node type! This is the whole point of having a class called Node!

            public LRUCache(int capacity) {
                this.capacity = capacity;
                this.count = 0;// we need a count to keep track of the number of elements in the cache so
                // that we know when to evict the LRU one from the cache
                this.map = new HashMap();
                head = new LRUCache.Node();
                tail = new LRUCache.Node();
                head.next = tail;
                tail.prev = head;
            }

            public int get(int key) {
                LRUCache.Node node = map.get(key);
                // HashMap allows value to be null, this is superior than HashTable!
                if (node == null) {
                    return -1;
                } else {

                    /**Do two operations: this makes the process more clear:
                     * remove the old node first, and then
                     * just add the node again.
                     * This will guarantee that this node will be at the latest position:
                     * the most recently used position.*/
                    remove(node);
                    add(node);

                    return node.value;
                }
            }

            public void put(int key, int value) {
                LRUCache.Node node = map.get(key);
                if (node == null) {
                    node = new LRUCache.Node(key, value);
                    map.put(key, node);
                    add(node);
                    count++;

                    if (count > capacity) {
                        /** ATTN: It's tail.prev, not tail, because tail is always an invalid node, it
                         doesn't contain anything, it's always the tail.prev that is the last node in the
                         cache*/
                        LRUCache.Node toDelete = tail.prev;
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

            private void remove(LRUCache.Node node) {
                LRUCache.Node next = node.next;
                LRUCache.Node prev = node.prev;
                prev.next = next;
                next.prev = prev;
            }

            private void add(LRUCache.Node node) {
                // ATTN: we'll always add the node into the first position: head.next!!!!
                LRUCache.Node next = head.next;
                head.next = node;
                node.next = next;
                node.prev = head;
                next.prev = node;
            }
        }
    }
}
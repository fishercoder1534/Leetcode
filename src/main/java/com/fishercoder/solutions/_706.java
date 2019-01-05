package com.fishercoder.solutions;

/**706. Design HashMap
 *
 * Design a HashMap without using any built-in hash table libraries.
 *
 * To be specific, your design should include these functions:
 *
 * put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
 * get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
 *
 * Example:
 *
 * MyHashMap hashMap = new MyHashMap();
 * hashMap.put(1, 1);
 * hashMap.put(2, 2);
 * hashMap.get(1);            // returns 1
 * hashMap.get(3);            // returns -1 (not found)
 * hashMap.put(2, 1);          // update the existing value
 * hashMap.get(2);            // returns 1
 * hashMap.remove(2);          // remove the mapping for 2
 * hashMap.get(2);            // returns -1 (not found)
 *
 * Note:
 *
 * All keys and values will be in the range of [0, 1000000].
 * The number of operations will be in the range of [1, 10000].
 * Please do not use the built-in HashMap library.*/
public class _706 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/design-hashmap/discuss/152746/Java-Solution
         */
        class MyHashMap {

            final ListNode[] nodes = new ListNode[10000];

            public void put(int key, int value) {
                int i = idx(key);
                if (nodes[i] == null) {
                    nodes[i] = new ListNode(-1, -1);
                }
                ListNode prev = find(nodes[i], key);
                if (prev.next == null) {
                    prev.next = new ListNode(key, value);
                } else {
                    prev.next.val = value;
                }
            }

            public int get(int key) {
                int i = idx(key);
                if (nodes[i] == null) {
                    return -1;
                }
                ListNode node = find(nodes[i], key);
                return node.next == null ? -1 : node.next.val;
            }

            public void remove(int key) {
                int i = idx(key);
                if (nodes[i] == null) {
                    return;
                }
                ListNode prev = find(nodes[i], key);
                if (prev.next == null) {
                    return;
                }
                prev.next = prev.next.next;
            }

            int idx(int key) {
                return Integer.hashCode(key) % nodes.length;
            }

            ListNode find(ListNode bucket, int key) {
                ListNode node = bucket;
                ListNode prev = null;
                while (node != null && node.key != key) {
                    prev = node;
                    node = node.next;
                }
                return prev;
            }

            class ListNode {
                int key;
                int val;
                ListNode next;

                ListNode(int key, int val) {
                    this.key = key;
                    this.val = val;
                }
            }
        }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
    }
}

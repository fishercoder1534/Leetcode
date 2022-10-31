package com.fishercoder.solutions;

import java.util.Arrays;

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
    }

    public static class Solution2 {

        public static class MyHashMap {
            /**
             * Considering the given constraints for this problem on LeetCode, load factors and resizing/rehashing are not considered. Thus an EASY problem.
             * <p>
             * inspired by: https://leetcode.com/problems/design-hashmap/discuss/225312/hashmaparraylinkedlistcollision
             */
            class Node {
                /**
                 * We need to have both key and val in this ListNode because all values input key are hashed to the same bucket, so we need its original key
                 * to be a differentiator within this bucket.
                 */
                int val;
                int key;
                Node next;

                public Node(int key, int val) {
                    this.key = key;
                    this.val = val;
                }
            }

            Node[] nodes;
            int size = 1000000;

            /**
             * Initialize your data structure here.
             */
            public MyHashMap() {
                nodes = new Node[size];
            }

            /**
             * value will always be non-negative.
             */
            public void put(int key, int value) {
                int index = getHashedKey(key);
                Node head = nodes[index];
                Node tmp = head;
                while (tmp != null) {
                    if (tmp.key == key) {
                        tmp.val = value;
                        return;
                    }
                    tmp = tmp.next;
                }
                Node newHead = new Node(key, value);
                newHead.next = head;
                nodes[index] = newHead;
            }

            private int getHashedKey(int key) {
                return Integer.hashCode(key) % size;
            }

            /**
             * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
             */
            public int get(int key) {
                Node head = nodes[getHashedKey(key)];
                Node tmp = head;
                while (tmp != null && tmp.key != key) {
                    tmp = tmp.next;
                }
                if (tmp == null) {
                    return -1;
                }
                if (tmp.key == key) {
                    return tmp.val;
                }
                return -1;
            }

            /**
             * Removes the mapping of the specified value key if this map contains a mapping for the key
             */
            public void remove(int key) {
                /**We can just set the value of this key to -1 since the constraint for this problem is that all values are >= 0*/
                Node node = nodes[getHashedKey(key)];
                Node tmp = node;
                Node pre = new Node(-1, -1);
                pre.next = tmp;
                while (tmp != null) {
                    if (tmp.key == key) {
                        tmp.val = -1;
                        return;
                    }
                    tmp = tmp.next;
                }
            }
        }
    }

    public static class Solution3 {
        /**
         * My completely original, but hacky and cheaty solution to take full advantage of the problem constraints.
         */
        public static class MyHashMap {

            int[] map;

            public MyHashMap() {
                map = new int[1000001];
                Arrays.fill(map, -1);
            }

            public void put(int key, int value) {
                map[key] = value;
            }

            public int get(int key) {
                return map[key];
            }

            public void remove(int key) {
                map[key] = -1;
            }
        }
    }
}

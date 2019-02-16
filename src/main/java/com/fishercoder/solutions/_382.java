package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**382. Linked List Random Node
 *
Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Follow up:
What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

Example:

// Init a singly linked list [1,2,3].
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
solution.getRandom();
*/
public class _382 {

    public static class Solution1 {
        private Map<Integer, ListNode> map;
        private Random rand;

        /**
         * @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node.
         */
        public Solution1(ListNode head) {
            map = new HashMap();
            rand = new Random();
            int i = 0;
            while (head != null) {
                map.put(i++, head);
                head = head.next;
            }
        }

        /**
         * Returns a random node's value.
         */
        public int getRandom() {
            return map.get(rand.nextInt(map.size())).val;
        }
    }
}


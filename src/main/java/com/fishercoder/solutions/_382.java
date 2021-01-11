package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _382 {

    public static class Solution {
        private Map<Integer, ListNode> map;
        private Random rand;

        /**
         * @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node.
         */
        public Solution(ListNode head) {
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


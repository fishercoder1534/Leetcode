package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _817 {
    public static class Solution1 {
        public int numComponents(ListNode head, int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            int total = 0;
            ListNode cur = head;
            while (cur != null) {
                //if the set contains this value: then it's either the head, or the previous node wasn't in the subset, so we found the beginning of a new component
                if (set.contains(cur.val) && (cur == head || !set.contains(head.val))) {
                    total++;
                }
                //use head to keep track of the previous node
                head = cur;
                cur = cur.next;
            }
            return total;
        }
    }

    public static class Solution2 {
        /**
         * This one is even simpler.
         */
        public int numComponents(ListNode head, int[] nums) {
            boolean inComponent = false;
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            int count = 0;
            while (head != null) {
                if (set.contains(head.val)) {
                    if (!inComponent) {
                        inComponent = true;
                        count++;
                    }
                } else {
                    inComponent = false;
                }
                head = head.next;
            }
            return count;
        }
    }
}

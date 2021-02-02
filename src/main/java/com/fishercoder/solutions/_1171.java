package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.*;

public class _1171 {
    public static class Solution1 {
        /**
         * I keep shrinking the array whenever I found there's a range of sum that equals to zero
         * until the size of the list doesn't change any more.
         * This is probably not super efficient, but accepted on LeetCode.
         */
        public ListNode removeZeroSumSublists(ListNode head) {
            List<Integer> list = convertToList(head);
            int size;
            do {
                size = list.size();
                list = shrinkList(list);
            } while (list.size() != size);
            return recoverLinkedList(list);
        }

        private ListNode recoverLinkedList(List<Integer> list) {
            ListNode pre = new ListNode(-1);
            ListNode tmp = pre;
            for (int i = 0; i < list.size(); i++) {
                tmp.next = new ListNode(list.get(i));
                tmp = tmp.next;
            }
            return pre.next;
        }

        private List<Integer> convertToList(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                if (head.val != 0) {
                    //if it's zero, we'll just ignore it, this can help us take care of the zero values
                    list.add(head.val);
                }
                head = head.next;
            }
            return list;
        }

        private List<Integer> shrinkList(List<Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                int start = i;
                List<Integer> preSumList = new ArrayList<>();
                for (int k = 0; k < start; k++) {
                    preSumList.add(0);
                }
                preSumList.add(list.get(i));
                for (int k = i; k < list.size(); k++) {
                    if (k > start) {
                        Integer sum = preSumList.get(k - 1) + list.get(k);
                        if (sum == 0) {
                            List<Integer> shrinkedList = new ArrayList<>();
                            for (int j = 0; j < start; j++) {
                                shrinkedList.add(list.get(j));
                            }
                            for (int j = k + 1; j < list.size(); j++) {
                                shrinkedList.add(list.get(j));
                            }
                            return shrinkedList;
                        } else {
                            preSumList.add(sum);
                        }
                    }
                }
            }
            return list;
        }
    }
}

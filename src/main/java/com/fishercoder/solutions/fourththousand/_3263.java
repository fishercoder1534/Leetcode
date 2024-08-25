package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3263 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
    }

    public static class Solution1 {
        public int[] toArray(Node head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            return list.stream().mapToInt(integer -> integer).toArray();
        }
    }
}

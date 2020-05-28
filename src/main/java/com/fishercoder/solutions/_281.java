package com.fishercoder.solutions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _281 {

    public static class Solution1 {
        public static class ZigzagIterator {
            private Iterator<Integer> i;
            private Iterator<Integer> j;
            private Iterator<Integer> tmp;

            public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
                i = v2.iterator();
                j = v1.iterator();
            }

            public int next() {
                if (j.hasNext()) {
                    tmp = j;
                    j = i;
                    i = tmp;
                }
                return i.next();
            }

            public boolean hasNext() {
                return i.hasNext() || j.hasNext();
            }
        }
    }

    public static class Solution2 {
        public static class ZigzagIterator {

            Queue<Iterator<Integer>> queue;

            public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
                queue = new LinkedList<>();
                if (v1 != null && !v1.isEmpty()) {
                    Iterator<Integer> iterator1 = v1.iterator();
                    queue.offer(iterator1);
                }
                if (v2 != null && !v2.isEmpty()) {
                    Iterator<Integer> iterator2 = v2.iterator();
                    queue.offer(iterator2);
                }
            }

            public boolean hasNext() {
                return !queue.isEmpty();
            }

            public int next() {
                Iterator<Integer> iterator = queue.poll();
                int next = iterator.next();
                if (iterator.hasNext()) {
                    queue.offer(iterator);
                }
                return next;
            }
        }
    }
}

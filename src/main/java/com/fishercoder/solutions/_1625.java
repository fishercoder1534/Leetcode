package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _1625 {
    public static class Solution1 {
        public String findLexSmallestString(String s, int a, int b) {
            Queue<String> queue = new LinkedList<>();
            Set<String> seen = new HashSet<>();
            queue.offer(s);
            String smallest = s;
            while (!queue.isEmpty()) {
                String current = queue.poll();
                //add
                char[] c = current.toCharArray();
                for (int i = 1; i < c.length; i++) {
                    if (i % 2 == 1) {
                        c[i] = (char) (((Integer.parseInt(String.valueOf(c[i])) + a) % 10) + '0');
                    }
                }
                String next = new String(c);
                if (smallest.compareTo(next) > 0) {
                    smallest = next;
                }
                if (seen.add(next)) {
                    queue.add(next);
                }
                //rotate
                next = next.substring(next.length() - b) + next.substring(0, next.length() - b);
                if (seen.add(next)) {
                    queue.add(next);
                }
                if (smallest.compareTo(next) > 0) {
                    smallest = next;
                }
            }
            return smallest;
        }
    }
}

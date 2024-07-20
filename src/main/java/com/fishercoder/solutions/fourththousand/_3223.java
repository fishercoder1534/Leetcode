package com.fishercoder.solutions.fourththousand;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _3223 {
    public static class Solution1 {
        public int minimumLength(String s) {
            Map<Character, Integer> map = new HashMap<>();
            Deque<Character> stack = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!map.containsKey(c) || map.get(c) < 2) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                    stack.addLast(c);
                } else {
                    Deque<Character> tmpStack = new LinkedList<>();
                    int removedCount = 0;
                    while (!stack.isEmpty()) {
                        Character last = stack.pollLast();
                        if (last == c) {
                            map.put(c, map.get(c) - 1);
                            if (map.get(c) == 0) {
                                map.remove(c);
                            }
                            removedCount++;
                            if (removedCount == 2) {
                                break;
                            }
                        } else {
                            tmpStack.addLast(last);
                        }
                    }
                    while (!tmpStack.isEmpty()) {
                        stack.addLast(tmpStack.pollLast());
                    }
                    stack.addLast(c);
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pollFirst());
            }
            return sb.toString().length();
        }
    }
}

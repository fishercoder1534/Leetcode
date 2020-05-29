package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class _301 {

    public static class Solution1 {

        public List<String> removeInvalidParentheses(String s) {
            List<String> result = new ArrayList<>();
            if (s == null) {
                return result;
            }

            Set<String> visited = new HashSet();
            Queue<String> q = new LinkedList();

            q.offer(s);
            visited.add(s);

            boolean found = false;

            while (!q.isEmpty()) {
                String curr = q.poll();
                if (isValid(curr)) {
                    found = true;
                    result.add(curr);
                }

                if (found) {
                    continue;//this means if the initial input is already a valid one, we'll just directly return it and there's actually only one valid result
                }

                for (int i = 0; i < curr.length(); i++) {
                    if (curr.charAt(i) != '(' && curr.charAt(i) != ')') {
                        continue;//this is to rule out those non-parentheses characters
                    }

                    String next = curr.substring(0, i) + curr.substring(i + 1);
                    if (!visited.contains(next)) {
                        q.offer(next);
                        visited.add(next);
                    }
                }

            }
            return result;
        }

        private boolean isValid(String str) {
            char[] chars = str.toCharArray();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c == '(') {
                    count++;
                }
                if (c == ')') {
                    count--;
                    if (count == -1) {
                        return false;
                    }
                }
            }
            return count == 0;
        }
    }
}

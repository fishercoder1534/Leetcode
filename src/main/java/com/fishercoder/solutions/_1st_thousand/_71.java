package com.fishercoder.solutions._1st_thousand;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class _71 {

    public static class Solution1 {
        /**
         * For LinkedList class in Java, if you use pop(), then you'll have to use push() as its corresponding method to remove from the "top" of the stack, using pollLast() will not work.
         */
        public String simplifyPath(String path) {
            Deque<String> stack = new LinkedList<>();
            Set<String> skipSet = new HashSet<>(Arrays.asList("..", ".", ""));
            for (String dir : path.split("/")) {
                if (dir.equals("..") && !stack.isEmpty()) {
                    stack.pop();
                } else if (!skipSet.contains(dir)) {
                    stack.push(dir);
                }
            }
            String result = "";
            for (String dir : stack) {
                result = "/" + dir + result;
            }
            return result.isEmpty() ? "/" : result;
        }
    }

    public static class Solution2 {
        /**
         * This solution doesn't vary too much from the above one, except in that it's using pollLast() and addLast() instead of pop() and push().
         * Key notes:
         * if using pollLast, then it must be consistent across all calls, including peekLast() and addLast(), cannot mix with pop() and push(), otherwise, unexpected/undesired results will happen.
         */
        public String simplifyPath(String path) {
            Set<String> skip = new HashSet(Arrays.asList("..", ".", ""));
            Deque<String> stack = new LinkedList();
            String[] directories = path.split("/");
            for (String dir : directories) {
                if (dir.equals("..") && !stack.isEmpty()) {
                    stack.pollLast();
                } else if (!skip.contains(dir)) {
                    stack.addLast(dir);
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append("/");
                sb.append(stack.pollFirst());
            }
            return sb.length() == 0 ? "/" : sb.toString();
        }
    }
}

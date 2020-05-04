package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class _71 {

    public static class Solution1 {
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
}

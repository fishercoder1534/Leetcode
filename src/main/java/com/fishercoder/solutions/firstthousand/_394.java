package com.fishercoder.solutions.firstthousand;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class _394 {

    public static class Solution1 {
        public String decodeString(String s) {
            Stack<Integer> count = new Stack<>();
            Stack<String> str = new Stack<>();

            int idx = 0;
            str.push("");

            while (idx < s.length()) {
                if (s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
                    int start = idx;
                    while (s.charAt(idx + 1) >= '0' && s.charAt(idx + 1) <= '9') {
                        idx++;
                    }
                    count.push(Integer.parseInt(s.substring(start, idx + 1)));
                } else if (s.charAt(idx) == '[') {
                    str.push("");
                } else if (s.charAt(idx) == ']') {
                    String st = str.pop();
                    StringBuilder sb = new StringBuilder();
                    int n = count.pop();
                    for (int j = 0; j < n; j++) {
                        sb.append(st);
                    }
                    str.push(str.pop() + sb.toString());
                } else {
                    str.push(str.pop() + s.charAt(idx));
                }
                idx++;
            }
            return str.pop();
        }
    }

    public static class Solution2 {
        /** My completely original solution on 7/27/2026 */
        public String decodeString(String s) {
            Deque<String> stack = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ']') {
                    StringBuilder sb = new StringBuilder();
                    while (!stack.isEmpty() && !stack.peek().equals("[")) {
                        sb.append(stack.pop());
                    }
                    stack.pop(); // pop '['
                    String str = sb.toString();
                    int times = Integer.parseInt(stack.pop());
                    sb.setLength(0);
                    while (times-- > 0) {
                        sb.append(str);
                    }
                    stack.push(sb.toString());
                } else if (Character.isDigit(s.charAt(i))) {
                    StringBuilder sb = new StringBuilder();
                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        sb.append(s.charAt(i++));
                    }
                    i--;
                    int times = Integer.parseInt(sb.toString());
                    stack.push(String.valueOf(times));
                } else {
                    stack.push(s.charAt(i) + "");
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }
}

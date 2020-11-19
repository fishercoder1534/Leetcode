package com.fishercoder.solutions;

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
}

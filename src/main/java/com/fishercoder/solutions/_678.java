package com.fishercoder.solutions;

import java.util.Stack;

public class _678 {
    public static class Solution1 {
        /**
         * This solution is correct, but will result in TLE by test4
         */
        public boolean checkValidString(String s) {
            if (!s.contains("*")) {
                Stack<Character> stack = new Stack();
                int i = 0;
                while (i < s.length()) {
                    if (s.charAt(i) == '(') {
                        stack.push(s.charAt(i));
                    } else {
                        if (stack.isEmpty()) {
                            return false;
                        } else {
                            stack.pop();
                        }
                    }
                    i++;
                }
                return stack.isEmpty();
            } else {
                int index = s.indexOf("*");
                String transformedS = s.substring(0, index) + s.substring(index + 1);
                if (checkValidString(transformedS)) {
                    return true;
                }
                transformedS = s.substring(0, index) + "(" + s.substring(index + 1);
                if (checkValidString(transformedS)) {
                    return true;
                }
                transformedS = s.substring(0, index) + ")" + s.substring(index + 1);
                if (checkValidString(transformedS)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class Solution2 {
        public boolean checkValidString(String s) {
            return isValid(s, 0, 0);
        }

        private boolean isValid(String s, int start, int cnt) {
            if (cnt < 0) {
                return false;
            }
            for (int i = start; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    cnt++;
                } else if (c == ')') {
                    if (cnt <= 0) {
                        return false;
                    }
                    cnt--;
                } else if (c == '*') {
                    /**Extra caution: start should be i+1, not start+1 !*/
                    return isValid(s, i + 1, cnt + 1)
                            || isValid(s, i + 1, cnt - 1)
                            || isValid(s, i + 1, cnt);
                }
            }
            return cnt == 0;
        }
    }

    public static class Solution3 {
        /**
         * Greedy solution:
         * 1. Let lo mean the lowest possible open left paren
         * 2. Let hi mean the possibilities of highest possible open left paren, so as long as s.charAt(i) != ')', it's possible to be a '(', so we'll increment hi by 1
         * 2. If at any time, hi becomes negative, that means this string will never be valid
         * 3. Each time, we'll let lo be at a minimum of zero
         */
        public boolean checkValidString(String s) {
            int lo = 0;
            int hi = 0;
            for (int i = 0; i < s.length(); i++) {
                lo += s.charAt(i) == '(' ? 1 : -1;
                hi += s.charAt(i) != ')' ? 1 : -1;
                if (hi < 0) {
                    break;
                }
                lo = Math.max(0, lo);
            }
            return lo == 0;
        }
    }
}

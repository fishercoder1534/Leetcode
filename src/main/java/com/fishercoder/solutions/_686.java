package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _686 {
    public static class Solution1 {
        public int repeatedStringMatch(String A, String B) {
            Set<Character> set = new HashSet<>();
            for (char c : A.toCharArray()) {
                set.add(c);
            }
            for (char c : B.toCharArray()) {
                if (!set.contains(c)) {
                    return -1;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(A);
            for (int i = 0; i < B.length(); i++) {
                if (stringBuilder.toString().contains(B)) {
                    return i + 1;
                }
                stringBuilder.append(A);
            }
            return -1;
        }
    }

    public static class Solution2 {
        /**
         * Time: O(N(N+M))
         * Space: O(N + M)
         */
        public int repeatedStringMatch(String A, String B) {
            int count = 1;
            StringBuilder sb = new StringBuilder(A);
            for (; sb.length() < B.length(); count++) {
                sb.append(A);
            }
            if (sb.indexOf(B) >= 0) {
                return count;
            }
            sb.append(A);
            if (sb.indexOf(B) >= 0) {
                return count + 1;
            }
            return -1;
        }
    }
}

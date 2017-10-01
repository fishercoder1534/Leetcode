package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 686. Repeated String Match
 *
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it.
 * If no such solution, return -1.
 * For example, with A = "abcd" and B = "cdabcdab".
 * Return 3, because by repeating A three times (“abcdabcdabcd”),
 * B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

 Note:
 The length of A and B will be between 1 and 10000.
 */

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
         * */
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

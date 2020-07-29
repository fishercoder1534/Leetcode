package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _893 {

    public static class Solution1 {
        /**
         * my original solution, a bit lengthy:
         * generate a unique signaure as key for each equivelant group and sum them up
         */
        public int numSpecialEquivGroups(String[] A) {
            return Arrays.stream(A).map(this::getCommonKey).collect(Collectors.toSet()).size();
        }

        private String getCommonKey(String word) {
            char[] oddIndexed = new char[word.length() / 2];
            char[] evenIndexed = new char[word.length() / 2 + (word.length() % 2 == 0 ? 0 : 1)];
            char[] array = word.toCharArray();
            for (int i = 0; i < array.length - 1; i += 2) {
                evenIndexed[i / 2] = array[i];
                oddIndexed[i / 2] = array[i + 1];
            }
            if (word.length() % 2 != 0) {
                evenIndexed[evenIndexed.length - 1] = array[array.length - 1];
            }
            Arrays.sort(oddIndexed);
            Arrays.sort(evenIndexed);
            return new StringBuffer().append(new String(evenIndexed)).append(new String(oddIndexed)).toString();
        }
    }

    public static class Solution2 {
        /**
         * more concise solution: https://leetcode.com/problems/groups-of-special-equivalent-strings/discuss/163413/Java-Concise-Set-Solution
         * but somehow a bit slower than mine: 12 ms vs 7ms
         * I guess due to the problem constraint and this: "1 <= A[i].length <= 20" to have made this problem simpler
         */
        public int numSpecialEquivGroups(String[] A) {
            Set<String> set = new HashSet<>();
            for (String str : A) {
                int[] odd = new int[26];
                int[] even = new int[26];
                for (int i = 0; i < str.length(); i++) {
                    if (i % 2 == 0) {
                        even[str.charAt(i) - 'a']++;
                    } else {
                        odd[str.charAt(i) - 'a']++;
                    }
                }
                String key = Arrays.toString(even) + Arrays.toString(odd);
                set.add(key);
            }
            return set.size();
        }
    }
}

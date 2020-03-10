package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 893. Groups of Special-Equivalent Strings
 *
 * You are given an array A of strings.
 * A move onto S consists of swapping any two even indexed characters of S, or any two odd indexed characters of S.
 * Two strings S and T are special-equivalent if after any number of moves onto S, S == T.
 * For example, S = "zzxy" and T = "xyzz" are special-equivalent because we may make the moves "zzxy" -> "xzzy" -> "xyzz"
 * that swap S[0] and S[2], then S[1] and S[3].
 *
 * Now, a group of special-equivalent strings from A is a non-empty subset of A such that:
 * Every pair of strings in the group are special equivalent, and;
 * The group is the largest size possible (ie., there isn't a string S not in the group such that S is special equivalent to every string in the group)
 * Return the number of groups of special-equivalent strings from A.
 *
 * Example 1:
 * Input: ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
 * Output: 3
 * Explanation:
 * One group is ["abcd", "cdab", "cbad"], since they are all pairwise special equivalent, and none of the other strings are all pairwise special equivalent to these.
 * The other two groups are ["xyzz", "zzxy"] and ["zzyx"].  Note that in particular, "zzxy" is not special equivalent to "zzyx".
 *
 * Example 2:
 * Input: ["abc","acb","bac","bca","cab","cba"]
 * Output: 3
 *
 * Note:
 * 1 <= A.length <= 1000
 * 1 <= A[i].length <= 20
 * All A[i] have the same length.
 * All A[i] consist of only lowercase letters.
 * */
public class _893 {
    
    public static class Solution1 {
        /**my original solution, a bit lengthy:
         * generate a unique signaure as key for each equivelant group and sum them up*/
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

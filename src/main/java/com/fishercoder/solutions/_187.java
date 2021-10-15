package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _187 {
    public static class Solution1 {
        public List<String> findRepeatedDnaSequences(String s) {
            Map<String, Integer> map = new HashMap();
            for (int i = 0; i < s.length() - 9; i++) {
                String sequence = s.substring(i, i + 10);
                map.put(sequence, map.getOrDefault(sequence, 0) + 1);
            }
            List<String> repeatedSequences = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    repeatedSequences.add(entry.getKey());
                }
            }
            return repeatedSequences;
        }
    }

    public static class Solution2 {
        /**
         * Use Rolling Hash/Rabin-Karp algorithm to significantly speed up the search.
         *
         * Rolling Hash/Rabin-Karp algorithm:
         * Instead of comparing the entire string to the other, we compare only the hash after adding the incoming character
         * and removing the outgoing character, this could be done in constant time.
         * Back to this problem, since there are only 4 characters, we only need 2 bits to represent each character:
         * 00 -> A
         * 01 -> C
         * 10 -> G
         * 11 -> T
         * so for a DNA sequence that is 10 character long, a total of 10 * 2 = 20 bits is good enough, this is much smaller than
         * an Integer (32-bit) in most modern programming languages, so using one integer could well represent one DNA sequence.
         * Thus we could do bit manipulation to implement the removal of the outgoing character and the addition of the incoming character.
         *
         * <<= 2 will shift the integer to the left, i.e. removing the outgoing character;
         * |= val will add the incoming character.
         */
        public List<String> findRepeatedDnaSequences(String s) {
            Set<Integer> seen1stTime = new HashSet<>();
            Set<Integer> seen2ndTime = new HashSet<>();
            List<String> ans = new ArrayList<>();
            char[] map = new char[26];
            map['A' - 'A'] = 0;
            map['C' - 'A'] = 1;
            map['G' - 'A'] = 2;
            map['T' - 'A'] = 3;
            for (int i = 0; i < s.length() - 9; i++) {
                int hash = 0;
                for (int j = i; j < i + 10; j++) {
                    hash <<= 2;
                    hash |= map[s.charAt(j) - 'A'];
                }
                if (!seen1stTime.add(hash) && seen2ndTime.add(hash)) {
                    ans.add(s.substring(i, i + 10));
                }
            }
            return ans;
        }
    }
}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 451. Sort Characters By Frequency
 *
 * Given a string, sort it in decreasing order based on the frequency of characters.

 Example 1:

 Input:
 "tree"

 Output:
 "eert"

 Explanation:
 'e' appears twice while 'r' and 't' both appear once.
 So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

 Example 2:

 Input:
 "cccaaa"

 Output:
 "cccaaa"

 Explanation:
 Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 Note that "cacaca" is incorrect, as the same characters must be together.

 Example 3:

 Input:
 "Aabb"

 Output:
 "bbAa"

 Explanation:
 "bbaA" is also a valid answer, but "Aabb" is incorrect.
 Note that 'A' and 'a' are treated as two different characters.

 */
public class _451 {

    public static class Solution1 {
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : list) {
                for (int i = 0; i < entry.getValue(); i++) {
                    stringBuilder.append(entry.getKey());
                }
            }
            return stringBuilder.toString();
        }
    }
}

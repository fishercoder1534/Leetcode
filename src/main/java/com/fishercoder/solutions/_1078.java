package com.fishercoder.solutions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 5083. Occurrences After Bigram
 * <p>
 * Given words first and second, consider occurrences in some text of the form "first second third",
 * where second comes immediately after first, and third comes immediately after second.
 * For each such occurrence, add "third" to the answer, and return the answer.
 * <p>
 * Example 1:
 * Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
 * Output: ["girl","student"]
 * <p>
 * Example 2:
 * Input: text = "we will we will rock you", first = "we", second = "will"
 * Output: ["we","rock"]
 * <p>
 * Note:
 * 1 <= text.length <= 1000
 * text consists of space separated words, where each word consists of lowercase English letters.
 * 1 <= first.length, second.length <= 10
 * first and second consist of lowercase English letters.
 */
public class _1078 {
    public static class Solution1 {
        public String[] findOcurrences(String text, String first, String second) {
            String[] words = text.split(" ");
            return IntStream
                    .range(0, words.length - 2)
                    .filter(i -> words[i].equals(first) && words[i + 1].equals(second))
                    .mapToObj(i -> words[i + 2])
                    .collect(Collectors.toList())
                    .stream()
                    .toArray(String[]::new);
        }
    }
}

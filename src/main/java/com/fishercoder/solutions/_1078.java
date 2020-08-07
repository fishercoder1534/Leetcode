package com.fishercoder.solutions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _500 {

    public String[] findWords(String[] words) {
        final Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        final Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        final Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
        final List<Set<Character>> setList = Arrays.asList(row1, row2, row3);
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            boolean can = true;
            for (Set<Character> row : setList) {
                for (char c : lowerCaseWord.toCharArray()) {
                    if (!row.contains(c)) {
                        can = false;
                        break;
                    }
                }
                if (can) {
                    wordList.add(word);
                    break;
                }
                can = true;
            }
        }
        String[] result = new String[wordList.size()];
        for (int i = 0; i < wordList.size(); i++) {
            result[i] = wordList.get(i);
        }
        return result;
    }

}

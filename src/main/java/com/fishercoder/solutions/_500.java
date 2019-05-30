package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 500. Keyboard Row
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 *
 * American keyboard
 *
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 *
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */
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

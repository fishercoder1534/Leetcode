package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2135 {
    public static class Solution1 {
        public int wordCount(String[] startWords, String[] targetWords) {
            Set<String> startSet = new HashSet<>();
            for (String start : startWords) {
                char[] charArray = start.toCharArray();
                Arrays.sort(charArray);
                startSet.add(new String(charArray));
            }
            int count = 0;
            for (String target : targetWords) {
                char[] charArray = target.toCharArray();
                Arrays.sort(charArray);
                String sortedTarget = new String(charArray);
                for (int i = 0; i < sortedTarget.length(); i++) {
                    String formedTargetByOmittingOneLetter =
                            sortedTarget.substring(0, i) + sortedTarget.substring(i + 1);
                    if (startSet.contains(formedTargetByOmittingOneLetter)) {
                        count++;
                        break;
                    }
                }
            }
            return count;
        }
    }
}

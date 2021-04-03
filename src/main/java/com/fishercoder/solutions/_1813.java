package com.fishercoder.solutions;

public class _1813 {
    public static class Solution1 {
        public boolean areSentencesSimilar(String sentence1, String sentence2) {
            String shorter = sentence1.length() < sentence2.length() ? sentence1 : sentence2;
            String longer = shorter.equals(sentence1) ? sentence2 : sentence1;
            String[] shortWords = shorter.split(" ");
            String[] longWords = longer.split(" ");
            int breaks = 0;
            int j = 0;
            int i = 0;
            for (; i < shortWords.length && j < longWords.length; ) {
                if (shortWords[i].equals(longWords[j])) {
                    j++;
                    i++;
                } else {
                    breaks++;
                    if (breaks > 1) {
                        return false;
                    }
                    while (j < longWords.length && !longWords[j].equals(shortWords[i])) {
                        j++;
                    }
                }
            }
            return (breaks == 1 && i == shortWords.length && j == longWords.length) || (i == shortWords.length && breaks == 0);
        }
    }
}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _792 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/number-of-matching-subsequences/discuss/1290406/C%2B%2BJavaPython-Next-Letter-Pointers-Picture-explain-O(N-%2B-S)
         */
        public int numMatchingSubseq(String s, String[] words) {
            List<Node>[] buckets = new ArrayList[26];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new ArrayList<>();
            }
            for (String word : words) {
                char start = word.charAt(0);
                buckets[start - 'a'].add(new Node(word, 0));
            }
            int result = 0;
            for (char c : s.toCharArray()) {
                List<Node> currBucket = buckets[c - 'a'];
                buckets[c - 'a'] = new ArrayList<>();
                for (Node node : currBucket) {
                    node.index++;
                    if (node.index == node.word.length()) {
                        result++;
                    } else {
                        char start = node.word.charAt(node.index);
                        buckets[start - 'a'].add(node);
                    }
                }
            }
            return result;
        }

        private class Node {
            String word;
            int index;

            public Node(String word, int index) {
                this.word = word;
                this.index = index;
            }
        }
    }
}

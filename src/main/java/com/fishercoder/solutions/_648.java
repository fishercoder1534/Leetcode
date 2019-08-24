package com.fishercoder.solutions;

import java.util.List;

/**
 * 648. Replace Words

 * In English, we have a concept called root,
 * which can be followed by some other words to form another longer word
 * - let's call this word successor.
 * For example, the root an, followed by other, which can form another word another.
 * Now, given a dictionary consisting of many roots and a sentence.
 * You need to replace all the successor in the sentence with the root forming it.
 * If a successor has many roots can form it, replace it with the root with the shortest length.

 You need to output the sentence after the replacement.

 Example 1:
 Input: dict = ["cat", "bat", "rat"]
 sentence = "the cattle was rattled by the battery"
 Output: "the cat was rat by the bat"

 Note:
 The input will only have lower-case letters.
 1 <= dict words number <= 1000
 1 <= sentence words number <= 1000
 1 <= root length <= 100
 1 <= sentence words length <= 1000

 */
public class _648 {
    public static class Solution1 {
        public String replaceWords(List<String> dict, String sentence) {
            String[] tokens = sentence.split(" ");
            TrieNode trie = buildTrie(dict);
            return replaceWords(tokens, trie);
        }

        private String replaceWords(String[] tokens, TrieNode root) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String token : tokens) {
                stringBuilder.append(getShortestReplacement(token, root));
                stringBuilder.append(" ");
            }
            return stringBuilder.substring(0, stringBuilder.length() - 1);
        }

        private String getShortestReplacement(String token, final TrieNode root) {
            TrieNode temp = root;
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : token.toCharArray()) {
                stringBuilder.append(c);
                if (temp.children[c - 'a'] != null) {
                    if (temp.children[c - 'a'].isWord) {
                        return stringBuilder.toString();
                    }
                    temp = temp.children[c - 'a'];
                } else {
                    return token;
                }
            }
            return token;
        }

        private TrieNode buildTrie(List<String> dict) {
            TrieNode root = new TrieNode(' ');
            for (String word : dict) {
                TrieNode temp = root;
                for (char c : word.toCharArray()) {
                    if (temp.children[c - 'a'] == null) {
                        temp.children[c - 'a'] = new TrieNode(c);
                    }
                    temp = temp.children[c - 'a'];
                }
                temp.isWord = true;
            }
            return root;
        }

        public class TrieNode {
            char val;
            TrieNode[] children;
            boolean isWord;

            public TrieNode(char val) {
                this.val = val;
                this.children = new TrieNode[26];
                this.isWord = false;
            }
        }
    }
}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _425 {

    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/63516/explained-my-java-solution-using-trie-126ms-16-16/2
         */

        class TrieNode {
            List<String> startWith;
            TrieNode[] children;

            TrieNode() {
                startWith = new ArrayList<>();
                children = new TrieNode[26];
            }
        }

        class Trie {
            TrieNode root;

            Trie(String[] words) {
                root = new TrieNode();
                for (String word : words) {
                    TrieNode cur = root;
                    for (char ch : word.toCharArray()) {
                        int index = ch - 'a';
                        if (cur.children[index] == null) {
                            cur.children[index] = new TrieNode();
                        }
                        cur.children[index].startWith.add(word);
                        cur = cur.children[index];
                    }
                }
            }

            List<String> findByPrefix(String prefix) {
                List<String> ans = new ArrayList<>();
                TrieNode cur = root;
                for (char ch : prefix.toCharArray()) {
                    int index = ch - 'a';
                    if (cur.children[index] == null) {
                        return ans;
                    }

                    cur = cur.children[index];
                }
                ans.addAll(cur.startWith);
                return ans;
            }
        }

        public List<List<String>> wordSquares(String[] words) {
            List<List<String>> ans = new ArrayList<>();
            if (words == null || words.length == 0) {
                return ans;
            }
            int len = words[0].length();
            Trie trie = new Trie(words);
            List<String> ansBuilder = new ArrayList<>();
            for (String w : words) {
                ansBuilder.add(w);
                search(len, trie, ans, ansBuilder);
                ansBuilder.remove(ansBuilder.size() - 1);
            }

            return ans;
        }

        private void search(int len, Trie trie, List<List<String>> ans,
                            List<String> ansBuilder) {
            if (ansBuilder.size() == len) {
                ans.add(new ArrayList<>(ansBuilder));
                return;
            }

            int idx = ansBuilder.size();
            StringBuilder prefixBuilder = new StringBuilder();
            for (String s : ansBuilder) {
                prefixBuilder.append(s.charAt(idx));
            }
            List<String> startWith = trie.findByPrefix(prefixBuilder.toString());
            for (String sw : startWith) {
                ansBuilder.add(sw);
                search(len, trie, ans, ansBuilder);
                ansBuilder.remove(ansBuilder.size() - 1);
            }
        }
    }

}


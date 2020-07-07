package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _411 {
    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/61346/trie-bruteforce
         */
        class Trie {
            Trie[] children = new Trie[26];
            boolean isWord = false;
        }

        Trie root = new Trie();
        List<String> abbrs;

        public String minAbbreviation(String target, String[] dictionary) {
            for (String s : dictionary) {
                addTrie(s);
            }

            for (int i = 0; i < target.length(); i++) {
                abbrs = new ArrayList<>();
                abbrGenerator(target, 0, "", 0, i + 1);
                for (String s : abbrs) {
                    if (search(s, root, 0, 0) == false) {
                        return s;
                    }
                }
            }
            return "";
        }

        public void addTrie(String s) {
            Trie cur = root;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (cur.children[c - 'a'] == null) {
                    cur.children[c - 'a'] = new Trie();
                }
                cur = cur.children[c - 'a'];
            }
            cur.isWord = true;
        }

        public boolean search(String target, Trie root, int i, int loop) {
            if (root == null) {
                return false;
            }

            if (loop != 0) {
                for (int a = 0; a < 26; a++) {
                    if (search(target, root.children[a], i, loop - 1)) {
                        return true;
                    }
                }
                return false;
            }
            if (i == target.length()) {
                if (root.isWord) {
                    return true;
                }
                return false;
            }
            if (Character.isDigit(target.charAt(i))) {
                int tmp = 0;
                while (i < target.length() && Character.isDigit(target.charAt(i))) {
                    tmp = tmp * 10 + target.charAt(i) - '0';
                    i++;
                }
                return search(target, root, i, tmp);
            } else {
                return search(target, root.children[target.charAt(i) - 'a'], i + 1, 0);
            }
        }

        public void abbrGenerator(String target, int i, String tmp, int abbr, int num) {
            if (i == target.length()) {
                if (num == 0 && abbr == 0) {
                    abbrs.add(tmp);
                }
                if (num == 1 && abbr != 0) {
                    abbrs.add(tmp + abbr);
                }
                return;
            }
            if (num <= 0) {
                return;
            }
            char cur = target.charAt(i);
            abbrGenerator(target, i + 1, abbr == 0 ? tmp + cur : tmp + abbr + cur, 0,
                    abbr == 0 ? num - 1 : num - 2);
            abbrGenerator(target, i + 1, tmp, abbr + 1, num);
        }
    }

}

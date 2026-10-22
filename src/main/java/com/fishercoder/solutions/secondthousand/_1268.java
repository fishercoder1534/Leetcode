package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1268 {
    public static class Solution1 {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            TrieNode root = buildTrie(products);
            List<List<String>> result = new ArrayList<>();
            for (int i = 1; i <= searchWord.length(); i++) {
                result.add(findTopThreeMatches(root, searchWord.substring(0, i)));
            }
            return result;
        }

        private List<String> findTopThreeMatches(TrieNode root, String searchTerm) {
            List<String> result = new ArrayList<>();
            TrieNode node = root;

            //we'll finish iterating through the given searchTerm first to move the node to the right place in the Trie if the searchTerm does have a match in the Trie, else, we'll return an empty list.
            for (char c : searchTerm.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    return result;
                } else {
                    node = node.children[c - 'a'];
                }
            }

            if (node.isWord) {
                result.add(searchTerm);
            }

            for (TrieNode childNode : node.children) {
                if (childNode != null) {
                    dfs(childNode, searchTerm + childNode.c, result);
                    if (result.size() >= 3) {
                        return result.subList(0, 3);
                    }
                }
            }
            return result;
        }

        private void dfs(TrieNode currentNode, String substring, List<String> result) {
            if (result.size() >= 3) {
                return;
            }
            if (currentNode.isWord) {
                result.add(substring);
            }
            for (TrieNode childNode : currentNode.children) {
                if (childNode != null) {
                    dfs(childNode, substring + childNode.c, result);
                }
            }
        }

        private TrieNode buildTrie(String[] products) {
            TrieNode root = new TrieNode(' ');
            for (String product : products) {
                insert(product, root);
            }
            return root;
        }

        private void insert(String word, TrieNode root) {
            TrieNode currentNode = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (currentNode.children[c - 'a'] == null) {
                    currentNode.children[c - 'a'] = new TrieNode(c);
                }
                currentNode = currentNode.children[c - 'a'];
            }
            currentNode.isWord = true;
        }

        class TrieNode {
            TrieNode[] children;
            boolean isWord;
            char c;

            public TrieNode(char c) {
                this.c = c;
                this.children = new TrieNode[26];
            }
        }
    }

    public static class Solution2 {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            TrieNode root = buildTrie(products);
            List<List<String>> result = new ArrayList<>();
            for (int i = 1; i <= searchWord.length(); i++) {
                String searchTerm = searchWord.substring(0, i);
                TrieNode tmp = root;
                List<String> searchResult = new ArrayList<>();
                for (int j = 0; j < searchTerm.length(); j++) {
                    char c = searchTerm.charAt(j);
                    if (tmp.children[c - 'a'] == null) {
                        break;
                    } else {
                        tmp = tmp.children[c - 'a'];
                    }
                    if (j == searchTerm.length() - 1) {
                        searchResult.addAll(findAllWords(tmp, searchTerm));
                    }
                }
                result.add(searchResult.size() > 3 ? searchResult.subList(0, 3) : searchResult);
            }
            return result;
        }

        //this is a beautiful recursive program
        private List<String> findAllWords(TrieNode currentNode, String prefix) {
            List<String> result = new ArrayList<>();
            if (currentNode.isWord) {
                result.add(prefix);
            }
            for (TrieNode childNode : currentNode.children) {
                if (childNode != null) {
                    result.addAll(findAllWords(childNode, prefix + childNode.val));
                    if (result.size() > 3) {
                        return result;
                    }
                }
            }
            return result;
        }

        private TrieNode buildTrie(String[] words) {
            TrieNode root = new TrieNode(' ');
            for (String word : words) {
                TrieNode currentNode = root;
                for (char c : word.toCharArray()) {
                    if (currentNode.children[c - 'a'] == null) {
                        currentNode.children[c - 'a'] = new TrieNode(c);
                    }
                    currentNode = currentNode.children[c - 'a'];
                }
                currentNode.isWord = true;
            }
            return root;
        }

        public class TrieNode {
            TrieNode[] children;
            char val;
            boolean isWord;

            public TrieNode(char val) {
                this.children = new TrieNode[26];
                this.val = val;
                this.isWord = false;
            }
        }
    }
}

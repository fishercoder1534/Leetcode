package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _588 {
    public static class Solution1 {
        /**
         * Credit: https://github.com/lydxlx1/LeetCode/blob/master/src/_588.java
         */
        public static class FileSystem {

            class TrieNode {
                boolean isFile = false;
                Map<String, TrieNode> map;
                String name;
                StringBuilder stringBuilder;

                TrieNode(String name) {
                    this.name = name;
                    map = new HashMap<>();
                    stringBuilder = new StringBuilder();
                }
            }

            TrieNode root = new TrieNode("");

            TrieNode dfs(String path) {
                TrieNode node = root;
                for (String eachPath : path.split("/")) {
                    if (eachPath.isEmpty()) {
                        continue;
                    }
                    if (!node.map.containsKey(eachPath)) {
                        node.map.put(eachPath, new TrieNode(eachPath));
                    }
                    node = node.map.get(eachPath);
                }
                return node;
            }

            public FileSystem() {
            }

            public List<String> ls(String path) {
                TrieNode node = dfs(path);
                if (node.isFile) {
                    return Arrays.asList(node.name);
                } else {
                    List<String> files = new ArrayList(node.map.keySet());
                    Collections.sort(files);
                    return files;
                }
            }

            public void mkdir(String path) {
                dfs(path);
            }

            public void addContentToFile(String filePath, String content) {
                TrieNode node = dfs(filePath);
                node.isFile = true;
                node.stringBuilder.append(content);
            }

            public String readContentFromFile(String filePath) {
                return dfs(filePath).stringBuilder.toString();
            }
        }
    }

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */
}

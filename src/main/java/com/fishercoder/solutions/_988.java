package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 988. Smallest String Starting From Leaf
 *
 * Given the root of a binary tree, each node has a value from 0 to 25 representing the letters 'a' to 'z':
 * a value of 0 represents 'a', a value of 1 represents 'b', and so on.
 * Find the lexicographically smallest string that starts at a leaf of this tree and ends at the root.
 * (As a reminder, any shorter prefix of a string is lexicographically smaller: for example, "ab" is lexicographically smaller than "aba".
 * A leaf of a node is a node that has no children.)
 *
 * Example 1:
 * Input: [0,1,2,3,4,3,4]
 * Output: "dba"
 *
 * Example 2:
 * Input: [25,1,3,1,3,0,2]
 * Output: "adz"
 *
 * Example 3:
 * Input: [2,2,1,null,1,0,null,0]
 * Output: "abc"
 *
 * Note:
 * The number of nodes in the given tree will be between 1 and 8500.
 * Each node in the tree will have a value between 0 and 25.
 * */
public class _988 {
    public static class Solution1 {
        public String smallestFromLeaf(TreeNode root) {
            final List<String> paths = new ArrayList<>();
            Map<Integer, Character> map = new HashMap<>();
            map.put(0, 'a');
            map.put(1, 'b');
            map.put(2, 'c');
            map.put(3, 'd');
            map.put(4, 'e');
            map.put(5, 'f');
            map.put(6, 'g');
            map.put(7, 'h');
            map.put(8, 'i');
            map.put(9, 'j');
            map.put(10, 'k');
            map.put(11, 'l');
            map.put(12, 'm');
            map.put(13, 'n');
            map.put(14, 'o');
            map.put(15, 'p');
            map.put(16, 'q');
            map.put(17, 'r');
            map.put(18, 's');
            map.put(19, 't');
            map.put(20, 'u');
            map.put(21, 'v');
            map.put(22, 'w');
            map.put(23, 'x');
            map.put(24, 'y');
            map.put(25, 'z');
            dfs(root, "", paths, map);
            return findSmallest(paths);
        }

        private String findSmallest(List<String> paths) {
            List<String> reversed = new ArrayList<>();
            for (String path : paths) {
                StringBuilder sb = new StringBuilder();
                sb.append(path);
                reversed.add(sb.reverse().toString());
            }
            Collections.sort(reversed);
            return reversed.get(0);
        }

        private void dfs(TreeNode root, String path, List<String> paths, Map<Integer, Character> map) {
            if (root == null) {
                return;
            }
            path += map.get(root.val);
            if (root.left == null && root.right == null) {
                paths.add(path);
            }
            dfs(root.left, path, paths, map);
            dfs(root.right, path, paths, map);
            path = path.substring(0, path.length() - 1);
        }
    }
}

package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.List;

public class _315 {

    public static class Solution1 {
        class Node {
            int val;
            int sum;
            int dup = 1;
            Node left;
            Node right;

            public Node(int v, int s) {
                this.val = v;
                this.sum = s;
            }
        }

        public List<Integer> countSmaller(int[] nums) {
            Integer[] ans = new Integer[nums.length];
            Node root = null;
            for (int i = nums.length - 1; i >= 0; i--) {
                root = insertNode(nums[i], root, i, 0, ans);
            }
            return Arrays.asList(ans);
        }

        Node insertNode(int val, Node node, int i, int prevSum, Integer[] ans) {
            if (node == null) {
                node = new Node(val, 0);
                ans[i] = prevSum;
            } else if (val == node.val) {
                node.dup += 1;
                ans[i] = prevSum + node.sum;
            } else if (val > node.val) {
                node.right = insertNode(val, node.right, i, prevSum + node.sum + node.dup, ans);
            } else {
                node.sum += 1;
                node.left = insertNode(val, node.left, i, prevSum, ans);
            }

            return node;
        }
    }
}

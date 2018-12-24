package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.List;

/**
 * 315. Count of Smaller Numbers After Self
 *
 * You are given an integer array nums and you have to return a new counts array.
 * The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

 Example:

 Given nums = [5, 2, 6, 1]

 To the right of 5 there are 2 smaller elements (2 and 1).
 To the right of 2 there is only 1 smaller element (1).
 To the right of 6 there is 1 smaller element (1).
 To the right of 1 there is 0 smaller element.
 Return the array [2, 1, 1, 0].

 */
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

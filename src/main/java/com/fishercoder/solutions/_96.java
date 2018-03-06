package com.fishercoder.solutions;

/**
 * 96. Unique Binary Search Trees
 *
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

 For example,
 Given n = 3, there are a total of 5 unique BST's.

 1        3     3      2      1
 \       /     /      / \      \
 3      2     1      1   3      2
 /     /       \                 \
 2    1         2                 3

 */
public class _96 {

    public static class Solution1 {
        public int numTrees(int n) {
            int[] G = new int[n + 1];
            G[0] = G[1] = 1;

            for (int i = 2; i <= n; ++i) {
                for (int j = 1; j <= i; ++j) {
                    int temp = G[j - 1] * G[i - j];
                    G[i] = G[i] + temp;
                }
            }
            return G[n];
        }
    }
}

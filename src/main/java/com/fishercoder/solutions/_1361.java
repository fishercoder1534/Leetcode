package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1361. Validate Binary Tree Nodes
 *
 * You have n binary tree nodes numbered from 0 to n - 1 where node i has two children leftChild[i] and rightChild[i],
 * return true if and only if all the given nodes form exactly one valid binary tree.
 * If node i has no left child then leftChild[i] will equal -1, similarly for the right child.
 * Note that the nodes have no values and that we only use the node numbers in this problem.
 *
 * Example 1:
 * Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,-1,-1,-1]
 * Output: true
 *
 * Example 2:
 * Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,3,-1,-1]
 * Output: false
 *
 * Example 3:
 * Input: n = 2, leftChild = [1,0], rightChild = [-1,-1]
 * Output: false
 *
 * Example 4:
 * Input: n = 6, leftChild = [1,-1,-1,4,-1,-1], rightChild = [2,-1,-1,5,-1,-1]
 * Output: false
 *
 * Constraints:
 * 1 <= n <= 10^4
 * leftChild.length == rightChild.length == n
 * -1 <= leftChild[i], rightChild[i] <= n - 1
 * */
public class _1361 {
    public static class Solution1 {
        public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
            int[] indegree = new int[n];
            for (int i = 0; i < n; i++) {
                if (leftChild[i] >= 0) {
                    indegree[leftChild[i]]++;
                }
                if (rightChild[i] >= 0) {
                    indegree[rightChild[i]]++;
                }
            }
            //only one node has in-degree = 0
            int indegreeZero = 0;
            for (int num : indegree) {
                if (num == 0) {
                    indegreeZero++;
                    if (indegreeZero > 1) {
                        return false;
                    }
                }
                //every other node's in-degree must be exactly equal to 1
                if (num > 1) {
                    return false;
                }
            }
            //no bi-directional pointing
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(i, new ArrayList<>());
                map.get(i).add(leftChild[i]);
                map.get(i).add(rightChild[i]);
            }
            for (int node : map.keySet()) {
                List<Integer> children = map.get(node);
                for (int child : children) {
                    if (map.containsKey(child) && map.get(child).contains(node)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}

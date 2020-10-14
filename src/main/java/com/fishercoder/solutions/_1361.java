package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

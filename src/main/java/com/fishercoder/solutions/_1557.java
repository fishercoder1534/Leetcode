package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1557 {
    public static class Solution1 {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            int[] indegree = new int[n];
            for (List<Integer> edge : edges) {
                indegree[edge.get(1)]++;
            }
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < indegree.length; i++) {
                if (indegree[i] == 0) {
                    ans.add(i);
                }
            }
            return ans;
        }
    }
}

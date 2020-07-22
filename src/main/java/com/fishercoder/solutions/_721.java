package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class _721 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/articles/accounts-merge/#approach-1-depth-first-search-accepted
         * <p>
         * Time Complexity: O(∑ai*logai) where a​i is the length of accounts[i].
         * Without the log factor, this is the complexity to build the graph and search for each component. The log factor is for sorting each component at the end.
         * Space Complexity: O(∑ai) the space used by the graph and search.
         * .
         */
        public List<List<String>> accountsMerge(List<List<String>> accounts) {
            Map<String, String> emailToName = new HashMap();
            Map<String, ArrayList<String>> graph = new HashMap();
            for (List<String> account : accounts) {
                String name = "";
                for (String email : account) {
                    if (name == "") {
                        name = email;
                        continue;
                    }
                    graph.computeIfAbsent(email, x -> new ArrayList<>()).add(account.get(1));
                    graph.computeIfAbsent(account.get(1), x -> new ArrayList<>()).add(email);
                    emailToName.put(email, name);
                }
            }

            Set<String> seen = new HashSet();
            List<List<String>> ans = new ArrayList();
            for (String email : graph.keySet()) {
                if (!seen.contains(email)) {
                    seen.add(email);
                    Stack<String> stack = new Stack();
                    stack.push(email);
                    List<String> component = new ArrayList();
                    while (!stack.empty()) {
                        String node = stack.pop();
                        component.add(node);
                        for (String nei : graph.get(node)) {
                            if (!seen.contains(nei)) {
                                seen.add(nei);
                                stack.push(nei);
                            }
                        }
                    }
                    Collections.sort(component);
                    component.add(0, emailToName.get(email));
                    ans.add(component);
                }
            }
            return ans;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/articles/accounts-merge/#approach-2-union-find-accepted
         * DSU stands for Disjoint Set Union: https://en.wikipedia.org/wiki/Disjoint-set_data_structure
         * <p>
         * Time complexity: O(AlogA)
         * Space complexity: O(A)
         */
        public List<List<String>> accountsMerge(List<List<String>> accounts) {
            DSU dsu = new DSU();
            Map<String, String> emailToName = new HashMap<>();
            Map<String, Integer> emailToId = new HashMap<>();
            int id = 0;
            for (List<String> account : accounts) {
                String name = "";
                for (String email : account) {
                    if (name.equals("")) {
                        name = email;
                        continue;
                    }
                    emailToName.put(email, name);
                    if (!emailToId.containsKey(email)) {
                        emailToId.put(email, id++);
                    }
                    dsu.union(emailToId.get(account.get(1)), emailToId.get(email));
                }
            }

            Map<Integer, List<String>> ans = new HashMap<>();
            for (String email : emailToName.keySet()) {
                int index = dsu.find(emailToId.get(email));
                ans.computeIfAbsent(index, x -> new ArrayList()).add(email);
            }
            for (List<String> component : ans.values()) {
                Collections.sort(component);
                component.add(0, emailToName.get(component.get(0)));
            }
            return new ArrayList<>(ans.values());
        }

        class DSU {
            int[] parent;

            public DSU() {
                parent = new int[10001];
                for (int i = 0; i <= 10000; i++) {
                    parent[i] = i;
                }
            }

            public int find(int x) {
                if (parent[x] != x) {
                    parent[x] = find(parent[x]);
                }
                return parent[x];
            }

            public void union(int x, int y) {
                parent[find(x)] = find(y);
            }
        }
    }
}

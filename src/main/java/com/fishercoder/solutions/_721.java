package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * 721. Accounts Merge
 *
 * Given a list accounts, each element accounts[i] is a list of strings, where the first element accounts[i][0] is a name, and the rest of the elements are emails representing emails of the account.
 * Now, we would like to merge these accounts.
 * Two accounts definitely belong to the same person if there is some email that is common to both accounts.
 * Note that even if two accounts have the same name, they may belong to different people as people could have the same name.
 * A person can have any number of accounts initially, but all of their accounts definitely have the same name.
 * After merging the accounts, return the accounts in the following format:
 * the first element of each account is the name, and the rest of the elements are emails in sorted order.
 * The accounts themselves can be returned in any order.

 Example 1:
 Input:
 accounts = [["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"], ["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]
 Output: [["John", 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com'],  ["John", "johnnybravo@mail.com"], ["Mary", "mary@mail.com"]]

 Explanation:
 The first and third John's are the same person as they have the common email "johnsmith@mail.com".
 The second John and Mary are different people as none of their email addresses are used by other accounts.
 We could return these lists in any order, for example the answer [['Mary', 'mary@mail.com'], ['John', 'johnnybravo@mail.com'],
 ['John', 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com']] would still be accepted.

 Note:
 The length of accounts will be in the range [1, 1000].
 The length of accounts[i] will be in the range [1, 10].
 The length of accounts[i][j] will be in the range [1, 30].
 */
public class _721 {

    public static class Solution1 {
        /**credit: https://leetcode.com/articles/accounts-merge/#approach-1-depth-first-search-accepted
         *
         * Time Complexity: O(∑ai*logai) where a​i is the length of accounts[i].
         * Without the log factor, this is the complexity to build the graph and search for each component. The log factor is for sorting each component at the end.
         * Space Complexity: O(∑ai) the space used by the graph and search.
         * .*/
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
        /**credit: https://leetcode.com/articles/accounts-merge/#approach-2-union-find-accepted
         * DSU stands for Disjoint Set Union: https://en.wikipedia.org/wiki/Disjoint-set_data_structure
         *
         * Time complexity: O(AlogA)
         * Space complexity: O(A)
         * */
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

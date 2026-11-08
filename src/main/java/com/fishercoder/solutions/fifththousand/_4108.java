package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.List;

public class _4108 {
    public static class Solution1 {
        /**
         * Credit: Gemini
         * Time: O(n)
         * Space: O(n)
         * <p>
         * REASONING & INTUITION FOR THE TREE DP SOLUTION:
         * <p>
         * 1. CORE THEOREM & REFRAMING THE PROBLEM:
         * - Instead of directly tracking operations to link nodes, we can reframe the problem
         * by looking at the final stable configuration of the tree.
         * - The problem allows us to choose a single connected component of nodes to be RED,
         * while every single node outside of this component must end up BLUE.
         * - By choosing *which* connected component remains or becomes RED, we implicitly
         * determine the exact flip operations required.
         * <p>
         * 2. BASELINE COST (THE "ALL BLUE" CONFIGURATION):
         * - Suppose we decide to flip *every single originally RED node* to BLUE.
         * This leaves 0 RED nodes in the tree, which trivially satisfies the condition of having
         * "all RED nodes connected" (an empty set is connected).
         * - When a RED node `u` is flipped to BLUE, its operation cost is equal to the size of
         * its entire subtree, `subtreeSize[u]`.
         * - Therefore, our baseline cost (the worst-case starting point) is:
         * baseCost = Sum of `subtreeSize[u]` for all nodes `u` where colors.charAt(u) == 'R'.
         * <p>
         * 3. MAXIMIZING SAVINGS (CHOOSING THE RED COMPONENT):
         * - Instead of leaving the tree completely BLUE, we can choose one connected component
         * of nodes to be RED. This alters our baseline cost by introducing gains and penalties:
         * A) GAIN (Keeping an originally RED node RED):
         * If an originally RED node is included in our chosen RED component, we no longer
         * need to flip it to BLUE. This saves us from paying its baseline cost penalty.
         * -> Net Change = +subtreeSize[u]
         * B) PENALTY (Flipping an originally BLUE node RED):
         * If an originally BLUE node is included in our chosen RED component, we must flip
         * it from BLUE to RED. The cost to do this is its subtree size.
         * -> Net Change = -subtreeSize[u]
         * <p>
         * 4. THE DYNAMIC PROGRAMMING SUBPROBLEMS:
         * - Let `dp[u]` be the maximum net savings (gain) we can achieve if we form a valid
         * connected RED component whose top-most node (local root) is node `u`, restricted
         * entirely to node `u`'s subtree.
         * - To calculate `dp[u]`, we look at node `u` itself and its immediate children `v`:
         * - Base Gain/Loss for node `u`:
         * currentGain = (colors.charAt(u) == 'R') ? subtreeSize[u] : -subtreeSize[u];
         * - Transition from children:
         * For each child `v`, we can either extend our RED component into `v`'s subtree
         * (gaining `dp[v]`) or choose to cut it off completely and leave `v`'s entire
         * subtree BLUE (gaining `0`).
         * Since we want to maximize savings, we greedily take `Math.max(0, dp[v])`.
         * - Recurrence Relation:
         * dp[u] = currentGain + Sum( Math.max(0, dp[v]) ) for all children `v` of `u`.
         * <p>
         * 5. FINAL AGGREGATION:
         * - The absolute optimal RED component can be rooted at *any* node `u` in the tree;
         * it does not have to span all the way to the global tree root (node 0).
         * - We track the global maximum savings found: `maxGain = Max(dp[u])` for all `u`.
         * - If `maxGain` is 0 (meaning any component we pick hurts us more than it helps),
         * we pick an empty component and stick to our all-BLUE baseline.
         * - The absolute minimum cost to make all RED nodes connected is:
         * Final Answer = baseCost - maxGain
         * <p>
         * 6. TOPOLOGICAL ORDERING (ITERATIVE EXECUTION):
         * - To compute `subtreeSize` and `dp` values correctly without deep recursion stack crashes,
         * we perform a BFS from root node 0 to establish a parent-child hierarchy and get a
         * topological array of nodes.
         * - Reversing this array lets us process the tree from the bottom up (leaves to root).
         * - Pass 1 (Reverse Order): Propagates leaf sizes upward to dynamically construct `subtreeSize[u]`.
         * - Pass 2 (Reverse Order): Computes `dp[u]` values sequentially, ensuring child states
         * are finalized before their respective parents process them.
         */

        private List<Integer>[] graph;
        private int[] subtreeSize;
        private long[] dp;
        private long maxGain = 0;
        private long baseCost = 0;
        private String nodeColors;

        public long minCost(int n, String colors, int[][] edges) {
            this.nodeColors = colors;

            // Initialize adjacency list
            graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                graph[edge[0]].add(edge[1]);
                graph[edge[1]].add(edge[0]);
            }

            subtreeSize = new int[n];
            dp = new long[n];

            // Step 1: Execute 1st DFS pass to extract sizes and evaluate worst-case baseline cost
            postorderCalculateSubtreeSizes(0, -1);

            // Step 2: Execute 2nd DFS pass to run Tree Dynamic Programming for optimal savings
            postorderDfsComputeDP(0, -1);

            // Final Answer: Total cost if everything went Blue, minus our best savings component
            return baseCost - maxGain;
        }

        /**
         * PASS 1 DFS: Computes structural subtree sizes and counts baseline flip costs: i.e. flip all REDs to BLUEs,
         * giving up on savings at all, but reaches a valid and worse case which is our baseline.
         *
         * @param currentNode Current node under evaluation
         * @param parent Direct parent node of u (used to prevent moving backward up the tree)
         */
        private void postorderCalculateSubtreeSizes(int currentNode, int parent) {
            // Base case: Every individual node contains at least itself
            subtreeSize[currentNode] = 1;

            if (nodeColors.charAt(currentNode) == 'R') {
                baseCost += 0; // Conceptual placeholder: We wait until the entire subtree is sized
            }

            // Deep-dive into all valid branches of this node's structural subtree
            for (int v : graph[currentNode]) {
                if (v != parent) { // Prevent infinite loops by blocking the path back to the parent
                    postorderCalculateSubtreeSizes(v, currentNode); // Recursively solve the child's subtree first
                    subtreeSize[currentNode] += subtreeSize[v]; // Accumulate child's finished size into current node
                }
            }

            // Post-Order Step: The full subtree size for 'currentNode' is now completely resolved.
            // If 'currentNode' is Red, flipping it to Blue incurs a penalty equal to its total finalized subtree size.
            if (nodeColors.charAt(currentNode) == 'R') {
                baseCost += subtreeSize[currentNode];
            }
        }

        /**
         * PASS 2 DFS: Tracks the maximum savings by finding the optimal local Red components.
         *
         * @param u Current node under evaluation
         * @param p Direct parent node of u (used to prevent moving backward up the tree)
         */
        private void postorderDfsComputeDP(int u, int p) {
            // Evaluate the baseline trade-off of forcing node 'u' to be part of our chosen Red component:
            // - Keeping an originally Red node Red saves us its subtree size (+subtreeSize[u]).
            // - Flipping an originally Blue node to Red costs us its subtree size (-subtreeSize[u]).
            long currentGain = (nodeColors.charAt(u) == 'R') ? subtreeSize[u] : -subtreeSize[u];

            long childrenSum = 0;

            // Deep-dive to collect maximum possible savings from all child branches
            for (int v : graph[u]) {
                if (v != p) { // Prevent moving back to parent node
                    postorderDfsComputeDP(v, u); // Recursively compute the finalized DP state for child 'v'

                    // Greedily grab the child's sub-component if and only if it brings net positive savings.
                    // If dp[v] is negative, we cut it off entirely (add 0) and leave that branch Blue.
                    childrenSum += Math.max(0, dp[v]);
                }
            }

            // The maximum value rooted at 'u' is its local value plus all profitable sub-branches
            dp[u] = currentGain + childrenSum;

            // Continuously update the global optimum in case the absolute best component is rooted here
            maxGain = Math.max(maxGain, dp[u]);
        }
    }
}

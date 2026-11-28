# 12. Graphs - DFS

### Overview

* **Depth-First Search (DFS)** on graphs starts at an arbitrary node and explores as far as possible along each branch before backtracking.
* Because general graphs can contain cycles or multiple connected components, tracking visited nodes is essential to prevent infinite loops.
* **Core Components:**
  * **Base Case:** The condition under which recursion stops (e.g., out-of-bounds grid cell, already visited node, or target reached).
  * **Visited State:** Tracking mechanism (`Set<Integer>` or `boolean[]` / `boolean[][]`) to prevent infinite loops in graphs with cycles.
  * **Recurrence Relation:** Iterating over adjacent vertices in an adjacency list or 4/8-directional neighbors in a matrix grid.

---

### Adjacency List Representation

When given an edge list `int[][] edges` for $n$ vertices:

```java
List<List<Integer>> adj = new ArrayList<>();
for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
for (int[] edge : edges) {
    adj.get(edge[0]).add(edge[1]);
    adj.get(edge[1]).add(edge[0]); // Omit for directed graphs
}
```

---

### General Graph DFS Pattern

```text
void dfs(Node node, State state, ResultContainer result) {
    if (isBaseCase(node)) {
        if (isGoalReached(state)) {
            result.add(new Solution(state));
        }
        return;
    }

    // Process current node context or add to visited tracking
    visited.add(node);

    for (Node neighbor : node.getNeighbors()) {
        if (!visited.contains(neighbor)) {
            // 1. CHOOSE & EXPLORE
            dfs(neighbor, state, result); 
            
            // 2. BACKTRACK (If tracking a specific global path state)
            // state.undo(choice);
        }
    }
    
    // Optional: remove node from current path tracking on the way back up
    // visited.remove(node);
}
```

---

### Related Graph & Grid DFS Problems

1. [LeetCode 2658. Maximum Number of Fish in a Grid](https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/)
2. [LeetCode 841. Keys and Rooms](https://leetcode.com/problems/keys-and-rooms/)
3. [LeetCode 547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/)

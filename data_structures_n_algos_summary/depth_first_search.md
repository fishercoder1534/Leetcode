# Depth-First Search (DFS)

### Overview

* **Depth-First Search (DFS)** is an algorithmic technique for traversing or searching tree or graph data structures. It starts at the root node (or an arbitrary node in a graph) and explores as far as possible along each branch before backtracking.
* It systematically explores a path fully down to a leaf node or a dead end before reverting changes and trying a alternative branch.
* It typically utilizes a stack data structure (either explicitly or via the system call stack in recursion).

* **Core Components:**
    * **Base Case:** The condition under which the recursion stops (e.g., reaching a null node or a targeted goal).
    * **Visited State:** Tracking mechanism (like a hash set) to prevent infinite loops in graphs with cycles.
    * **Recurrence Relation:** The programmatic direction defining how to move from the current state to neighboring states (e.g., left/right children or list of graph neighbors).

#### General Pattern

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

### Example: Lowest Common Ancestor of a Binary Tree

1. [LeetCode 236. Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/)
* Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
* **State Management:** Tracking matching subtrees using bubble-up values or global collection states.
* **Post-Order Strategy:** Validating both the left branch and the right branch outcomes before assembling the current node solution context.
2. [LeetCode 2658. Maximum Number of Fish in a Grid](https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/)

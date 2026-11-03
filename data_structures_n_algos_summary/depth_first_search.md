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

### Example 1: Lowest Common Ancestor of a Binary Tree

1. [LeetCode 236. Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/)
* Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
* **State Management:** Tracking matching subtrees using bubble-up values or global collection states.
* **Post-Order Strategy:** Validating both the left branch and the right branch outcomes before assembling the current node solution context.
2. [LeetCode 2658. Maximum Number of Fish in a Grid](https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/)

### Example 2: Tree Traversal with Conditional Edge Accumulation

Here is a generalized template and mental model for solving the **Tree Traversal with Conditional Edge Accumulation** pattern (often framed as "minimum time/cost to collect items or visit specific nodes in a tree").

#### The Strategy (Mental Model)

Imagine you need to figure out path traversal paths dynamically. Instead of searching from the root downward for every target item, you start at the leaves and bubble up (**Bottom-Up / Post-Order DFS**). An edge is only included in the final cost if a subtree contains at least one target item.

#### Complete Template (Java)

```java
import java.util.*;

public class Solution {
    public int minCostToVisitNodes(int n, int[][] edges, List<Boolean> hasTarget) {
        // 1. Build Adjacency List
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        // 2. Start DFS from root (node 0) with a dummy parent (-1)
        return dfs(0, -1, graph, hasTarget);
    }
    
    private int dfs(int curr, int parent, List<List<Integer>> graph, List<Boolean> hasTarget) {
        int costFromSubtrees = 0;
        
        for (int neighbor : graph.get(curr)) {
            // Prevent backtracking in an undirected tree
            if (neighbor == parent) continue;
            
            // 3. Delegate to subtrees first (Post-order)
            int subtreeCost = dfs(neighbor, curr, graph, hasTarget);
            
            // 4. Condition to cross this edge
            if (subtreeCost > 0 || hasTarget.get(neighbor)) {
                // Add child's cost + the round-trip cost to cross this edge
                costFromSubtrees += subtreeCost + 2;
            }
        }
        
        return costFromSubtrees;
    }
}
```

#### 4-Step Blueprint Breakdown

* **Tree Graph Representation:** Convert edge pairs into an undirected adjacency list.
* **Parent-Pointer Traversal:** Use a single `parent` integer parameter instead of a costly `boolean[]` visited array. Skip the iteration if `neighbor == parent` to effortlessly prevent infinite loops.
* **Bottom-Up Accumulation:** Execute the recursive `dfs()` call on child nodes *before* making decisions for the current node. Let the children report back whether their subtrees hold anything valuable.
* **Conditional Edge Cost Addition:** Only pay the penalty (e.g., `+2` steps for down-and-back traversal) if the child node itself is a target **OR** if the child's subtree returned a cost `> 0`.

#### Why This is Post-Order Traversal

In a tree structure, a post-order traversal means you process all of a node's children before you process or make a final decision for the node itself.

In this specific problem, you cannot know if you need to walk down to a child node until you know if that child (or any of its deeper descendants) contains a target item. By waiting for the recursive calls to finish, you let the data "bubble up" from the bottom leaves to the root.

##### Visualizing the Order of Operations
```text
1. Go down as deep as possible first (Explore Subtrees)
2. Child returns its status/cost     (Children First)
3. Parent decides its own cost       (Current Node Last)
```

##### The Code Segment That Proves It
```java
// 1. You go all the way down to the bottom first
int subtreeCost = dfs(neighbor, curr, graph, hasTarget);

// 2. ONLY AFTER the child finishes, the current node uses that result
if (subtreeCost > 0 || hasTarget.get(neighbor)) {
    costFromSubtrees += subtreeCost + 2;
}
```

Whenever a tree problem requires information from the bottom leaves to dictate the choices of the nodes above them (like calculating tree height, diameter, or conditional path costs), **post-order DFS** is almost always the required pattern.

1. [LeetCode 1443. Minimum Time to Collect All Apples in a Tree](https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/)
2. [LeetCode 2477. Minimum Fuel Cost to Report to the Capital](https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/)
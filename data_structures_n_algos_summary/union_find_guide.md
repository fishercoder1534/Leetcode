# The Disjoint-Set / Union-Find Paradigm: A Comprehensive Guide

A **Union-Find (Disjoint-Set Union)** is a specialized data structure that tracks a set of elements partitioned into a
number of disjoint (non-overlapping) subsets. It optimizes group connectivity lookups into highly efficient
near-constant $O(\alpha(N))$ time complexity.

---

## ⚡ Java Performance Note: Path Compression

In Java, optimizing the structure with **Path Compression** inside the `find` method changes the flat tree lookup into
an iterative flattening process, reducing future operations significantly.

* **The Problem with Naive Lookup:** Without compression, linking elements linearly forms a degenerate tree structure
  resembling a Linked List, tanking operations to O(N) worst-case.
* **The Modern Solution:** Flatten the graph dynamically during traversal (`ids[i] = find(ids[i])`) to achieve an
  amortized inverse Ackermann time complexity $O(\alpha(N))$.

---

## 🔍 How to Identify Union-Find Problems

Look for problems that fit this specific mental checklist:

1. **Connected Components / Graphs:** The question asks you to find the total number of distinct clusters, groups, or
   islands.
2. **Dynamic Merging / Equivalence:** Elements are continuously grouped or partitioned together in real-time updates.
3. **Cycle Detection:** Checking if adding a structural edge between two nodes connects already united groups.

---

## 🛠️ Universal Master Template (Java)

This reusable structural blueprint fits almost all Union-Find problems. You only need to configure structural grouping
metrics or custom constraints depending on your specific puzzle rules.

```java
import java.util.*;

public class UnionFind {
    private int[] ids;
    private int count; // Tracks overall number of independent groups

    public UnionFind(int n) {
        ids = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    public int find(int i) {
        if (i != ids[i]) {
            ids[i] = find(ids[i]); // Path compression
        }
        return ids[i];
    }

    public boolean union(int i, int j) {
        int rootX = find(i);
        int rootY = find(j);

        if (rootX != rootY) {
            ids[rootX] = rootY;
            count--;
            return true; // Elements were newly connected
        }
        return false; // Elements already belonged to the same set
    }

    public int getCount() {
        return count;
    }
}
```

1. [3619. Count Islands With Total Value Divisible by K](https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k)

---

## 📝 Practice Example Application

### LeetCode: Count Islands with Total Value Divisible by K

When exploring grid graphs like finding divisible island sums, we map 2D coordinates `(i, j)` to a 1D structural flat
mapping pointer `i * columns + j`.

```java
class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid.length;
        UnionFind uf = new UnionFind(m * n);

        // Scan adjacent spaces using a single array for 4-directional moves
        int[] directions = new int[]{0, 1, 0, -1, 0};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    for (int d = 0; d < 4; d++) {
                        int x = i + directions[d];
                        int y = j + directions[d + 1];
                        if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] != 0) {
                            uf.union(i * n + j, x * n + y);
                        }
                    }
                }
            }
        }

        // Aggregate total grid weight items directly under their canonical tree root IDs
        Map<Integer, Long> islandWeights = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    int rootId = uf.find(i * n + j);
                    islandWeights.put(rootId, islandWeights.getOrDefault(rootId, 0L) + grid[i][j]);
                }
            }
        }

        // Quantify criteria
        int validIslands = 0;
        for (long weightSum : islandWeights.values()) {
            if (weightSum % k == 0) {
                validIslands++;
            }
        }
        return validIslands;
    }
}
```

## ⚠️ Caveat: Tracking Visited Cells vs. Static Grids

A common question when implementing Union-Find on a matrix grid is whether an explicit `visited` boundary framework is
required.

* **Static Grids (No Visited Array Needed):** For standard static problems, the `find()` lookup automatically serves as
  a connectivity check. If two adjacent active nodes already resolve to the same canonical component root (
  `rootX == rootY`), the `union()` operation safely rejects the redundant connection and prevents cycles or infinite
  processing loops. This is different from a DFS which usually does require a visited set.
* **Dynamic Grids (Explicit Tracking Required):** If the grid graph evolves dynamically over time—such as adding or
  activating cells sequentially (e.g., LeetCode 305: *Number of Islands II*)—an internal structural tracker (like a
  `boolean[][] isValid` array or a hash set) is **mandatory**. Without validating whether an adjacent target neighbor is
  actually active, a component lookup could prematurely link a newly introduced land mass to uninitialized or empty
  space coordinates.

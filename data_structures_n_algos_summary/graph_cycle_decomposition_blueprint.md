# Graph Cycle Decomposition & Sorting Permutations Blueprint

This repository section serves as a centralized reference for the **Graph Cycle Decomposition** paradigm, specifically
focusing on sorting array permutations, finding minimum swap thresholds, and utilizing primitive index arrays over heavy
object structures.

## 💡 Core Conceptual Framework

The graph cycle decomposition pattern treats an array permutation as a **directed graph**. Every mismatched element at
index `i` points to the target index `j` where it belongs in the fully sorted array.

### Fundamental Mechanics

* **Closed Loop Networks:** Because every element has exactly one correct target destination, the entire array can be
  broken down into isolated, independent closed loops (cycles).
* **The Cycle Swap Rule (\(L - 1\)):** For any isolated cycle of length \(L\), it always takes exactly **\(L - 1\)**
  swaps to restore all elements in that cycle to their correct positions.
* **Self-Loops (\(L = 1\)):** If an element is already in its proper position, its target index matches its current
  index (\(i == \text{target}[i]\)). Its cycle length is \(1\), requiring \(1 - 1 = 0\) swaps.

---

## 🛠️ Strategy: Index Arrays & Cycle Counting

### Core Mechanics

* **Primitive Arrays over Heaps:** Avoid using heavy object/heap wrappers like `PriorityQueue`. Instead, map metadata
  directly into primitive multi-dimensional layouts (e.g., `int[][]` containing
  `[original_index, sort_key_1, sort_key_2]`) and sort with `Arrays.sort()`. This leverages contiguous sequential blocks
  of memory and avoids garbage collection overhead.
* **Skipping Simulation:** Never physically swap elements sequentially. Simulating the permutation steps leads to
  sub-optimal complexity and fragile edge-case handling. Instead, find the cycle tracks to compute the swap count
  mathematically in a single linear pass (\(O(N)\)).
* **Single-Pass Visited Inversion:** Use a small boolean `visited` tracking array. Once a cycle path is traced, mark
  every node in that cycle as `true`. This prevents redundant traversals, keeping the overall cycle checking loop
  strictly linear.

### Concrete Example & Walkthrough

Imagine a mismatched array where indices point to these target slots:

* Index `0` wants to go to Index `1`
* Index `1` wants to go to Index `2`
* Index `2` wants to go to Index `0`

Let's trace how the tracking logic processes this cycle starting at `i = 0`:

* **Iteration 1:** `j = 0` | Mark position 0 `visited` | Next destination `j = target -> 1` | `cycleSize = 1`
* **Iteration 2:** `j = 1` | Mark position 1 `visited` | Next destination `j = target -> 2` | `cycleSize = 2`
* **Iteration 3:** `j = 2` | Mark position 2 `visited` | Next destination `j = target -> 0` | `cycleSize = 3`
* **Iteration 4:** `j = 0` | Index 0 is already marked `visited` | The loop breaks.

**Result:** A single cycle of size `3` is isolated. Swaps added: `3 - 1 = 2`.

---

## 📋 Implementation Blueprint

Whenever a problem asks to find the minimum swaps needed to arrange or sort elements under a specific condition, utilize
this standardized layout:

```java
import java.util.Arrays;

class GraphCycleBlueprint {
    public int minSwapsToSort(int[] nums) {
        int n = nums.length;

        // 1. Pack data into an index layout: [original_index, custom_sort_key]
        int[][] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i][0] = i;                  // Keep track of original index
            elements[i][1] = getSortKey(nums[i]); // Compute primary sort criteria
        }

        // 2. Sort indices according to target rules
        Arrays.sort(elements, (a, b) -> Integer.compare(a[1], b[1]));

        // 3. Decompose the graph into cycles and aggregate lengths
        int swaps = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            // Skip if already evaluated or already sitting in the correct target position
            if (visited[i] || elements[i][0] == i) {
                continue;
            }

            // Traverse the cycle to find its length (L)
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = elements[j][0]; // Move to its original index destination
                cycleSize++;
            }

            // Accumulate swaps needed for this cycle
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    private int getSortKey(int num) {
        // Implement custom transformation / digit summing rules here
        return num;
    }
}
```

---

## 📚 Related LeetCode Problems

1. [LeetCode 3551: Minimum Swaps to Sort by Digit Sum](https://leetcode.com/problems/minimum-swaps-to-sort-by-digit-sum)
2. [LeetCode 765: Couples Holding Hands](https://leetcode.com/problems/couples-holding-hands/description/)
3. [LeetCode 2471: Minimum Number of Operations to Sort a Binary Tree by Level](https://leetcode.com/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level/description/)
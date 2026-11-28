# 18. Dynamic Programming - Multidimensional & 0/1 Knapsack

This section covers multi-variable Dynamic Programming paradigms—including **2D Grid Traversal**, **String Sequence Alignment (LCS / Edit Distance)**, and **0/1 Knapsack** state-compressed DP.

---

## Part I: 2D Multi-Variable State Tracking (Grid & Alignment)

### Core Mechanics
When decisions depend on multiple independent variables (e.g., coordinates in a grid `(i, j)`, matching characters between two strings `s1[i]` and `s2[j]`), states are represented using a 2D matrix where coordinates track indices across both dimensions.

### Case A: Grid Traversal & Paths
Used for problems calculating optimal paths, path counts, or minimum costs across a matrix.

```java
// Standard 2D Grid Path Template
public int minPathSum(int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;
    int[][] dp = new int[rows][cols];
    
    // 1. Base Case: Starting Cell
    dp[0][0] = grid[0][0];
    
    // 2. Base Cases: First Row (Can only move right)
    for (int j = 1; j < cols; j++) {
        dp[0][j] = dp[0][j - 1] + grid[0][j];
    }
    
    // 3. Base Cases: First Column (Can only move down)
    for (int i = 1; i < rows; i++) {
        dp[i][0] = dp[i - 1][0] + grid[i][0];
    }
    
    // 4. State Transition for Inner Cells
    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
        }
    }
    
    return dp[rows - 1][cols - 1];
}
```

### Case B: String Sequence Alignment (LCS / Edit Distance)
Used when matching subsequences or editing text across two structural input dimensions.

```java
// Standard Longest Common Subsequence Template
public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    // dp[i][j] tracks LCS length for text1[0...i-1] and text2[0...j-1]
    int[][] dp = new int[m + 1][n + 1];
    
    // Iterative Sequence Matching Loop
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                // Characters match -> extend current sequence
                dp[i][j] = 1 + dp[i - 1][j - 1];
            } else {
                // Mismatch -> choose the best option from dropping one character
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }
    
    return dp[m][n];
}
```

---

## Part II: 0/1 Knapsack Dynamic Programming

*(Consolidated from `0_1_knapsack_dynamic_programming.md`)*

The **0/1 Knapsack problem** is a classic dynamic programming pattern where you select a subset of items—each used **at most once** (either `0` or `1` time)—to maximize total value without exceeding a fixed capacity limit.

### 1. Core Components & State Definition

Every 0/1 Knapsack problem maps onto three building blocks:

* **Capacity ($W$):** The maximum budget, weight, or sum allowed (e.g., `budget`).
* **Items:** A list of choices, where item $i$ has a cost/weight $w_i$ and a reward/value $v_i$.
* **DP State (`dp[c]`):** The maximum value achievable using a subset of items with total weight at most `c` (or exact weight `c`, depending on initialization).

### 2. Why the Inner Loop Iterates Backwards

When compressing the 2D table `dp[i][c]` into a 1D array `dp[c]`, the direction of the capacity loop determines whether items can be reused:

* **0/1 Knapsack (Backward: `c = W` down to `w_i`):**
    * When computing `dp[c] = Math.max(dp[c], dp[c - w_i] + v_i)`, `dp[c - w_i]` still holds the result from the **previous item** (`i - 1`).
    * This guarantees item $i$ is added **at most once**.
* **Unbounded Knapsack (Forward: `c = w_i` up to `W`):**
    * `dp[c - w_i]` may already include item $i$ from earlier in the same pass, allowing **unlimited copies** of item $i$.

### 3. Standard Java Templates

#### A. Maximization (At Most Capacity $W$)
Initialize `dp` with `0`. Every `dp[c]` represents the best value for capacity $\le c$.

```java
int[] dp = new int[W + 1];
for (int i = 0; i < n; i++) {
    for (int c = W; c >= weights[i]; c--) {
        dp[c] = Math.max(dp[c], dp[c - weights[i]] + values[i]);
    }
}
return dp[W];
```

#### B. Exact Target / Subset Sum (Boolean Reachability)
Initialize `dp[0] = true` and the rest `false`. Used when checking if an exact sum `target` can be formed.

```java
boolean[] dp = new boolean[target + 1];
dp[0] = true;
for (int num : nums) {
    for (int s = target; s >= num; s--) {
        dp[s] = dp[s] || dp[s - num];
    }
}
return dp[target];
```

### 4. Common 0/1 Knapsack Variations on LeetCode

Recognizing disguised 0/1 Knapsack problems comes down to spotting a fixed list of elements where each element is picked once toward a target sum or limit:

| Problem | Disguised Weight ($w_i$) | Disguised Value / Goal |
| :--- | :--- | :--- |
| **Partition Equal Subset Sum** (LC 416) | Array element `nums[i]` | Boolean reachability of `totalSum / 2` |
| **Target Sum** (LC 494) | Array element `nums[i]` | Count ways to reach `(totalSum + target) / 2` |
| **Last Stone Weight II** (LC 1049) | Stone weight `stones[i]` | Closest subset sum to `totalSum / 2` |
| **Ones and Zeroes** (LC 474) | 2D weight: `(zeros_i, ones_i)` | Max string count (`+1`) within `(m, n)` limits |

### 5. Complexity & When Not to Use It

* **Time Complexity:** $O(n \cdot W)$
* **Space Complexity:** $O(W)$
* **Rule of Thumb:** Standard DP works well when $n \cdot W \le 10^7$. If capacity $W$ is huge (e.g., $10^9$) while the total value $V$ is small, flip the DP state so `dp[v]` stores the **minimum weight** needed to achieve value `v`.

---

## Canonical Multidimensional LeetCode Mappings

1. [LeetCode 62: Unique Paths](https://leetcode.com/problems/unique-paths/)
2. [LeetCode 64: Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/)
3. [LeetCode 1143: Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
4. [LeetCode 72: Edit Distance](https://leetcode.com/problems/edit-distance/)
5. [LeetCode 714: Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)

# Dynamic Programming & Recurrence Paradigms

This repository section serves as a centralized reference for the **Dynamic Programming (DP)** paradigm, specifically focusing on structural variations like **Bottom-Up Tabulation (Iterative)**, **Top-Down Memoization (Recursive)**, and **State/Space Optimization** techniques.

---

## 💡 Core Conceptual Framework

The Dynamic Programming pattern is used to solve complex problems by breaking them down into simpler, overlapping subproblems. It optimizes exponential time complexities down to polynomial or linear time by caching redundant computations.

### Fundamental Mechanics

* **Overlapping Subproblems (`cache`)**: The problem can be broken down into smaller subproblems which are reused multiple times.
* **Optimal Substructure (`recurrence`)**: The optimal solution to the global problem can be constructed efficiently from the optimal solutions of its subproblems.
* **State Definition (`dp[i]`)**: The precise formulation of what an entry or state represents (e.g., "the minimum cost to reach index `i`").

---

## 📑 Strategy 1: Bottom-Up Dynamic Programming (Tabulation)

### Core Mechanics
* **Direction**: Iterates from the smallest base cases up to the target state.
* **Data Structure**: Uses an array or table (`dp[]`) to store the results of all subproblems sequentially.

### Implementation Blueprint

```java
public int solveBottomUp(int[] input) {
    int n = input.length;
    if (n == 0) return 0;

    // 1. Initialize the DP table matching the state dimensions
    int[] dp = new int[n];

    // 2. Define and seed Base Cases
    dp[0] = input[0];
    if (n > 1) {
        dp[1] = Math.max(input[0], input[1]); // Example condition
    }

    // 3. Iteratively fill the table using the recurrence relation
    for (int i = 2; i < n; i++) {
        // Example: dp[i] = current_value + optimal(previous_states)
        dp[i] = input[i] + Math.max(dp[i - 1], dp[i - 2]);
    }

    // 4. Return the final objective state
    return dp[n - 1];
}
```

---

## 📑 Strategy 2: Top-Down Dynamic Programming (Memoization)

### Core Mechanics
* **Direction**: Starts at the global target state and recursively breaks it down, solving top-to-bottom.
* **Data Structure**: Uses a hash map or array (`memo[]`) initialized with default empty values (e.g., `-1`) to short-circuit repeated execution branches.

### Implementation Blueprint

```java
class Solution {
    private int[] memo;

    public int solveTopDown(int[] input) {
        int n = input.length;
        this.memo = new int[n];
        // Initialize memoization table with an unvisited marker
        Arrays.fill(memo, -1);
        
        return dfs(input, n - 1);
    }

    private int dfs(int[] input, int i) {
        // 1. Base Cases
        if (i < 0) return 0;
        if (i == 0) return input[0];

        // 2. Look up cache to short-circuit overlapping paths
        if (memo[i] != -1) {
            return memo[i];
        }

        // 3. Compute the state using the recurrence relation recursively
        int choice1 = dfs(input, i - 1);
        int choice2 = dfs(input, i - 2);
        
        memo[i] = input[i] + Math.max(choice1, choice2);
        return memo[i];
    }
}
```

---

## 📑 Strategy 3: Space-Optimized Dynamic Programming

### Core Mechanics
* **Sliding Window of States**: When a state `dp[i]` only relies on a fixed number of preceding states (e.g., `dp[i-1]` and `dp[i-2]`), the full table can be replaced by scalar trackers to compress space complexity from $O(N)$ down to $O(1)$.

### Implementation Blueprint

```java
public int solveSpaceOptimized(int[] input) {
    int n = input.length;
    if (n == 0) return 0;
    if (n == 1) return input[0];

    // Track only the required past states
    int first = input[0];
    int second = Math.max(input[0], input[1]);

    for (int i = 2; i < n; i++) {
        // Calculate the current state from previous states
        int current = input[i] + Math.max(first, second);
        
        // Shift variables forward
        first = second;
        second = current;
    }

    return second;
}
```
---

## 📂 Strategy 4: 2D Multi-Variable State Tracking (Grid & Alignment)

### Core Mechanics
When decisions depend on multiple independent variables (e.g., coordinates in a grid `(i, j)`, matching characters between two strings `s1[i]` and `s2[j]`), states are represented using a 2D matrix where coordinates track indices across both dimensions.

#### 💡 Case A: Grid Traversal & Paths
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

#### 💡 Case B: String Sequence Alignment (LCS / Edit Distance)
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

## 🎯 Canonical LeetCode Mappings

1. [LeetCode 70: Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
2. [LeetCode 746: Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)
3. [LeetCode 198: House Robber](https://leetcode.com/problems/house-robber/)
4. [LeetCode 64: Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/)
5. [LeetCode 1143: Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
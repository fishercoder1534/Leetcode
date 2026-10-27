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

## 🎯 Standard LeetCode Classifications

1. [LeetCode 70: Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) (Linear State Progression)
2. [LeetCode 198: House Robber](https://leetcode.com/problems/house-robber/) (Include/Exclude Decision State)
3. [LeetCode 322: Coin Change](https://leetcode.com/problems/coin-change/) (Unbounded Knapsack / Min-Max Optimization)

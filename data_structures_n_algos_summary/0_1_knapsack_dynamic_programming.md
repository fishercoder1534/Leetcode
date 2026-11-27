# 0/1 Knapsack Dynamic Programming

The **0/1 Knapsack problem** is a classic dynamic programming pattern where you select a subset of items—each used **at most once** (either `0` or `1` time)—to maximize total value without exceeding a fixed capacity limit.

---

## 1. Core Components & State Definition

Every 0/1 Knapsack problem maps onto three building blocks:

* **Capacity ($W$):** The maximum budget, weight, or sum allowed (e.g., `budget`).
* **Items:** A list of choices, where item $i$ has a cost/weight $w_i$ and a reward/value $v_i$.
* **DP State (`dp[c]`):** The maximum value achievable using a subset of items with total weight at most `c` (or exact weight `c`, depending on initialization).

---

## 2. Why the Inner Loop Iterates Backwards

When compressing the 2D table `dp[i][c]` into a 1D array `dp[c]`, the direction of the capacity loop determines whether items can be reused:

* **0/1 Knapsack (Backward: `c = W` down to `w_i`):**
    * When computing `dp[c] = Math.max(dp[c], dp[c - w_i] + v_i)`, `dp[c - w_i]` still holds the result from the **previous item** (`i - 1`).
    * This guarantees item $i$ is added **at most once**.
* **Unbounded Knapsack (Forward: `c = w_i` up to `W`):**
    * `dp[c - w_i]` may already include item $i$ from earlier in the same pass, allowing **unlimited copies** of item $i$.

---

## 3. Standard Java Templates

### A. Maximization (At Most Capacity $W$)
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

### B. Exact Target / Subset Sum (Boolean Reachability)
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

---

## 4. Common 0/1 Knapsack Variations on LeetCode

Recognizing disguised 0/1 Knapsack problems comes down to spotting a fixed list of elements where each element is picked once toward a target sum or limit:

| Problem | Disguised Weight ($w_i$) | Disguised Value / Goal |
| :--- | :--- | :--- |
| **Partition Equal Subset Sum** (LC 416) | Array element `nums[i]` | Boolean reachability of `totalSum / 2` |
| **Target Sum** (LC 494) | Array element `nums[i]` | Count ways to reach `(totalSum + target) / 2` |
| **Last Stone Weight II** (LC 1049) | Stone weight `stones[i]` | Closest subset sum to `totalSum / 2` |
| **Ones and Zeroes** (LC 474) | 2D weight: `(zeros_i, ones_i)` | Max string count (`+1`) within `(m, n)` limits |

---

## 5. Complexity & When Not to Use It

* **Time Complexity:** $O(n \cdot W)$
* **Space Complexity:** $O(W)$
* **Rule of Thumb:** Standard DP works well when $n \cdot W \le 10^7$. If capacity $W$ is huge (e.g., $10^9$) while the total value $V$ is small, flip the DP state so `dp[v]` stores the **minimum weight** needed to achieve value `v`.

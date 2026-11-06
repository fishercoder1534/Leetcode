# The Monotonic Stack Paradigm: A Comprehensive Guide

A **monotonic stack** is a specialized stack data structure that maintains its elements in a strict sorted order (either strictly increasing or strictly decreasing) from bottom to top. It optimizes brute-force $O(N^2)$ backward/forward nested lookups into highly efficient **$O(N)$ time** complexity.

---

## ⚡ Java Performance Note: `Deque` vs. `Stack`

In Java, **`ArrayDeque` performs significantly better than `Stack`**.

- **The Problem with `java.util.Stack`:** It is a legacy class that extends `Vector`. Because of this, every single operation (`push`, `pop`, `peek`) is **synchronized**. This thread-safety synchronization introduces massive performance overhead in single-threaded environments like algorithm execution.
- **The Modern Solution:** Use `ArrayDeque` via the `Deque` interface (`Deque<Integer> stack = new ArrayDeque<>();`). It is unsynchronized, faster, and memory-efficient.

---

## 🔍 How to Identify Monotonic Stack Problems

Look for problems that fit this specific mental checklist:

1. **Linear Scans with Back-tracking Rules:** The question asks you to find the "next" or "previous" element that is "greater" or "smaller" than the current element.
2. **Subarray Limits or Domination:** Elements act as local boundaries or dominate an index range until a certain condition cuts them off (e.g., boundaries for water trapping, histogram heights, or maximum distance ramps).
3. **Brute-Force $O(N^2)$ Setup:** You instinctively want to write a nested loop looking ahead or behind for a boundary condition.

---

## 📋 Universal Master Template: Single-Pass (Java)

This reusable structural blueprint fits standard next/previous element problems. You only need to configure the **comparison operator** inside the `while` block and your specific evaluation logic.

```java
import java.util.ArrayDeque;
import java.util.Deque;

public int[] masterMonotonicStack(int[] arr) {
    int n = arr.length;
    int[] result = new int[n];

    // Using ArrayDeque for optimal single-threaded performance
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
        // 1. Maintain Monotonicity Rule
        // Use '>' for Monotonic Decreasing, '<' for Monotonic Increasing
        while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {

            // 2. Process and pop elements that break the sorted property
            int poppedIndex = stack.pop();

            // 3. Problem-Specific Evaluation Logic
            result[poppedIndex] = i - poppedIndex;
        }

        // 4. Push current state tracking parameter
        stack.push(i);
    }
    return result;
}
```

---

## 🔄 Two-Pass Monotonic Stack (Index Candidate + Reverse Scan)

This pattern applies to problems like **LeetCode 962 (Maximum Width Ramp)** and **LeetCode 1124 (Longest Well-Performing Interval)**, where:
1. You need to find pairs $(i, j)$ such that $i < j$ satisfying a specific condition (e.g., $nums[i] \le nums[j]$).
2. You want to maximize or minimize a distance/width ($j - i$).
3. Pre-filtering potential starting candidates ($i$) into a monotonic sequence eliminates redundant checks.

### Key Algorithmic Steps

1. **Pass 1 (Filter Candidates - Left to Right):** 
   Build a monotonic stack of **indices** containing only potential starting bounds. For maximum width ramp ($i < j$ with $nums[i] \le nums[j]$), any index $k > i$ with $nums[k] \ge nums[i]$ can never yield a wider ramp than $i$, so we only push indices when values strictly decrease (`nums[stack.peek()] > nums[i]`).

2. **Pass 2 (Maximize Gap - Right to Left):** 
   Iterate backwards from $j = N - 1$ down to $0$. While the current end element satisfies the condition with the index at `stack.peek()`, pop from the stack and update the global result (`j - stack.pop()`). Popping is safe because $j$ moves leftward, so an index $i$ popped for a larger $j$ can never achieve a larger width with a smaller $j$.

### Java Template: Two-Pass Pattern

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicStackTwoPassTemplate {

    /**
     * Template for finding max index distance (j - i) where i < j and condition(nums[i], nums[j]) holds.
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public int solveTwoPassMonotonicStack(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxResult = 0;

        // Pass 1: Build monotonic stack of candidate starting indices (Left to Right)
        for (int i = 0; i < nums.length; i++) {
            // Adjust comparison operator ('>' vs '<') based on candidate criteria
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        // Pass 2: Evaluate matching pairs moving backwards (Right to Left)
        for (int j = nums.length - 1; j >= 0; j--) {
            // While the condition between candidate start index and current end index is met
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                int i = stack.pop();
                maxResult = Math.max(maxResult, j - i);
            }
        }

        return maxResult;
    }
}
```

---

## 🛠️ Selection Decision Matrix

| Intended Goal | Required Stack Property | Loop Comparison Condition |
| :--- | :--- | :--- |
| **Next Greater Element** | Monotonic Decreasing | `current > top_of_stack` |
| **Next Smaller Element** | Monotonic Increasing | `current < top_of_stack` |
| **Previous Greater Element** | Monotonic Decreasing | Process backward *OR* test leftwards elements |
| **Previous Smaller Element** | Monotonic Increasing | Process backward *OR* test leftwards elements |

---

## ⚖️ When to Use Single-Pass vs. Two-Pass Monotonic Stack

| Property | Single-Pass Stack | Two-Pass Candidate Stack |
| :--- | :--- | :--- |
| **Typical Goal** | Next/Previous Greater/Smaller element immediately adjacent to bound | Global maximum width/distance $(j - i)$ across entire array |
| **Traversal** | Single scan ($O(N)$) | Forward pass to collect starts, backward pass to match ends ($O(N)$) |
| **Stack Content** | Maintains active monotonic boundary | Stores candidate left-boundaries $i$ |
| **Example Problems** | 739. Daily Temperatures<br>496. Next Greater Element I<br>503. Next Greater Element II | 962. Maximum Width Ramp<br>1124. Longest Well-Performing Interval |

---

## 🏗️ Structural Stack Topology Visualization

#### Monotonic Decreasing Stack Layout

```text
 TOP OF STACK  -->  [ Index holding the COLDEST / SMALLEST element ]
                    [ Index holding a mid-range element ]
                    [ Index holding a slightly warmer element ]
BOTTOM OF STACK -->  [ Index holding the WARMEST / LARGEST element ]
```

*Elements are kept sorted downwards. Any incoming item larger than the top forces a series of `pop()` operations.*

---

## 📝 Real-World Case Study: LeetCode 739. Daily Temperatures

**Problem Statement:** Given an array of integers `temperatures`, return an array `answer` such that `answer[i]` is the number of days you have to wait after the $i$-th day to get a warmer temperature. If no such day is possible, keep it `0`.

### Standard Implementation using `ArrayDeque`

```java
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return answer;
    }
}
```

### ⚡ Ultra-Performance Primitive Array Variant

In extreme competitive programming scenarios, you can completely eliminate standard object wrappers and garbage-collection overhead by simulating a stack allocation directly inside a raw integer array.

```java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && temperatures[i] > temperatures[stack[top]]) {
                int prevIndex = stack[top--];
                answer[prevIndex] = i - prevIndex;
            }
            stack[++top] = i;
        }
        return answer;
    }
}
```
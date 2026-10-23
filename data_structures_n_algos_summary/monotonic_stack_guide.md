# The Monotonic Stack Paradigm: A Comprehensive Guide

A **monotonic stack** is a specialized stack data structure that maintains its elements in a strict sorted order (either
strictly increasing or strictly decreasing) from bottom to top. It optimizes brute-force $O(N^2)$ backward/forward
nested lookups into highly efficient **$O(N)$ time** complexity.

---

## ⚡ Java Performance Note: `Deque` vs. `Stack`

In Java, **`ArrayDeque` performs significantly better than `Stack`**.

* **The Problem with `java.util.Stack`:** It is a legacy class that extends `Vector`. Because of this, every single
  operation (`push`, `pop`, `peek`) is **synchronized**. This thread-safety synchronization introduces massive
  performance overhead in single-threaded environments like algorithm execution.
* **The Modern Solution:** Use `ArrayDeque` via the `Deque` interface (`Deque<Integer> stack = new ArrayDeque<>();`). It
  is unsynchronized, faster, and memory-efficient.

---

## 🔍 How to Identify Monotonic Stack Problems

Look for problems that fit this specific mental checklist:

1. **Linear Scans with Back-tracking Rules:** The question asks you to find the "next" or "previous" element that is "
   greater" or "smaller" than the current element.
2. **Subarray Limits or Domination:** Elements act as local boundaries or dominate an index range until a certain
   condition cuts them off (e.g., boundaries for water trapping or histogram heights).
3. **Brute-Force $O(N^2)$ Setup:** You instinctively want to write a nested loop looking ahead or behind for a boundary
   condition.

---

## 📋 Universal Master Template (Java)

This reusable structural blueprint fits almost all monotonic stack problems. You only need to configure the **comparison
operator** inside the `while` block and your specific evaluation logic.

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

## 🛠️ Selection Decision Matrix

| Intended Goal                | Required Stack Property | Loop Comparison Condition                     |
|:-----------------------------|:------------------------|:----------------------------------------------|
| **Next Greater Element**     | Monotonic Decreasing    | `current > top_of_stack`                      |
| **Next Smaller Element**     | Monotonic Increasing    | `current < top_of_stack`                      |
| **Previous Greater Element** | Monotonic Decreasing    | Process backward *OR* test leftwards elements |
| **Previous Smaller Element** | Monotonic Increasing    | Process backward *OR* test leftwards elements |

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

**Problem Statement:** Given an array of integers `temperatures`, return an array `answer` such that `answer[i]` is the
number of days you have to wait after the $i$-th day to get a warmer temperature. If no such day is possible, keep it
`0`.

### Implementation using `ArrayDeque`

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

In extreme competitive programming scenarios, you can completely eliminate standard object wrappers and
garbage-collection overhead by simulating a stack allocation directly inside a raw integer array.

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

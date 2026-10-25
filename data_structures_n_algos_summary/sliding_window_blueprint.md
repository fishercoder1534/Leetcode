# Sliding Window & Window-Tracking Paradigms

This repository section serves as a centralized reference for the **Sliding Window paradigm**, specifically focusing on
variations like the **Dynamic Sliding Window**, **Two-Pointer / Window-Tracking** techniques, and **Fixed-Size Window**
approaches.

---

## 💡 Core Conceptual Framework

The sliding window pattern is used to perform required operations on a specific window size of a given array or string,
reducing the time complexity from $O(N^2)$ to $O(N)$.

### Fundamental Mechanics

* **Window Expansion (`right++`)**: Progressively includes new elements into the current state tracking subproblem.
* **Window Contraction (`left++`)**: Shrinks the window boundaries from the left when specific constraints or validation
  conditions are violated.
* **Hard Barriers**: Invalid or out-of-bounds elements that break structural properties, forcing the window size to
  reset completely.

---

## 📑 Strategy 1: Dynamic Window / Window-Tracking

### Core Mechanics

* **The Sliding Window / Two-Pointer Concept:** You maintain an active window `[left...right]`.
    * **Hard Barriers**: When you hit an out-of-bounds or invalid element, it acts as a hard barrier.
    * **Pointer Snap**: This barrier forces the `left` pointer to jump immediately past it, shrinking your window to a
      size of `0` and resetting your active streak.
* **The "Number of Subarrays Ending at i" Counting Template:** A ubiquitous template used across competitive programming
  for counting contiguous structures.

> **The Rule of Thumb:** Every time you extend a valid window of size `K` by 1 new element, you exactly introduce `K`
> new subarrays that end at that new element.

### Concrete Example & Walkthrough

If your active valid window is `[2, 4]` and you introduce `3`:

* The window expands to `[2, 4, 3]` (New Length $K = 3$).
* The new valid subarrays ending strictly at `3` are exactly equal to the new length: `[3]`, `[4, 3]`, and `[2, 4, 3]`.

### Implementation Blueprint

Whenever a problem asks to **"Count subarrays satisfying condition X"**, utilize this standardized tracking structure:

```java
  int count = 0;
  int windowSize = 0;
  
  for (int right = 0; right < n; right++) {
        if (conditionMet(arr[right])) {
          windowSize++;
          count += windowSize;
        } else {
          windowSize = 0; // Reset condition broken
        }
    }

```

1. [LeetCode 713: Subarray Product Less Than K](https://leetcode.com/problems/subarray-product-less-than-k/description/)
2. [LeetCode 2444: Count Subarrays With Fixed Bounds](https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/)
3. [LeetCode 2110: Number of Smooth Descent Periods of a Stock](https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/description/)

---

## 📑 Strategy 2: Monotonic Queue Window Tracking (Min/Max Variance Framework)

The framework is a powerful **Monotonic Sliding Window Framework for Dynamic Range Problems** designed to handle
scenarios where the relationship between the absolute maximum and absolute minimum inside a shifting frame must satisfy
a critical range criterion (e.g., $\max - \min \le K$ or $\max - \min \ge K$).

### 🧱 Core Structural Breakdown

1. **Tracking Extrema via Monotonic Pairs**
   When a window shifts, elements leave from the left. A simple scalar variable tracking a single `currentMax` or
   `currentMin` cannot identify what the *second* highest or lowest element is once the top candidate gets evicted.

* **Decreasing Deque:** Stores candidate *maximum* indices. Elements are kept strictly in a descending order of values
  from front to back.
* **Increasing Deque:** Stores candidate *minimum* indices. Elements are kept strictly in an ascending order of values
  from front to back.

2. **Index-First Storage Strategy**
   Storing **array indices** instead of values is what unlocks $O(1)$ window boundary checks. By comparing the index at
   the head of the deque to your current `left` pointer (`deque.peekFirst() < left`), you can instantly evict stale
   values that are no longer part of the sliding window layout grid.

3. **Linearized Time Complexity ($O(n)$)**
   Even though there are nested loops (`while` loops inside the main `for` loop), **every single element index is pushed
   to and popped from each deque at most once** across the entire lifecycle. This avoids recalculating ranges
   repeatedly, transforming an engineering problem from $O(n^2)$ down to a predictable linear $O(n)$ roadmap.

### Implementation Blueprint

This blueprint generalizes the pattern for any structural optimization problem (counting substrings/subarrays,
evaluating boundary ranges, or finding maximum length frames) constrained by window variance thresholds:

```java
public long solveWindowVariance(int[] nums, int limit) {
    Deque<Integer> maxDeque = new ArrayDeque<>(); // Keeps highest values at head
    Deque<Integer> minDeque = new ArrayDeque<>(); // Keeps lowest values at head
    long totalValidStructures = 0;
    int left = 0;

    for (int right = 0; right < nums.length; right++) {
        // 1. Maintain Monotonic Decreasing Order (Max Tracker)
        while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) {
            maxDeque.pollLast();
        }
        maxDeque.addLast(right);

        // 2. Maintain Monotonic Increasing Order (Min Tracker)
        while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right]) {
            minDeque.pollLast();
        }
        minDeque.addLast(right);

        // 3. Contract the window when your custom condition is broken
        // Change this condition depending on the problem variant
        while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
            left++;

            // Cleanup out-of-bounds indices from the front of both queues
            if (maxDeque.peekFirst() < left) {
                maxDeque.pollFirst();
            }
            if (minDeque.peekFirst() < left) {
                minDeque.pollFirst();
            }
        }

        // 4. Calculate structures (e.g., counting subarrays, maximizing length)
        // Variant A (Count total valid subarrays): totalValidStructures += (right - left + 1);
        // Variant B (Track max length window): totalValidStructures = Math.max(totalValidStructures, right - left + 1);
        totalValidStructures += (right - left + 1);
    }
    return totalValidStructures;
}
```

### 🎯 Common Abstract Variations

By tweaking steps 3 and 4 of the generalized blueprint, you can instantly solve multiple classic optimization
challenges:

* **Variant A: Longest Subarray with Constraint**
    * *Adjustment:* Instead of adding `right - left + 1` to a counter, use
      `maxLength = Math.max(maxLength, right - left + 1)`.
* **Variant B: Shortest Subarray Breaking Constraint**
    * *Adjustment:* Invert the loop contraction mechanism to minimize the frame whenever the target conditions are hit.

1. [LeetCode 2762: Continuous Subarrays](https://leetcode.com/problems/continuous-subarrays/description/)
2. [LeetCode 1438: Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/description/)

---

## 📑 Strategy 3: [Placeholder for Next Strategy]

*(Add future patterns here)*

# Sliding Window & Window-Tracking Paradigms

This repository section serves as a centralized reference for the **Sliding Window paradigm**, specifically focusing on variations like the **Dynamic Sliding Window**, **Two-Pointer / Window-Tracking** techniques, and **Fixed-Size Window** approaches.

---

## 💡 Core Conceptual Framework

The sliding window pattern is used to perform required operations on a specific window size of a given array or string, reducing the time complexity from $O(N^2)$ to $O(N)$. 

### Fundamental Mechanics
* **Window Expansion (`right++`)**: Progressively includes new elements into the current state tracking subproblem.
* **Window Contraction (`left++`)**: Shrinks the window boundaries from the left when specific constraints or validation conditions are violated.
* **Hard Barriers**: Invalid or out-of-bounds elements that break structural properties, forcing the window size to reset completely.

---

## 📑 Strategy 1: Dynamic Window / Window-Tracking

### Core Mechanics
* **The Sliding Window / Two-Pointer Concept:** You maintain an active window `[left...right]`.
  * **Hard Barriers**: When you hit an out-of-bounds or invalid element, it acts as a hard barrier.
  * **Pointer Snap**: This barrier forces the `left` pointer to jump immediately past it, shrinking your window to a size of `0` and resetting your active streak.
* **The "Number of Subarrays Ending at i" Counting Template:** A ubiquitous template used across competitive programming for counting contiguous structures.

> **The Rule of Thumb:** Every time you extend a valid window of size `K` by 1 new element, you exactly introduce `K` new subarrays that end at that new element.

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
1. https://leetcode.com/problems/subarray-product-less-than-k/description/
2. https://leetcode.com/problems/count-subarrays-with-loose-bounds/description/
3. https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/description/
---

## 📑 Strategy 2: [Placeholder for Next Strategy]

*(Add future patterns here, such as Fixed-Size Windows, Variable Windows with HashMaps, etc.)*

### Core Mechanics
* 

### Implementation Blueprint
```

---

## 📑 Strategy 3: [Placeholder for Next Strategy]

*(Add future patterns here)*
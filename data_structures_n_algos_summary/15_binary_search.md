# 15. Binary Search & Upper/Lower Bound Paradigms

Binary search is an efficiently optimized search algorithm that finds the position of a target value within a **sorted array** in **$O(\log N)$** time by repeatedly dividing the search interval in half.

## Key Paradigm: The Search Space Reduction

While basic binary search checks for an exact match, finding the **first or last valid index** (as seen in the Spells and Potions problem) requires a paradigm shift: tracking a global variable and aggressively narrowing boundaries.

### Core Mechanics

* **Condition (`left <= right`)**: Ensures every single element is checked, even when the search space shrinks down to a single element (`left == right`).
* **The "Crucial Fix" Variable (`firstValidIdx`)**: Instantly records a matching position but refuses to stop execution. It continues searching the remaining sub-array for an even better index.

---

## The Standard Templates

### 1. Exact Match Search

Use this when you only care if a target exists and want its exact index.

```java
public int binarySearchExact(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid; // Found exactly what we wanted
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1; // Element not found
}
```

### 2. First Valid Index Search (Lower Bound / Success Threshold)

Use this when finding the **leftmost index** that satisfies a condition (e.g., minimum potion strength). This prevents dropping into out-of-bounds errors when 0 elements match.

```java
public int findFirstValidIndex(int[] arr, int conditionThreshold) {
    int left = 0;
    int right = arr.length - 1;
    int firstValidIdx = arr.length; // Default to length (handles "0 valid elements" case)

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (isValid(arr[mid], conditionThreshold)) {
            firstValidIdx = mid; // Track the lowest valid index seen so far
            right = mid - 1;     // Aggressively search left for a smaller valid index
        } else {
            left = mid + 1;      // Current element is invalid; seek right
        }
    }
    return firstValidIdx;
}
```

---

## The Midpoint Mathematical Trap (Integer Overflow)

*(Migrated from `computer_science_fundamentals.md`)*

In Java (and many other languages), a standard 32-bit `int` has a maximum value of **2,147,483,647** (which is $2^{31} - 1$). If an operation exceeds this limit, it **overflows** and wraps around into a negative number. This introduces hidden bugs when calculating midpoints.

### The Problem

When searching through a massive array or a large search space, `left` and `right` can both be very large numbers.

Imagine a scenario where:

* `left = 1,500,000,000`
* `right = 2,000,000,000`

Both of these are valid, positive integers well under the maximum limit. However, look at what happens inside the standard `(left + right) / 2` calculation:

1. **The Addition Stage:** The code evaluates `left + right` first.
   $$1,500,000,000 + 2,000,000,000 = 3,500,000,000$$
2. **The Overflow:** Because $3,500,000,000$ is larger than $2,147,483,647$, the 32-bit integer capacity is breached. The bits wrap around, making the result a negative number: **$-794,967,296$**.
3. **The Division Stage:** The code then divides that wrapped value by 2:
   $$-794,967,296 / 2 = -397,483,648$$

Instead of finding a middle index around 1.75 billion, `mid` becomes a **negative number**, immediately crashing your program with an `ArrayIndexOutOfBoundsException`.

### Why `left + (right - left) / 2` is Safe

This formula alters the order of operations to ensure the intermediate values never exceed the maximum value of `right`:

1. **The Subtraction Stage:** It calculates the distance between the boundaries first: `right - left`.
   $$2,000,000,000 - 1,500,000,000 = 500,000,000$$
2. **The Division Stage:** It halves that distance: `(right - left) / 2`.
   $$500,000,000 / 2 = 250,000,000$$
3. **The Addition Stage:** It adds that safe half-distance back onto `left`:
   $$1,500,000,000 + 250,000,000 = 1,750,000,000$$

Because you subtract before adding, the intermediate values stay bounded, keeping the math safe.

---

## Key Takeaways for Debugging

* **Preventing Integer Overflow**: Always compute the middle index using `int mid = left + (right - left) / 2;` instead of `(left + right) / 2`.
* **Type Casting**: When multiplying inside conditions (e.g., `spell * potion`), cast to a `(long)` prior to evaluation to prevent numerical truncation.
* **The Default State**: Initialize your tracker variable to a fallback state (like `arr.length`) rather than `arr.length - 1` to gracefully handle boundaries where zero items match the criteria.

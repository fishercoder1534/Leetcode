# Binary Search & Upper/Lower Bound Paradigms

Binary search is an efficiently optimized search algorithm that finds the position of a target value within a **sorted
array** in **$O(\log N)$** time by repeatedly dividing the search interval in half.

## Key Paradigm: The Search Space Reduction

While basic binary search checks for an exact match, finding the **first or last valid index** (as seen in the Spells
and Potions problem) requires a paradigm shift: tracking a global variable and aggressively narrowing boundaries.

### Core Mechanics

* **Condition (`left <= right`)**: Ensures every single element is checked, even when the search space shrinks down to a
  single element (`left == right`).
* **The "Crucial Fix" Variable (`firstValidIdx`)**: Instantly records a matching position but refuses to stop execution.
  It continues searching the remaining sub-array for an even better index.

---

## 🛠️ The Standard Templates

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

Use this when finding the **leftmost index** that satisfies a condition (e.g., minimum potion strength). This prevents
dropping into out-of-bounds errors when 0 elements match.

```java
public int findFirstValidIndex(int[] arr, int conditionThreshold) {
    int left = 0;
    int right = arr.length - 1;
    int firstValidIdx = arr.length; // Default to length (handles "0 valid elements" case)

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (isValid(arr[mid], conditionThreshold)) {
            firstValidIdx = mid; // Track the lowest valid index seen so far
            right = mid - 1;     // Agreesively search left for a smaller valid index
        } else {
            left = mid + 1;      // Current element is invalid; seek right
        }
    }
    return firstValidIdx;
}
```

---

## 💡 Key Takeaways for Debugging

* **Preventing Integer Overflow**: Always compute the middle index using `int mid = left + (right - left) / 2;` instead
  of `(left + right) / 2`.
* **Type Casting**: When multiplying inside conditions (e.g., `spell * potion`), cast to a `(long)` prior to evaluation
  to prevent numerical truncation.
* **The Default State**: Initialize your tracker variable to a fallback state (like `arr.length`) rather than
  `arr.length - 1` to gracefully handle boundaries where zero items match the criteria.

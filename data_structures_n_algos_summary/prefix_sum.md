# Prefix Sum

### Overview
* **Prefix Sum** (also known as cumulative sum) is a preprocessing technique used to efficiently calculate the sum of elements in any contiguous subarray in **O(1)** time after **O(N)** setup.
* It creates an auxiliary array where each element at index `i` stores the sum of all elements from the start of the array up to `i - 1`.
* It typically replaces nested loops that repeatedly sum subarrays, optimizing time complexity from **O(N²)** down to **O(N)**.
* **Core Components:**
  * **1-Indexed Prefix Array:** Allocate size `N + 1` with `prefix[0] = 0` to eliminate boundary checks when querying from index `0`.
  * **Range Query Formula:** Compute the sum of inclusive range `[left, right]` using `prefix[right + 1] - prefix[left]`.
  * **Data Type Safety:** Default to `long[]` instead of `int[]` to prevent integer overflow on large constraints.

#### General Pattern
```java
void prefixSumPattern(int[] nums) {
    int n = nums.length;
    long[] prefix = new long[n + 1]; // 1. INITIALIZE (prefix[0] = 0)

    // 2. BUILD: Precompute cumulative sums in O(N)
    for (int i = 0; i < n; i++) {
        prefix[i + 1] = prefix[i] + nums[i];
    }

    // 3. QUERY: Get sum of any inclusive range [left, right] in O(1)
     long rangeSum = prefix[right + 1] - prefix[left];
}
```

### Alternative Pattern: Size `n` (0-Indexed)

* **Overview:** Instead of allocating `N + 1`, this approach allocates an array of size `N` where `prefix[i]` stores the **inclusive** cumulative sum from index `0` up to `i`.
* **Core Components:**
  * **0-Indexed Prefix Array:** Allocate size `N` and manually seed `prefix[0] = nums[0]` (requires an `n == 0` guard).
  * **Range Query Formula:** Compute the sum of inclusive range `[left, right]` using `prefix[right] - prefix[left - 1]`, guarding against `left == 0`.
  * **Best Use Case:** Ideal when building state arrays aligned 1-to-1 with `nums` indices (e.g., `oddPrefix[i]`, `evenPrefix[i]`) without frequent arbitrary sub-range queries.

```java
void prefixSumSizeN(int[] nums) {
    int n = nums.length;
    if (n == 0) return;

    // 1. INITIALIZE: size n, manually seed index 0
    long[] prefix = new long[n];
    prefix[0] = nums[0];

    // 2. BUILD: prefix[i] stores sum of nums[0...i] (inclusive)
    for (int i = 1; i < n; i++) {
        prefix[i] = prefix[i - 1] + nums[i];
    }

    // 3. QUERY: Get sum of any inclusive range [left, right] in O(1)
    // Must guard against left == 0 to avoid ArrayIndexOutOfBoundsException
    long rangeSum = (left == 0) ? prefix[right] : prefix[right] - prefix[left - 1];
}
```

### Comparison: Size `n` vs. Size `n + 1`

| Feature | Size `n` (0-Indexed) | Size `n + 1` (1-Indexed) |
| :--- | :--- | :--- |
| **Definition of `prefix[i]`** | Sum of `nums[0 ... i]` (**inclusive** of `i`) | Sum of `nums[0 ... i-1]` (**exclusive** of `i`) |
| **Initialization** | `prefix[0] = nums[0]` (requires `n > 0` check) | `prefix[0] = 0` (works naturally even if `n == 0`) |
| **Loop Bounds** | `for (int i = 1; i < n; i++)` | `for (int i = 0; i < n; i++)` |
| **Range Query `[left, right]`** | `prefix[right] - (left == 0 ? 0 : prefix[left - 1])` | `prefix[right + 1] - prefix[left]` |
| **Strictly Left of `i` (`[0, i-1]`)** | `(i == 0) ? 0 : prefix[i - 1]` | `prefix[i]` |
| **Strictly Right of `i` (`[i+1, n-1]`)** | `prefix[n - 1] - prefix[i]` | `prefix[n] - prefix[i + 1]` |


### Variation: Prefix **Product** (Dynamic Stream with Zero Reset)

* **Overview:** Adapts the 1-indexed prefix pattern from addition to multiplication, enabling O(1) suffix/range **product** queries on a dynamic stream while handling `0` resets.
* Core Components:
  * **Multiplicative Identity Base:** Initialize with `prefix[0] = 1` (instead of `0`) as the neutral base multiplier.
  * **Zero Reset Handling:** Because multiplying by `0` invalidates all prior cumulative products, clear the prefix list and reset it to `[1]` whenever `num == 0` arrives.
  * **Division Query Formula:** Compute the product of the last `k` elements using `prefix.get(n - 1) / prefix.get(n - 1 - k)`. If `k >= n`, a `0` occurred within the last `k` elements, so return `0`.
  * **Data Type Safety:** Default to `Long` instead of `Integer` if intermediate prefix products can exceed `Integer.MAX_VALUE` before a reset.

```java
class ProductOfNumbers {
    private List<Integer> prefix;

    public ProductOfNumbers() {
        // 1. INITIALIZE: 1-indexed base with multiplicative identity 1
        prefix = new ArrayList<>();
        prefix.add(1);
    }

    public void add(int num) {
        // 2. BUILD: Reset on 0, otherwise append running cumulative product in O(1)
        if (num == 0) {
            prefix.clear();
            prefix.add(1);
        } else {
            int lastProduct = prefix.get(prefix.size() - 1);
            prefix.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        // 3. QUERY: Get product of the last k elements in O(1)
        int n = prefix.size();
        if (k >= n) {
            return 0; // A zero was encountered within the last k elements
        }
        return prefix.get(n - 1) / prefix.get(n - 1 - k);
    }
}
```


-----------------


### Example: Subarray Sum Equals K
* Given an array of integers `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals `k`.
* **State Management:** A `HashMap<Long, Integer>` tracks running prefix sums and their frequencies (`{prefixSum : count}`).
* **Lookup Step:** If `currentSum - k` exists in the map, add its frequency to the total count because the subarray between those two indices sums to `k`.

#### Java
```java
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        long currentSum = 0;
        
        // Map stores: <PrefixSum, Frequency>
        Map<Long, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0L, 1); // Base case: a sum of 0 has occurred once

        for (int num : nums) {
            currentSum += num;

            // Check if there is a previous prefix sum such that:
            // currentSum - previousSum = k
            if (prefixCounts.containsKey(currentSum - k)) {
                count += prefixCounts.get(currentSum - k);
            }

            // Record the current prefix sum in the map
            prefixCounts.put(currentSum, prefixCounts.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
```

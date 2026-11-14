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

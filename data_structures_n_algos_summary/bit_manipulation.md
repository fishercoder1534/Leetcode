# Bit Manipulation

* **`^` exclusive or:**
    * This is incredibly useful in CS:
        * ** The XOR operator (`^`) outputs `true` if only one condition is true, canceling out identical values:
          * | Value A | Value B | Result (A ^ B) |
            | :--- | :--- | :--- |
            | `false` | `false` | `false` |
            | `false` | `true` | `true` |
            | `true` | `false` | `true` |
            | `true` | `true` | `false` |
        * **A number `^` with itself will result in zero:**
            * `num1 ^ num1 = 0`
        * **Toggling state:** Any number `^` with **_one_** will toggle every bit of this number:
            * It flips between 0 and 1 each time it runs:
            * `8 ^ 1 = 9` $\rightarrow$ `1000 ^ 0001 = 1001` $\rightarrow$ `9`
            * `7 ^ 1 = 6` $\rightarrow$ `0111 ^ 0001 = 0110` $\rightarrow$ `6`
            * `3 ^ 1 = 2` $\rightarrow$ `0011 ^ 0001 = 0010` $\rightarrow$ `2`
        * **It's perfectly reversible:**
            * **Encrypting:** Message `^` Key = Secret
                * 12 (message) `^` 7 (key) = 11 (secret)
                * `1100 ^ 0111 = 1011`
            * **Decrypting:** Secret `^` Key = Message
                * 11 (secret) `^` 7 (key) = 12 (message)
                * `1011 ^ 0111 = 1100`

---


# Common Bit Manipulation Recipes

| Task | Bitwise Expression | How It Works | Examples |
| :--- | :--- | :--- | :--- |
| **Check if i-th bit is set** | `(num & (1 << i)) != 0` | Shifts `1` left by `i` and masks `num` with `&`. | `(5 & (1 << 2)) != 0` &rarr; `True` (since `5` is `0101` and `1<<2` is `0100`) |
| **Set i-th bit** | `num \| (1 << i)` | Uses `\|` to set the i-th bit to `1`. | `5 \| (1 << 1)` &rarr; `7` (`0101 \| 0010 = 0111`) |
| **Clear i-th bit** | `num & ~(1 << i)` | Uses `&` with the inverse of the shifted mask. | `5 & ~(1 << 2)` &rarr; `1` (`0101 & ~0100 = 0001`) |
| **Toggle i-th bit** | `num ^ (1 << i)` | Flips the i-th bit using `^`. | `5 ^ (1 << 1)` &rarr; `7` (`0101 ^ 0010 = 0111`) |
| **Bitwise NOT / Complement** | `~num` | Flips every single bit in its binary representation (`0`s become `1`s, `1`s become `0`s). | `~5` &rarr; `-6` (using 32-bit signed integers, flips `0101` to `...1010`) |
| **Check if number is a power of 2** | `n > 0 && (n & (n - 1)) == 0` | Powers of 2 have only a single `1` bit; subtracting 1 flips all trailing bits. | `4 & 3` &rarr; `0` (`True`) |
| **Clear the rightmost set bit** | `n & (n - 1)` | Quickly strips off the lowest active `1` bit. | `6 & 5` &rarr; `4` (`0110 & 0101 = 0100`) |
| **Isolate the rightmost set bit** | `n & (-n)` | Returns a number with only the lowest `1` bit left. | `6 & -6` &rarr; `2` (`0110 & 1010 = 0010`) |

# 32-Bit Bitwise NOT (~) Deep Dive

Below are the comprehensive 32-bit binary representations and mathematical formulas for the bitwise NOT operation on both positive and negative integers.

| Operation | Mathematical Formula | 32-Bit Input Binary Representation | 32-Bit Flipped Binary Output | Decimal Result | Explanation |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **`~5`** | `~x = -(x + 1)`<br>`~5 = -(5 + 1) = -6` | `00000000 00000000 00000000 00000101` | `11111111 11111111 11111111 11111010` | **`-6`** | Flipping all bits of positive `5` sets the sign bit (the first bit) to `1`, signaling a negative integer. In standard Two's Complement encoding, this specific sequence evaluates to `-6`. |
| **`~-5`** | `~x = -(x + 1)`<br>`~(-5) = -(-5 + 1) = 4` | `11111111 11111111 11111111 11111011` | `00000000 00000000 00000000 00000100` | **`4`** | Flipped from negative `-5` (which begins with all `1`s), the output clearing all higher-order bits to `0` leaves only the 3rd bit set, which evaluates to a positive `4`. |
A good way to help memorize this is: step 1: add one to it; step 2: change the sign. Then you'll get the Bitwise NOT result of a given number.


## Advanced Recipes & Use Cases

### 1. Parity Checking & State Tracking via Bitmasks

When tracking a property with binary properties (like **Even vs Odd** or **True vs False**) across an alphabet or constrained set of choices, map individual items to explicit binary bits (`1 << i`) inside a single integer instead of using arrays or hash tables.

Combining this pattern with a **Prefix Snapshot Array** allows you to perform subrange parity checks in constant time.

#### How it Applies to the Prefix Array
Every snapshot in your `prefixMasks` array contains the running history of all characters from the **very beginning of the string** up to that point.

When you ask for a specific window from `left` to `right`, you can break the history down into two parts:

1. **The Prefix Trash:** The letters from index 0 up to `left - 1` (letters you don't care about).
2. **The Target Window:** The letters from index `left` to `right` (letters you do care about).

When you look up the two snapshots and XOR ($\oplus$) them together, look at what happens:

$$\text{Snapshot at End} = (\text{Prefix Trash}) \oplus (\text{Target Window})$$
$$\text{Snapshot before Start} = (\text{Prefix Trash})$$

$$\text{Combined} = [(\text{Prefix Trash}) \oplus (\text{Target Window})] \oplus (\text{Prefix Trash})$$

Because order doesn't matter in XOR, the two **Prefix Trash** histories smash into each other and completely cancel out:

$$\text{Combined} = [(\text{Prefix Trash}) \oplus (\text{Prefix Trash})] \oplus (\text{Target Window})$$
$$\text{Combined} = 0 \oplus (\text{Target Window})$$
$$\text{Combined} = \text{Target Window}$$

#### The Bottom Line
The computer doesn't need to count the window from scratch because **XOR perfectly vaporizes the history of the letters that came before your window started**, leaving you with the exact odd/even counts of only the characters inside your range.

#### Implementation Blueprint (Java)

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        // Stores odd/even frequency switches from s[0...i-1]
        int[] prefixMasks = new int[n + 1];
        
        int currentMask = 0;
        for (int i = 0; i < n; i++) {
            // Shift 1 by character index (0-25) and XOR to flip between odd (1) and even (0)
            currentMask ^= (1 << (s.charAt(i) - 'a'));
            prefixMasks[i + 1] = currentMask;
        }
        
        List<Boolean> ans = new ArrayList<>(queries.length);
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            int k = query[2];
            
            // Duplicate history before 'left' cancels to 0, isolating the window flags in O(1)
            int substringMask = prefixMasks[right + 1] ^ prefixMasks[left];
            
            // Count total bits set to 1 (characters with odd counts)
            int oddCount = Integer.bitCount(substringMask);
            
            // Each single replacement fixes 2 odd counts simultaneously
            ans.add(oddCount / 2 <= k);
        }
        return ans;
    }
}
```

1. [1177. Can Make Palindrome from Substring](https://leetcode.com/problems/can-make-palindrome-from-substring/)
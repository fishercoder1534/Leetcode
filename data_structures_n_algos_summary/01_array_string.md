# 01. Array & String

Arrays and strings are the foundational contiguous data structures in technical interviews. Mastering them requires knowing when to mutate arrays in-place for $O(1)$ space, how to avoid immutable `String` concatenation penalties in Java, and how to use ASCII character arithmetic to avoid extra data structure overhead.

---

## ⚡ Java Performance Note: `String` Immutability vs. `StringBuilder`

In Java, `String` objects are **immutable**. Concatenating strings inside a loop with `+` or `+=` creates a brand-new `String` object and copies all characters on every iteration, degrading an $O(N)$ algorithm into **$O(N^2)$ time and memory allocation**.

- **Always use `StringBuilder`** when building or modifying strings dynamically in a loop ($O(1)$ amortized `.append()`).
- **Use `char[]` (`s.toCharArray()`)** when you need frequent random-access index reads/writes or in-place swaps.

---

## 🔍 Core Array & String Patterns

### 1. Character Manipulation & Rotational Cipher
*(Consolidated in full from `character_manipulation_cipher.md`)*

#### Core Conceptual Framework
Character manipulation leverages the underlying numeric ASCII values of characters to perform arithmetic operations. By treating characters as their integer equivalents, you can efficiently execute positional shifts, boundary checks, and transformations without loading external dictionary mappings.

#### Fundamental Mechanics
- **ASCII Extraction (`c - 'a'`):** Subtracting the base character (e.g., `'a'` or `'A'`) from a given lowercase or uppercase letter maps it directly to a `0`-indexed integer array sequence (`0` for `'a'`, `1` for `'b'`, etc.).
- **Digit Conversion (`c - '0'`):** Converts numeric characters `'0'–'9'` into their integer values `0–9`.
- **Modular Shifting (`(index + rotation) % 26`):** Guarantees that structural boundaries wrap around seamlessly when a displacement factor exceeds the length of the alphabet sequence (or modulo `10` for digits).
- **Re-characterization (`+ 'a'`):** Adding the numeric offset back to the base character shifts the local integer code safely into its standardized ASCII placement prior to character instantiation.

#### Technical Implementations

##### A. Fundamental Snippets
A quick demonstration of converting a localized character to its relative indexing track, applying an active positional window displacement (`delta`), and re-establishing its structural character status:

```java
char c = 'b';

// This gives the ASCII code for this character; it's an integer offset from 'a' (Value: 1)
int asciiCode = c - 'a'; 

// This shifts the current character c to the right by delta distance as an integer ASCII code
int shiftedCharCode = c - 'a' + delta + 'a';

// This will convert the ASCII code back to a character / string structure
char shiftedChar = (char) shiftedCharCode;
String shiftedStr = Character.toString(shiftedCharCode);
```

##### B. Rotational Cipher Engine
A comprehensive validation paradigm handling distinct categorical subsets—including uppercase parameters, lowercase structures, numeric elements, and unmapped literal anchors:

```java
public class RotationalCipher {

    public String rotationalCipher(String input, int rotationFactor) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append((char) ((c - 'A' + rotationFactor) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                sb.append((char) ((c - 'a' + rotationFactor) % 26 + 'a'));
            } else if (Character.isDigit(c)) {
                sb.append((char) ((c - '0' + rotationFactor) % 10 + '0'));
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }

    public static void main(String... args) {
        RotationalCipher rotationalCipher = new RotationalCipher();
        
        // Example operational tracks
        char c = 'c';
        System.out.println(c - 'a' + 'a'); // Restores original ASCII value execution
        System.out.println((char)(c - 'a' + 'a'));
        System.out.println(c - 'a' + 3 + 'a'); // Processes raw integer offset positioning
        System.out.println((char)(c - 'a' + 3 + 'a'));
        
        // Comprehensive string transformation logic check
        System.out.println(rotationalCipher.rotationalCipher("Zebra-493?", 3)); 
        // Expected Output: Chedu-726?
    }
}
```

#### Concrete Logic Validation & Walkthrough
Using the input `"Zebra-493?"` paired with a rotation factor of `3`:

- **`'Z'` (Uppercase Bound):**
  $$'Z' - 'A' = 25$$
  $$(25 + 3) \pmod{26} = 2 \implies 2 + 'A' = 'C'$$
- **`'e'` (Lowercase Bound):**
  $$'e' - 'a' = 4$$
  $$(4 + 3) \pmod{26} = 7 \implies 7 + 'a' = 'h'$$
- **`'4'` (Numeric Digit Bound):**
  $$'4' - '0' = 4$$
  $$(4 + 3) \pmod{10} = 7 \implies 7 + '0' = '7'$$
- **`'-'` & `'?'` (Special Literal Bound):** Bypasses parsing tracks entirely; appends structural formatting directly to the output sequence.

---

### 2. Prefix & Suffix Product / Running State Accumulation
When an array problem asks for a result at index `i` that depends on all elements *except* `nums[i]` (and division is disallowed or zeros exist), compute cumulative states in two passes:
1. **Left-to-Right Pass:** Accumulate prefix products/sums before index `i`.
2. **Right-to-Left Pass:** Multiply/combine suffix products/sums after index `i` directly into the output array to achieve **$O(1)$ auxiliary space**.

#### Master Template: Product of Array Except Self (LeetCode 238)
```java
public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];

    // Pass 1: Store prefix products to the left of i
    int prefix = 1;
    for (int i = 0; i < n; i++) {
        result[i] = prefix;
        prefix *= nums[i];
    }

    // Pass 2: Multiply by suffix products to the right of i
    int suffix = 1;
    for (int i = n - 1; i >= 0; i--) {
        result[i] *= suffix;
        suffix *= nums[i];
    }

    return result;
}
```

---

### 3. In-Place Array Compression & Write-Pointer Technique
When modifying an array in-place (such as Run-Length Encoding in **LeetCode 443: String Compression**), separate your **read pointer** (scanning groups) from your **write pointer** (`writeIdx` tracking where the next compressed character/count goes). Because the compressed output is never longer than the original input, `writeIdx` never overwrites unread elements.

---

### 4. Mathematical & Greedy String Reductions
Before simulating string operations step by step, check for mathematical invariants:
- **String Divisibility (LeetCode 1071):** Two strings `str1` and `str2` share a common divisor string if and only if `(str1 + str2).equals(str2 + str1)`. When true, the largest divisor length is simply $\gcd(\text{len}_1, \text{len}_2)$.
- **Greedy Triplet Tracking (LeetCode 334):** To detect an increasing triplet subsequence in $O(N)$ time and $O(1)$ space, maintain only the smallest value seen so far (`first`) and the smallest second-element candidate (`second`).

---

## 🛠️ Quick Reference Complexity & Idioms

| Operation / Pattern | Optimal Java Idiom | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Dynamic String Building** | `StringBuilder` | $O(N)$ | $O(N)$ |
| **Lowercase Frequency Count** | `int[] freq = new int[26]` | $O(N)$ | $O(1)$ |
| **Circular Character Shift** | `(char) ((c - 'a' + k) % 26 + 'a')` | $O(1)$ per char | $O(1)$ |
| **Reverse Words / Subarrays** | `char[]` + two-pointer swap | $O(N)$ | $O(N)$ (or $O(1)$ on `char[]`) |
| **Prefix/Suffix Aggregation** | Two-pass reuse of output `int[]` | $O(N)$ | $O(1)$ auxiliary |

---

## 📝 Curated LeetCode 75 Practice Problems

| \# | Problem | Difficulty | Core Technique | Solution |
| :--- | :--- | :--- | :--- | :--- |
| **1768** | [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/) | Easy | Two-index `StringBuilder` merge | [`_1768.java`](../src/main/java/com/fishercoder/solutions/secondthousand/_1768.java) |
| **1071** | [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/) | Easy | String concatenation symmetry + GCD | [`_1071.java`](../src/main/java/com/fishercoder/solutions/secondthousand/_1071.java) |
| **1431** | [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/) | Easy | Single-pass max threshold check | [`_1431.java`](../src/main/java/com/fishercoder/solutions/secondthousand/_1431.java) |
| **605** | [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/) | Easy | Greedy boundary-safe array scan | [`_605.java`](../src/main/java/com/fishercoder/solutions/firstthousand/_605.java) |
| **345** | [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) | Easy | `char[]` converging swaps | [`_345.java`](../src/main/java/com/fishercoder/solutions/firstthousand/_345.java) |
| **151** | [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/) | Medium | Trim, split/scan, reverse `StringBuilder` | [`_151.java`](../src/main/java/com/fishercoder/solutions/firstthousand/_151.java) |
| **238** | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | Two-pass prefix & suffix accumulation | [`_238.java`](../src/main/java/com/fishercoder/solutions/firstthousand/_238.java) |
| **334** | [Increasing Triplet Subsequence](https://leetcode.com/problems/increasing-triplet-subsequence/) | Medium | Greedy two-threshold state tracking | [`_334.java`](../src/main/java/com/fishercoder/solutions/firstthousand/_334.java) |
| **443** | [String Compression](https://leetcode.com/problems/string-compression/) | Medium | In-place read/write pointers | [`_443.java`](../src/main/java/com/fishercoder/solutions/firstthousand/_443.java) |
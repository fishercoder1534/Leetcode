# Computer Science Fundamentals

This file contains a collection of fundamental computer science concepts, hidden code traps, and essential paradigms discovered during algorithm design and debugging.

*(Note: Trap 1 — The Midpoint Mathematical Trap in Binary Search — has been migrated directly into `15_binary_search.md`.)*

---

## Trap: Multiplication Overflow & The Placement of `(long)`

When checking conditions like `factorA * factorB >= threshold`, it is common to assume that because `threshold` is defined as a 64-bit `long`, the programming language will automatically calculate the multiplication as a `long`. **This is a dangerous misconception.**

### The Trap: Evaluation Before Assignment

The compiler evaluates the arithmetic expression using the types of the operands *at that exact moment*. If both `factorA` and `factorB` are standard 32-bit integers (`int`), the runtime performs standard **32-bit integer multiplication** before considering the comparison context.

Imagine a scenario where:

* `factorA = 100,000`
* `factorB = 100,000`
* `threshold = 10,000,000,000L` (`long`)

1. **The Evaluation:** The code calculates `factorA * factorB`.
   $$100,000 \times 100,000 = 10,000,000,000$$
2. **The Numerical Truncation:** Because $10,000,000,000$ is far larger than the maximum `int` ($2,147,483,647$), the upper bits are completely chopped off (truncated) to fit back into a 32-bit allocation. The value wraps around to **$1,410,065,408$**.
3. **The Comparison:** The system then compares this truncated `int` to your `long` threshold:
   $$1,410,065,408 \geq 10,000,000,000 \implies \text{FALSE}$$

Even though the real mathematical product ($10^{10}$) meets or exceeds the threshold, the truncated value causes the conditional check to fail silently without throwing an exception.

### The Fix: Pre-evaluation Type Casting

To prevent truncation, you must force the runtime to treat the numbers as 64-bit `long` values **before** the multiplication takes place.

* **Wrong:** `(long)(factorA * factorB)`
  *(The multiplication still happens in 32-bit integer space first, truncating the value before it is cast).*
* **Correct:** `(long)factorA * factorB` or `(long)factorB * factorA`
  *(By casting at least one of the variables to a `long` first, the compiler promotes the entire expression to a 64-bit operation. The multiplication safely preserves the large value without overflow).*

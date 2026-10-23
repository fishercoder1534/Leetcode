## Backtracking

### Overview

* **Backtracking** is an algorithmic technique for solving problems recursively by trying to build a solution
  incrementally, one piece at a time, removing those choices that fail to satisfy the constraints of the problem at any
  point in time.
* It systematically searches the solution space by building a state, exploring branches down a state-space tree, and
  then reverting the choice when hitting a dead end.
* It typically employes DFS (Depth-First Search) strategy.
* **Core Components:**
    * **Choice:** The decision made at the current step (e.g., adding a letter, placing a piece).
    * **Constraints:** Rules that validate whether the current path is worth pursuing.
    * **Goal:** The condition that defines a complete, valid solution.

#### General Pattern

```text
void backtrack(State state, Index/Step step, ResultContainer result) {
    if (goalReached(state)) {
        result.add(new Solution(state));
        return;
    }

    for (Choice choice : availableChoices) {
        if (isValid(choice)) {
            state.make(choice);       // 1. CHOOSE
            backtrack(state, step + 1, result); // 2. EXPLORE
            state.undo(choice);       // 3. BACKTRACK (Undo Choice)
        }
    }
}
```

### Example: Letter Combinations of a Phone Number

* Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could
  represent.
* **State Management:** A single shared `StringBuilder` acts as the path.
* **Undo Step:** The explicit backtracking step happens when deleting the last appended character before moving to the
  next iteration of the loop.

#### Java

```java
public class Solution {
    private static final String[] DIGITS_TO_LETTERS = new String[]{
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder path, List<String> result) {
        // Goal Reached
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = DIGITS_TO_LETTERS[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);

            path.append(letter); // 1. Make a choice

            backtrack(digits, index + 1, path, result); // 2. Explore

            path.deleteCharAt(path.length() - 1); // 3. BACKTRACK (Undo the choice)
        }
    }
}
```

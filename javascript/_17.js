function letterCombinations(digits) {
  // If the input is an empty string, return an empty array.
  if (digits.length === 0) {
      return [];
  }

  // Mapping of digits to letters as per the telephone keypad using a javascript dictionary.
  const digitToChar = {
      '2': ['a', 'b', 'c'],
      '3': ['d', 'e', 'f'],
      '4': ['g', 'h', 'i'],
      '5': ['j', 'k', 'l'],
      '6': ['m', 'n', 'o'],
      '7': ['p', 'q', 'r', 's'],
      '8': ['t', 'u', 'v'],
      '9': ['w', 'x', 'y', 'z']
  };

  // Resultant array to store all possible combinations
  const result = [];

  // Backtracking function to generate combinations
  function backtrack(index, currentCombination) {
      // if the current combination has the same length as the input digits.
      if (index === digits.length) {
          result.push(currentCombination);
          return;
      }

      // Get the letters that the current digit maps to.
      let letters = digitToChar[digits[index]];

      // Loop through the letters and call backtrack recursively for the next digit.
      for (let letter of letters) {
          backtrack(index + 1, currentCombination + letter);
      }
  }

  // Start backtracking from the first digit (index 0) with an empty string as the initial combination.
  backtrack(0, '');

  return result;
};

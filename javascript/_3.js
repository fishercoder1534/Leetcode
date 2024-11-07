function lengthOfLongestSubstring(s) {
  // Using the "sliding window" data structure.
  // Create a javascript set to store unique characters.
  let charSet = new Set();
  let left = 0; // Left pointer of the sliding window.
  let maxLength = 0;

  // This moves the right pointer of the sliding window.
  for (let right = 0; right < s.length; right++) {
      // If the character at the right pointer is already in the set, move the left pointer.
      while (charSet.has(s[right])) {
          charSet.delete(s[left]);
          left++;
      }
      // Add the current character at the right pointer to the set.
      charSet.add(s[right]);

      // Update the maximum length of substring without repeating characters.
      maxLength = Math.max(maxLength, right - left + 1);
  }

  return maxLength;
}
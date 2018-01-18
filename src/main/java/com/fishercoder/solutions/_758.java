package com.fishercoder.solutions;

/**
 * 758. Bold Words in String
 *
 * Given a set of keywords words and a string S, make all appearances of all keywords in S bold. Any letters between <b> and </b> tags become bold.
 * The returned string should use the least number of tags possible, and of course the tags should form a valid combination.
 * For example, given that words = ["ab", "bc"] and S = "aabcd", we should return "a<b>abc</b>d".
 * Note that returning "a<b>a<b>b</b>c</b>d" would use more tags, so it is incorrect.

 Note:

 words has length in range [0, 50].
 words[i] has length in range [1, 10].
 S has length in range [0, 500].
 All characters in words[i] and S are lowercase letters.

 */

public class _758 {
  public static class Solution1 {
    /**Interestingly, this problem is exactly the same as 616, using 616's code could get it AC'ed.*/
    public String boldWords(String[] words, String S) {
      boolean[] shouldBold = new boolean[S.length()];
      for (int i = 0, end = 0; i < S.length(); i++) {
        for (String word : words) {
          if (S.startsWith(word, i)) {
            end = Math.max(end, i + word.length());
          }
        }
        shouldBold[i] = end > i;
      }
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < S.length(); i++) {
        if (!shouldBold[i]) {
          stringBuilder.append(S.charAt(i));
          continue;
        }
        int j = i;
        while (j < S.length() && shouldBold[j]) {
          j++;
        }
        stringBuilder.append("<b>" + S.substring(i, j) + "</b>");
        i = j - 1;
      }
      return stringBuilder.toString();
    }
  }
}

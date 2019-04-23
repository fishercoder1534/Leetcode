package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1023. Camelcase Matching
 *
 * A query word matches a given pattern if we can insert lowercase letters to the pattern word so that it
 * equals the query. (We may insert each character at any position, and may insert 0 characters.)
 *
 * Given a list of queries, and a pattern, return an answer list of booleans,
 * where answer[i] is true if and only if queries[i] matches the pattern.
 *
 * Example:
 * queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FB"
 * Output: [true,false,true,true,false]
 *
 * queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBaT"
 * Output: [false,true,false,false,false]
 */

public class _1023 {

  public static class Solution1 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
      List<Boolean> res = new ArrayList<>();

      for (String s : queries) {
        res.add(match(s, pattern));
      }

      return res;
    }

    public boolean match(String s, String pattern) {
      char[] st = s.toCharArray();

      int i = 0;
      for (char c : pattern.toCharArray()) {
        while (i < st.length && st[i] != c) {
          if (Character.isUpperCase(st[i])) {
            return false;
          }
          ++i;
        }

        if (i == st.length) {
          return false;
        }
        ++i;
      }

      while (i < st.length) {
        if (Character.isUpperCase(st[i])) {
          return false;
        }
        ++i;
      }

      return true;
    }
  }
}

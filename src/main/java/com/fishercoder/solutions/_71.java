package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 71. Simplify Path

 Given an absolute path for a file (Unix-style), simplify it.

 For example,
 path = "/home/", => "/home"
 path = "/a/./b/../../c/", => "/c"

 Corner Cases:
 Did you consider the case where path = "/../"?
 In this case, you should return "/".
 Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 In this case, you should ignore redundant slashes and return "/home/foo".
 */
public class _71 {

  public static class Solution1 {
    public String simplifyPath(String path) {
      Deque<String> stack = new LinkedList<>();
      Set<String> skipSet = new HashSet<>(Arrays.asList("..", ".", ""));
      for (String dir : path.split("/")) {
        if (dir.equals("..") && !stack.isEmpty()) {
          stack.pop();
        } else if (!skipSet.contains(dir)) {
          stack.push(dir);
        }
      }
      String result = "";
      for (String dir : stack) {
        result = "/" + dir + result;
      }
      return result.isEmpty() ? "/" : result;
    }
  }
}

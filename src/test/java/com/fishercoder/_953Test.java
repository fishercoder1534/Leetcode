package com.fishercoder;

import com.fishercoder.solutions._953;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _953Test {
  private static _953.Solution1 solution1;
  private static String[] words;
  private static String order;

  @BeforeClass
  public static void setup() {
    solution1 = new _953.Solution1();
  }

  @Test
  public void test1() {
    words = new String[] {"hello", "leetcode"};
    order = "hlabcdefgijkmnopqrstuvwxyz";
    assertEquals(true, solution1.isAlienSorted(words, order));
  }

  @Test
  public void test2() {
    words = new String[] {"word", "world", "row"};
    order = "worldabcefghijkmnpqstuvxyz";
    assertEquals(false, solution1.isAlienSorted(words, order));
  }

  @Test
  public void test3() {
    words = new String[] {"apple", "app"};
    order = "abcdefghijklmnopqrstuvwxyz";
    assertEquals(false, solution1.isAlienSorted(words, order));
  }
}

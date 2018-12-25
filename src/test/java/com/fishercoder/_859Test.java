package com.fishercoder;

import com.fishercoder.solutions._859;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _859Test {
  private static _859.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _859.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.buddyStrings("ab", "ba"));
  }

  @Test
  public void test2() {
    assertEquals(false, solution1.buddyStrings("ab", "ab"));
  }

  @Test
  public void test3() {
    assertEquals(true, solution1.buddyStrings("aa", "aa"));
  }

  @Test
  public void test4() {
    assertEquals(true, solution1.buddyStrings("aaaaaaabc", "aaaaaaacb"));
  }

  @Test
  public void test5() {
    assertEquals(false, solution1.buddyStrings("", "aa"));
  }

  @Test
  public void test6() {
    assertEquals(true, solution1.buddyStrings("aaa", "aaa"));
  }
}

package com.fishercoder;

import com.fishercoder.solutions._844;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _844Test {
  private static _844.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _844.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.backspaceCompare("ab#c", "ad#c"));
  }

  @Test
  public void test2() {
    assertEquals(true, solution1.backspaceCompare("ab##", "c#d#"));
  }

  @Test
  public void test3() {
    assertEquals(true, solution1.backspaceCompare("a##c", "#a#c"));
  }

  @Test
  public void test4() {
    assertEquals(false, solution1.backspaceCompare("a#c", "b"));
  }

}

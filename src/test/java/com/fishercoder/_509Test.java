package com.fishercoder;

import com.fishercoder.solutions._509;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _509Test {
  private static _509.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _509.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(1, solution1.fib(2));
  }

  @Test
  public void test2() {
    assertEquals(2, solution1.fib(3));
  }

  @Test
  public void test3() {
    assertEquals(3, solution1.fib(4));
  }

  @Test
  public void test4() {
    assertEquals(0, solution1.fib(0));
  }
}

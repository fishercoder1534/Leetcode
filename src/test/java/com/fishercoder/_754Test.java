package com.fishercoder;

import com.fishercoder.solutions._754;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _754Test {
  private static _754.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _754.Solution1();
  }

  @Test
  public void test4() {
    assertEquals(1, solution1.reachNumber(1));
  }

  @Test
  public void test2() {
    assertEquals(3, solution1.reachNumber(2));
  }

  @Test
  public void test1() {
    assertEquals(2, solution1.reachNumber(3));
  }

  @Test
  public void test3() {
    assertEquals(3, solution1.reachNumber(4));
  }

  @Test
  public void test5() {
    assertEquals(5, solution1.reachNumber(5));
  }

  @Test
  public void test6() {
    assertEquals(3, solution1.reachNumber(6));
  }

  @Test
  public void test7() {
    assertEquals(5, solution1.reachNumber(7));
  }

  @Test
  public void test8() {
    assertEquals(4, solution1.reachNumber(8));
  }

  @Test
  public void test9() {
    assertEquals(5, solution1.reachNumber(9));
  }

  @Test
  public void test10() {
    assertEquals(4, solution1.reachNumber(10));
  }

  @Test
  public void test11() {
    assertEquals(15, solution1.reachNumber(100));
  }

  @Test
  public void test12() {
    assertEquals(47, solution1.reachNumber(1000));
  }

  @Test
  public void test13() {
    assertEquals(143, solution1.reachNumber(10000));
  }

  @Test
  public void test14() {
    assertEquals(447, solution1.reachNumber(100000));
  }

  @Test
  public void test15() {
    assertEquals(1415, solution1.reachNumber(1000000));
  }

  @Test
  public void test16() {
    assertEquals(4472, solution1.reachNumber(10000000));
  }
}

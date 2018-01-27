package com.fishercoder;

import com.fishercoder.solutions._65;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _65Test {
  private static _65.Solution1 solution1;
  private static _65.Solution2 solution2;

  @BeforeClass
  public static void setup() {
    solution1 = new _65.Solution1();
    solution2 = new _65.Solution2();
  }

  @Test
  public void test1() {
    assertEquals(false, solution1.isNumber("1 a"));
    assertEquals(false, solution2.isNumber("1 a"));
  }

  @Test
  public void test2() {
    assertEquals(false, solution1.isNumber("4e+"));
    assertEquals(false, solution2.isNumber("4e+"));
  }

  @Test
  public void test3() {
    assertEquals(true, solution1.isNumber("005047e+6"));
    assertEquals(true, solution2.isNumber("005047e+6"));
  }

  @Test
  public void test4() {
    assertEquals(false, solution1.isNumber(".e10"));
    assertEquals(false, solution2.isNumber(".e10"));
  }

  @Test
  public void test5() {
    assertEquals(true, solution1.isNumber("2e10"));
    assertEquals(true, solution2.isNumber("2e10"));
  }

  @Test
  public void test6() {
    assertEquals(false, solution1.isNumber("abc"));
    assertEquals(false, solution2.isNumber("abc"));
  }

  @Test
  public void test7() {
    assertEquals(false, solution1.isNumber(" -."));
    assertEquals(false, solution2.isNumber(" -."));
  }

  @Test
  public void test8() {
    assertEquals(true, solution1.isNumber("+.8"));
    assertEquals(true, solution2.isNumber("+.8"));
  }

  @Test
  public void test9() {
    assertEquals(false, solution1.isNumber("."));
    assertEquals(false, solution2.isNumber("."));
  }

  @Test
  public void test10() {
    assertEquals(false, solution1.isNumber(".e1"));
    assertEquals(false, solution2.isNumber(".e1"));
  }

  @Test
  public void test11() {
    assertEquals(true, solution1.isNumber("0"));
    assertEquals(true, solution2.isNumber("0"));
  }

  @Test
  public void test12() {
    assertEquals(false, solution1.isNumber("0e"));
    assertEquals(false, solution2.isNumber("0e"));
  }

  @Test
  public void test13() {
    assertEquals(false, solution1.isNumber("6ee69"));
    assertEquals(false, solution2.isNumber("6ee69"));
  }

  @Test
  public void test14() {
    assertEquals(false, solution1.isNumber("+++"));
    assertEquals(false, solution2.isNumber("+++"));
  }

  @Test
  public void test15() {
    assertEquals(false, solution1.isNumber("0e"));
    assertEquals(false, solution2.isNumber("0e"));
  }

  @Test
  public void test16() {
    assertEquals(false, solution1.isNumber("e9"));
    assertEquals(false, solution2.isNumber("e9"));
  }

  @Test
  public void test17() {
    assertEquals(true, solution1.isNumber(" 0.1 "));
    assertEquals(true, solution2.isNumber(" 0.1 "));
  }

  @Test
  public void test18() {
    assertEquals(true, solution1.isNumber("46.e3"));
    assertEquals(true, solution2.isNumber("46.e3"));
  }

  @Test
  public void test19() {
    assertEquals(false, solution1.isNumber(".."));
    assertEquals(false, solution2.isNumber(".."));
  }

  @Test
  public void test20() {
    assertEquals(false, solution1.isNumber(".e1"));
    assertEquals(false, solution2.isNumber(".e1"));
  }

  @Test
  public void test21() {
    assertEquals(false, solution1.isNumber(".."));
    assertEquals(false, solution2.isNumber(".."));
  }

  @Test
  public void test22() {
    assertEquals(false, solution1.isNumber("1e."));
    assertEquals(false, solution2.isNumber("1e."));
  }

  @Test
  public void test24() {
    assertEquals(true, solution1.isNumber("-1."));
    assertEquals(true, solution2.isNumber("-1."));
  }

  @Test
  public void test25() {
    assertEquals(false, solution1.isNumber("6e6.5"));
    assertEquals(false, solution2.isNumber("6e6.5"));
  }
}

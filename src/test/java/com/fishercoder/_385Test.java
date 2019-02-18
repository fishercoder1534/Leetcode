package com.fishercoder;

import com.fishercoder.solutions._385;
import org.junit.BeforeClass;
import org.junit.Test;

public class _385Test {
  private static _385.Solution1 solution1;

  @BeforeClass
  public static void setUp() {
    solution1 = new _385.Solution1();
  }

  @Test
  public void test1() {
    solution1.deserialize("324");
  }

  @Test
  public void test2() {
    solution1.deserialize("[-1]");
  }

  @Test
  public void test3() {
    solution1.deserialize("[]");
  }

  @Test
  public void test4() {
    solution1.deserialize("[-1,-2]");
  }

  @Test
  public void test5() {
    solution1.deserialize("[-1,-2,[-3,-4,[5,[6,[7,8]]]]]");
  }

}

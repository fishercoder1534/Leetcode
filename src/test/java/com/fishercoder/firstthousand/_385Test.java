package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._385;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _385Test {
  private _385.Solution1 solution1;

  @BeforeEach
    public void setUp() {
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

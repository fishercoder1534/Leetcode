package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._944;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _944Test {
  private _944.Solution1 solution1;
  private static String[] A;

  @BeforeEach
    public void setUp() {
    solution1 = new _944.Solution1();
  }

  @Test
  public void test1() {
    A = new String[] {"cba", "daf", "ghi"};
    assertEquals(1, solution1.minDeletionSize(A));
  }

  @Test
  public void test2() {
    A = new String[] {"a", "b"};
    assertEquals(0, solution1.minDeletionSize(A));
  }

  @Test
  public void test3() {
    A = new String[] {"zyx", "wvu", "tsr"};
    assertEquals(3, solution1.minDeletionSize(A));
  }
}

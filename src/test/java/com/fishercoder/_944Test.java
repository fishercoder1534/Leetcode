package com.fishercoder;

import com.fishercoder.solutions._944;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _944Test {
  private static _944.Solution1 solution1;
  private static String[] A;

  @BeforeClass
  public static void setup() {
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

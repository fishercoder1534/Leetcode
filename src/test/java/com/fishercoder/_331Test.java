package com.fishercoder;

import com.fishercoder.solutions._331;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _331Test {
  private static _331.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _331.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
  }

  @Test
  public void test2() {
    assertEquals(false, solution1.isValidSerialization("1,#"));
  }

  @Test
  public void test3() {
    assertEquals(false, solution1.isValidSerialization("9,#,#,1"));
  }

  @Test
  public void test4() {
    assertEquals(false, solution1.isValidSerialization("1"));
  }

  @Test
  public void test5() {
    assertEquals(false, solution1.isValidSerialization("#,7,6,9,#,#,#"));
  }
}

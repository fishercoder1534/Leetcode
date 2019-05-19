package com.fishercoder;

import com.fishercoder.solutions._89;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _89Test {

  private static _89.Solution1 solution1;
  private static _89.Solution2 solution2;

  @BeforeClass
  public static void setup() {
    solution1 = new _89.Solution1();
    solution2 = new _89.Solution2();
  }

  @Test
  public void test1() {
    assertEquals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4), solution1.grayCode(3));
    assertEquals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4), solution2.grayCode(3));
  }
}
